package member.board.dao;

import org.apache.ibatis.annotations.Mapper;

import member.board.dto.MemDto;

@Mapper
public interface MemDao {

	int insertMem(MemDto dto);
	String idCheck(String id);
	MemDto login(MemDto dto);
	int updateMem(MemDto dto);
	int deleteMem(String id);
}
