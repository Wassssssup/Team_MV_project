package kr.co.ezenac.persistance;

import java.util.List;

import kr.co.ezenac.model.MovieVO;

public interface MovieDAO {
	public void insert(MovieVO vo) throws Exception;
	public List<MovieVO> list() throws Exception;
	public MovieVO read(String rank) throws Exception;
	public void delete(String rank) throws Exception;
}
