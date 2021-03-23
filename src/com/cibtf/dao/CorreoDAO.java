package com.cibtf.dao;

import java.io.File;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.cibtf.model.Empresa;



public class CorreoDAO {
	private String destinatarioSppt = "bolsaempleo.ad@gmail.com";
	
	public CorreoDAO() {
		
	}
	
	public String enviarCorreoDAOSppt(String asunto, String html) {
		
		Properties props = new Properties();
		props.setProperty("mail.smtp.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        
        Session session = Session.getDefaultInstance(props);
        
        String correoEnvia = "bolsaempleo.sppt@gmail.com";
        String contrasena = "xlkcyksxzxkeemwd";
        
        MimeMessage mail = new MimeMessage(session);
        
        MimeMultipart contenidoCorreo = new MimeMultipart();

        MimeBodyPart htmlContent = new MimeBodyPart();
        
        try {        
        	

			htmlContent.setContent(html, "text/html");
			contenidoCorreo.addBodyPart(htmlContent);
        	
            mail.setFrom(new InternetAddress (correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress (destinatarioSppt));
            mail.setSubject(asunto);
            mail.setContent(contenidoCorreo);
            
            
            Transport transportar = session.getTransport("smtp");
            transportar.connect(correoEnvia,contrasena);
            System.out.println("conectar");
            transportar.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));          
            transportar.close();
            
            
            
        } catch (AddressException ex) {
        	ex.printStackTrace();
            return "error";
            
        } catch (MessagingException ex) {
        	ex.printStackTrace();
            return "error";
            
        }
       
        return "done";
		
	}
	
	public void enviarCorreoDAO(String asunto, String html, String destinatario) {
		
		Properties props = new Properties();
		props.setProperty("mail.smtp.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        
        Session session = Session.getDefaultInstance(props);
        
        String correoEnvia = "bolsaempleo.sppt@gmail.com";
        String contrasena = "xlkcyksxzxkeemwd";
        
        MimeMessage mail = new MimeMessage(session);
        
        MimeMultipart contenidoCorreo = new MimeMultipart();

        MimeBodyPart htmlContent = new MimeBodyPart();

        try {
        	
			htmlContent.setContent(html, "text/html");
			contenidoCorreo.addBodyPart(htmlContent);
        	
            mail.setFrom(new InternetAddress (correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress (destinatario));
            mail.setSubject(asunto);
            mail.setContent(contenidoCorreo);
            
            Transport transportar = session.getTransport("smtp");
            transportar.connect(correoEnvia,contrasena);
            transportar.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));          
            transportar.close();
            
            
            
        } catch (AddressException ex) {
        	ex.printStackTrace();
        } catch (MessagingException ex) {
        	ex.printStackTrace();
        }
		
	}
	
	
	public String enviarCorreoCVDAO(String asunto, String destinatario, String mimeType, String html) {
		
		Properties props = new Properties();
		props.setProperty("mail.smtp.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        
        Session session = Session.getDefaultInstance(props);
        
        String correoEnvia = "bolsaempleo.sppt@gmail.com";
        String contrasena = "xlkcyksxzxkeemwd";
        
        MimeMessage mail = new MimeMessage(session);

        MimeMultipart contenidoCorreo = new MimeMultipart();

        MimeBodyPart htmlContent = new MimeBodyPart();
        
        BodyPart adjunto = new MimeBodyPart();

        
        try {
        	
    		String extension = "";
    		switch (mimeType) {
    			case "image/jpeg":
    			case "image/png":
    				extension = ".png";
    				break;
    			case "application/pdf":
    				extension = ".pdf";
    				break;
    			case "application/vnd.openxmlformats-officedocument.wordprocessingml.document":
    				extension = ".docx";
    				break;
    			default:
    				extension = ".unknow";
    				break;
    		}

    		String path = "C:\\Users\\Francisco\\Documents\\Eclipse\\Servicio\\WebContent\\documents\\cv"+extension;
    		//String path = "187.188.199.177:8086/CIBTF/cv"+extension;

			htmlContent.setContent(html, "text/html");
            adjunto.setDataHandler(new DataHandler(new FileDataSource(path)));
            adjunto.setFileName("cv"+extension);


        	contenidoCorreo.addBodyPart(htmlContent);
        	contenidoCorreo.addBodyPart(adjunto);
        	
        	
            mail.setFrom(new InternetAddress (correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress (destinatario));
            mail.setSubject(asunto);
            mail.setContent(contenidoCorreo);
            
            Transport transportar = session.getTransport("smtp");
            transportar.connect(correoEnvia,contrasena);
            transportar.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));          
            transportar.close();
            
            try {
        		File eliminarCV = new File(path);
        		eliminarCV.delete();
			} catch (Exception e) {
				System.out.println("URGENTE - Error Al Eliminar Fichero CV \nEl documento en la direccion "+path+"\nNo pudo ser eliminado correctamente, favor de atender de inmediato");
				enviarCorreoDAOSppt("URGENTE - Error Al Eliminar Fichero CV", "El documento en la direccion "+path+"\nNo pudo ser eliminado correctamente, favor de atender de inmediato");
			}

            
        } catch (AddressException ex) {
        	ex.printStackTrace();
        	return "error";
        } catch (MessagingException ex) {
        	ex.printStackTrace();
        	return "error";
        }
        
		return "done";
	}
	
	
	
	public String enviarCorreoNuevaEmpresa(String asunto, String html) {
		
		Properties props = new Properties();
		props.setProperty("mail.smtp.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        
        Session session = Session.getDefaultInstance(props);
        
        String correoEnvia = "bolsaempleo.sppt@gmail.com";
        String contrasena = "xlkcyksxzxkeemwd";
        
        MimeMessage mail = new MimeMessage(session);
        
        MimeMultipart contenidoCorreo = new MimeMultipart();

        MimeBodyPart htmlContent = new MimeBodyPart();
        
        try {        
        	

			htmlContent.setContent(html, "text/html");
			contenidoCorreo.addBodyPart(htmlContent);
        	
            mail.setFrom(new InternetAddress (correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress (destinatarioSppt));
            mail.setSubject(asunto);
            mail.setContent(contenidoCorreo);
            
            
            Transport transportar = session.getTransport("smtp");
            transportar.connect(correoEnvia,contrasena);
            System.out.println("conectar");
            transportar.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));          
            transportar.close();
            
            
            
        } catch (AddressException ex) {
        	ex.printStackTrace();
            return "error";
            
        } catch (MessagingException ex) {
        	ex.printStackTrace();
            return "error";
            
        }
       
        return "done";
		
	}
	

}
