package member.board.dao;

import org.apache.ibatis.annotations.Mapper;

import member.board.dto.MemDto;

@Mapper
public interface MemDao {

	int insertMem(MemDto dto);
}
