package ceng211.hw1;

public class SalaryManagement {

	static double calculateSalary(int seniority)
	{	
		double salary = .0;
		if (seniority >= 5)
			salary = 3000.;
		else if (seniority >= 3)
			salary = 2500.;
		else if (seniority >= 1)
			salary = 2000.;
		else
			salary = 1500.;
		
		return salary;
	}
	
	static double calculateCommision(int ShopAssistantId)
	{
		double commision = 0;
		double revenue = calculateTotalRevenuePerShopAssistant(ShopAssistantId);
		
		if (revenue > 7500)
			commision = revenue * 0.03;
		else
			commision = revenue * 0.01;
		
		return commision;
	}
	
	static double calculateTotalRevenuePerShopAssistant(int ShopAssistantId)
	{
		double TotalRevenueOfShopAssistant = 0;
		for (int j = 0; j < SalesManagementApp.TRANSACTION_PER_SHOP_ASSISTANTS; ++j) {		
			TotalRevenueOfShopAssistant += TransactionManagement.arrayOfTransactions[ShopAssistantId][j].getTotalPrice();
		}
		
		return TotalRevenueOfShopAssistant;
	}	
		
}