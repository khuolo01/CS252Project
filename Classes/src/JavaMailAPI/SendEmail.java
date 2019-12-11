package JavaMailAPI;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {

    private String USER_NAME = "cs252javaprojectluther";
    private String PASSWORD = "Bangfish";
    private String RECIPIENT;
    private String subject;
    private String message;

    public SendEmail(String recipient, String subject, String message){
    	this.RECIPIENT = recipient;
    	this.subject = subject;
    	this.message = message;
    }

    public void sendFromGMail() {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", USER_NAME);
        props.put("mail.smtp.password", PASSWORD);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(USER_NAME));
            InternetAddress toAddress = new InternetAddress(RECIPIENT);
            message.addRecipient(Message.RecipientType.TO, toAddress);
            message.setSubject(this.subject);
            message.setText(this.message);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, USER_NAME, PASSWORD);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}
