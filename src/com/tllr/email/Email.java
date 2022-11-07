package com.tllr.email;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email
{
         private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
          
  public static void main(String[] args) {
      Properties props = new Properties();
    /** Parâmetros de conexão com servidor Gmail */
    props.put("mail.smtp.host", "smtp.sendgrid.net");
    props.put("mail.smtp.socketFactory.port", "465");
props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "465");

    Session session = Session.getDefaultInstance(props,
      new javax.mail.Authenticator() {
           protected PasswordAuthentication getPasswordAuthentication()
           {
                 return new PasswordAuthentication("apikey","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");
           }
      });

    /** Ativa Debug para sessão */
    session.setDebug(true);

    try {

      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress("tiagofreitas85862@gmail.com"));
      //Remetente

      Address[] toUser = InternetAddress //Destinatário(s)
                 .parse("email");

      message.setRecipients(Message.RecipientType.TO, toUser);
      message.setSubject("Enviando email com JavaMail");//Assunto
      message.setText("Enviei este email utilizando JavaMail com minha conta GMail!");
   
      Transport.send(message);

      System.out.println("Feito!!!");

     } catch (MessagingException e) {
        throw new RuntimeException(e);
    }
  }
}