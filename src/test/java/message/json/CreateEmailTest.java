package message.json;

import static org.junit.Assert.*;
import co.uk.travelplaces.message.json.CreateEmail;

import org.junit.Test;

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
