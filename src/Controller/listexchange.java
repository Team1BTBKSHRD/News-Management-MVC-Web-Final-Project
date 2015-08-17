package Controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.gson.Gson;

import ModelDTO.exchangeRateDTO;

public class listexchange implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
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
