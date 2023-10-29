package ceng211.hw1;

import java.util.Random;

public class ShopAssistant {
	
	public final static int NUMBER_OF_SHOP_ASSISTANS = 100;
	
	private int id;
	private String name;
	private String surname;
	private String phoneNumber;
	private int seniority;
	private double salary;
	private double sales;
	private double commision;
	
	public ShopAssistant ()
	{
		id = -1;
		name = "noname";
		surname = "noname";
		phoneNumber = "999-9999";
		seniority = 0;
	}

	public ShopAssistant (int id, String name, String surname, String phoneNumber)
	{
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.seniority = determineSeniority();
		this.sales = .0;
		this.commision = .0;		
		this.salary = .0;
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
	
	public int getSeniority()
	{
		return this.seniority;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	public void setSales(double sales)
	{
		this.sales = sales;
	}

	public void setCommision(double commision)
	{
		this.commision = commision;
	}
	
	public static int determineSeniority()
	{	
		Random random = new Random();
		return random.nextInt(6) + 1;			
	}
	
    public String toString() {
        return this.id + " " + this.name + " " + this.surname + " " + this.phoneNumber+ " " + this.seniority+ " " + this.sales+ " " + this.commision+ " " + this.salary;
    }
}

