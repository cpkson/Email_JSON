package message.json;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.parknet.message.json.CreateEmail;

/**
 * Check that email generated is not null or empty
 * 
 * @author craigp
 * @version 0.1
 * @since 26/2/2015
 */
public class CreateEmailTest 
{
	@Test
	public void testBuild()
	{
		CreateEmail emailTest = new CreateEmail();
		assertNotSame("failure - empty string", "", emailTest.build());
		assertNotNull("failure - should not be null", emailTest.build());
	}
}
