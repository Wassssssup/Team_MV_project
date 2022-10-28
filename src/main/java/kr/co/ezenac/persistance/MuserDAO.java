package kr.co.ezenac.persistance;

import java.util.List;

import kr.co.ezenac.model.MuserVO;


public interface MuserDAO {
	public List<MuserVO> list(String mrank) throws Exception;
	public void insert(MuserVO vo) throws Exception;
	public void delete(String mrank) throws Exception;
}
