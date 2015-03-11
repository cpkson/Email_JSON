package main;

import main.message.json.CreateEmail;

public class Email 
{
	public static void main(String[] args)
	{
		CreateEmail em = new CreateEmail();
		em.addTo("testing@testing.com");
		em.addFrom("testing@testing.com");
		System.out.println(em.build());
	}
}
