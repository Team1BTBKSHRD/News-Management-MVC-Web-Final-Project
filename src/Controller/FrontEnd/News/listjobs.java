package Controller.FrontEnd.News;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import Controller.FrontEnd.Action;
import Model.DTO.jobDTO;

import com.google.gson.Gson;

public class listjobs implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Document document = Jsoup.connect("http://www.bongthom.com/Jobs/ipgejobslist.asp").timeout(10000).get();
		Elements table = document.select("table#tblList tr");
		ArrayList<jobDTO> joblist = new ArrayList<jobDTO>();
		jobDTO job = null;
		String Title = "";
		String closingDate = "";
		String Category = "";
		String CompanyName = "";
		for(int i=1; i<table.select("tr").size(); i++){
			job=new jobDTO();
			Title = table.select("tr").get(i).select("td.JobsCol").get(1).text();
			CompanyName = table.select("tr").get(i).select("td.JobsCol").get(2).text();
			closingDate = table.select("tr").get(i).select("td.JobsCol").get(3).text();
			Category = table.select("tr").get(i).select("td.JobsCol").get(4).text();
			job.setTitle(Title);
			job.setCompany(CompanyName);
			job.setCloseDate(closingDate);
			job.setCategory(Category);
			joblist.add(job);
		}
		 response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
	      
		String obj = new Gson().toJson(joblist);
		System.out.println(obj);
		response.getWriter().write(obj);
	}
}
