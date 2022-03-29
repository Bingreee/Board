package member.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import member.board.dto.CommDto;

@Mapper
public interface CommDao {

	int insertComm(CommDto dto);
	List<CommDto> selectComm(int no);
	int deleteComm(int cno);
}
