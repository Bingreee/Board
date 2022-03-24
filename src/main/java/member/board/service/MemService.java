package member.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import member.board.dao.MemDao;
import member.board.dto.MemDto;

@Service
public class MemService {
	
	@Autowired
	MemDao dao;
	
	public int insertMem(MemDto dto) {
		return dao.insertMem(dto);
	}
}
