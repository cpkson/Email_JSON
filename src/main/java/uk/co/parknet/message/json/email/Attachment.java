package uk.co.parknet.message.json.email;

/**
 * 
 * A class describing email attachments
 * 
 * @author craigp
 * @version 0.1
 * @since 22/1/2015
 * 
 */
public class Attachment 
{
	private String filename;
	private String filepath;
	
	/**
	 * Constructor
	 */
	public Attachment()
	{
		this.filename = "";
		this.filepath = "";
	}
	
	/**
	 * 
	 * @param filename
	 */
	public void setFilename(String filename)
	{
		this.filename = filename;
	}
	
	/**
	 * 
	 * @param filepath
	 */
	public void setFilepath(String filepath)
	{
		this.filepath = filepath;
	}
	
	/**
	 * 
	 * @return filename
	 */
	public String getFilename()
	{
		return this.filename;
	}
	
	/**
	 * 
	 * @return filepath
	 */
	public String getFilepath()
	{
		return this.filepath;
	}
}
