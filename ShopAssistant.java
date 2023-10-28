package ceng211.hw1;

public class ShopAssistant {
	private int id;
	private String name;
	private String surname;
	private String phoneNumber;
	private String seniority;
	
	public ShopAssistant ()
	{
		id = -1;
		name = "noname";
		surname = "noname";
		phoneNumber = "999-9999";
		seniority = "none";
	}

	public ShopAssistant (int id, String name, String surname, String phoneNumber, String seniority)
	{
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.seniority = seniority;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public int getId() 
	{
		return this.id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	public String getSurname()
	{
		return this.surname;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.name = phoneNumber;
	}
	
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	
	public void setSeniority(String seniority)
	{
		this.name = phoneNumber;
	}
	
	public String getSeniority()
	{
		return this.seniority;
	}
}

