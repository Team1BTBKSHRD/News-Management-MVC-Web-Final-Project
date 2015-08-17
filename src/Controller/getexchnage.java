package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModelDTO.exchangeRateDTO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.gson.Gson;

/**
 * Servlet implementation class getexchnage
 */
@WebServlet("/getexchnage")
public class getexchnage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getexchnage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Document doc = Jsoup.connect("http://www.acledabank.com.kh/kh/khm/").get();
		
	      Elements table = doc.select("table tr");
	      ArrayList<exchangeRateDTO> e=new ArrayList<exchangeRateDTO>();
	      exchangeRateDTO r=null;
	      Element t=null;
	      for (int i=1;i<table.size();i++){
	    	  t=table.get(i);
	          Elements td=t.select("td");
	          r=new exchangeRateDTO();
	          r.setCurrency(td.get(0).text());
	          r.setBid(td.get(1).text());
	          r.setAsk(td.get(2).text());
	          e.add(r);
	      }
	      response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
	      
		String obj = new Gson().toJson(e);
		
		response.getWriter().write(obj);
		
		
	}

}
