package member.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import member.board.service.MemService;

@Controller
public class MemController {
	
	@Autowired
	MemService mservice;
	
	@GetMapping("/insert")
	public String joinForm() {
		return "mem/joinForm";
	}
}
