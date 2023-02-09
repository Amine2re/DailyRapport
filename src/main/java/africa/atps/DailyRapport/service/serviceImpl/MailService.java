package africa.atps.DailyRapport.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;


public interface MailService {
    public void sendEmail(String to, String subject, String content, boolean isMultipart, boolean isHtml);
}
