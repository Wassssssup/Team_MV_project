package kr.co.ezenac.mapper;

import org.apache.ibatis.annotations.Insert;

import kr.co.ezenac.model.MovieDTO;

public interface MovieMapper {
	
	//DB등록
	
	@Insert("insert into MV_info(seq,MV_name,MV_rank,MV_poster,MV_open_date,MV_age,MV_rate) values (#{seq},#{movieTitle},#{rank},#{img},#{movieOpenDate},#{movieAge},#{MV_rate}")
	void addMovieInfo(MovieDTO writeMovieDTO);
}
