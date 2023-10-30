package ceng211.hw1;

import java.util.Random;

public class ShopAssistant {
	
	public final static int NUMBER_OF_SHOP_ASSISTANS = 100;
	
	private int id;
	private String name;
	private String surname;
	private String phoneNumber;
	private int seniority;
	private double weeklyBasedSalary;
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
		weeklyBasedSalary = .0;
		salary = .0;
		sales = .0;
		commision = .0;
	}

	public ShopAssistant (int id, String name, String surname, String phoneNumber)
	{
		Random random = new Random();
		
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.seniority = random.nextInt(26);
		this.weeklyBasedSalary = .0;;
		this.salary = .0;
		this.sales = .0;
		this.commision = .0;		
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

	public void setWeeklyBasedSalary(double weeklyBasedSalary)
	{
		this.weeklyBasedSalary = weeklyBasedSalary;
	}
	
	public double getWeeklyBasedSalary()
	{
		return this.weeklyBasedSalary;
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

	public double getCommision()
	{
		return this.commision;
	}
	
    public String toString() {
        return this.id + " " + this.name + " " + this.surname + " " + this.phoneNumber+ " " + this.seniority+ " " + this.weeklyBasedSalary + " " + this.salary+ " " + this.sales+ " " + this.commision;
    }
}

