package member.board.dto;

import lombok.Data;

@Data
public class EmailVO {

	private String subject;
	private String content;
	private String date;
	private String receiver;
}
