package member.board.service;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import member.board.dto.EmailVO;

@Service
public class EmailService {

	@Autowired
	protected JavaMailSender mailSender;
	
	public boolean sendMail(EmailVO email) throws Exception {
		
		try {
			MimeMessage msg = mailSender.createMimeMessage();
			msg.setSubject(email.getSubject());
			
			//일반 텍스만 전송하는 경우
			msg.setText(email.getContent());
			//html 전송하는 경우
			//msg.setContent("<a href='https://www.naver.com/'>클릭</a>", "text/html;charset=utf-8");
			
			msg.setRecipient(RecipientType.TO, new InternetAddress(email.getReceiver()));//수신자 setting
		
			mailSender.send(msg);
			
			return true;
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		return false;
	}
}
