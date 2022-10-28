package kr.co.ezenac.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ezenac.model.MovieDTO;

public class MVInfoController {
	
	@RequestMapping(value = "crawling.do", method = {RequestMethod.GET, RequestMethod.POST}, produces="text/plain;charset=UTF-8")
	public String getCrawling() {
		Document doc;
		String gson = "";
		
		try {
			
			doc = Jsoup.connect("http://www.cgv.co.kr/movies/").get();
			Elements MV_rank = doc.select(".rank");
			Elements MV_poster = doc.select(".thumb-image > img");
			Elements MV_age = doc.select(".ico-grade");
			Elements MV_name = doc.select("div.box-contents strong.title");
			Elements MV_rate = doc.select(".percent span");
			Elements MV_open_date = doc.select(".txt-info strong");
			
			List<MovieDTO> list = new ArrayList<MovieDTO>();
			
			for(int i = 0 ; i < MV_rank.size();i++) {
				String rank = MV_rank.get(i).text();
				String img = MV_poster.get(i).attr("src");
				String movieAge = MV_age.get(i).text();
				String movieTitle = MV_name.get(i).text();
				String movieRate = MV_rate.get(i).text();
				String movieOpenDate = MV_open_date.get(i).text();
				int seq = i;
				MovieDTO movieDto = new MovieDTO(rank, img, movieAge, movieTitle, movieRate, movieOpenDate, seq);
				
				list.add(movieDto);
			}
			/* gson = new Gson().toJson(list); */
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return gson;
	}
	
}
