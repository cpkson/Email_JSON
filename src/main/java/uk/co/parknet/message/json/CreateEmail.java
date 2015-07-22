package uk.co.parknet.message.json;

import java.util.ArrayList;

import uk.co.parknet.message.json.email.Attachment;

/**
 * Abstraction of and email that generates JSON.
 * @author craigp
 * @version 0.1
 * @since 22/1/2015
 */
public class CreateEmail
{
	private ArrayList<Attachment> attachments;
	private ArrayList<String> bcc;
	private ArrayList<String> cc;
	private ArrayList<String> from;
	private ArrayList<String> to;
	private String body;
	private String subject;
	private String email;
	
	/**
	 * 
	 */
	public CreateEmail()
	{
		attachments = new ArrayList<Attachment>();
		bcc = new ArrayList<String>();
		body = "";
		cc = new ArrayList<String>();
		from = new ArrayList<String>();
		subject = "";
		to = new ArrayList<String>();
		email = "";
	}
	
	/**
	 * 
	 * @param filename
	 * @param filepath
	 */
	public void addAttachment(String filename, String filepath)
	{
		Attachment attachment = new Attachment();
		attachment.setFilename(filename);
		attachment.setFilepath(filepath);
		attachments.add(attachment);
	}
	
	/**
	 * 
	 * @param emailAddress
	 */
	public void addBCC(String emailAddress)
	{
		bcc.add(emailAddress);
	}
	
	/**
	 * 
	 * @param emailAddress
	 */
	public void addCC(String emailAddress)
	{
		cc.add(emailAddress);
	}
	
	/**
	 * 
	 * @param emailAddress
	 */
	public void addFrom(String emailAddress)
	{
		from.add(emailAddress);
	}
	
	/**
	 * 
	 * @param emailAddress
	 */
	public void addTo(String emailAddress)
	{
		to.add(emailAddress);
	}
	
	/**
	 * 
	 * @return JSON
	 */
	public String build()
	{
		email = "{\"to\":[";
		for(int i = 0; i < to.size(); i++)
		{
			email += "\"" + to.get(i) + "\"";
			if(i!=(to.size()-1))
			{
				email += ",";
			}
		}
		email += "],\"cc\":[";
		for(int i=0; i < cc.size(); i++)
		{
			email += "\"" + cc.get(i) + "\"";
			if(i!=(cc.size()-1))
			{
				email += ",";
			}
		}
		email += "],\"bcc\":[";
		for(int i = 0; i < bcc.size(); i++)
		{
			email += "\"" + bcc.get(i) + "\"";
			if(i!=(bcc.size()-1))
			{
				email += ",";
			}
		}
		email += "],\"from\":[";
		for(int i = 0; i < from.size(); i++)
		{
			email += "\"" + from.get(i) + "\"";
			if(i!=(from.size()-1))
			{
				email += ",";
			}
		}
		email += "],\"subject\":\"" + subject + "\",";
		email += "\"body\":\"" + body + "\",";
		email += "\"attachments\":[";
		for(int i = 0; i < attachments.size(); i++)
		{
			email += "{\"filename\":\"" + attachments.get(i).getFilename() + "\","
					+ "\"path\":\"" + attachments.get(i).getFilepath() + "\"}";
			if(i!=(attachments.size()-1))
			{
				email += ",";
			}
		}
		email += "]}";
		return email;
	}
	
	/**
	 * 
	 * @param subject
	 */
	public void setSubject(String subject)
	{
		this.subject = subject;
	}
	
	/**
	 * 
	 * @param body
	 */
	public void setBody(String body)
	{
		this.body = body;
	}
}