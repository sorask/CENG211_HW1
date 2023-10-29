package ceng211.hw1;

public class SalaryManagement {

	static double calculateSalary(int seniority)
	{	
		double salary = .0;
		if (seniority >= 5)
			salary = 3000;
		else if (seniority >= 3)
			salary = 2500;
		else if (seniority >= 1)
			salary = 2000;
		else
			salary = 1500;
		
		return salary;
	}
	
	static double calculateCommision(int ShopAssistantId)
	{
		double commision = 0;
		double revenue = calculateTotalRevenuePerShopAssistan(ShopAssistantId);
		
		if (revenue > 7500)
			commision *= 0.03;
		else
			commision *= 0.01;
		
		return commision;
	}
	
	public static double calculateTotalRevenuePerShopAssistan(int ShopAssistantId)
	{
		double TotalRevenueOfShopAssistan = 0;
		for (int j = 0; j < SalesManagementApp.TRANSACTION_PER_SHOP_ASSISTANTS; ++j) {		
//			System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].toString());
			TotalRevenueOfShopAssistan += TransactionManagement.arrayOfTransactions[ShopAssistantId][j].totalPrice;
		}
		
//		System.out.println(ShopAssistantId + " " +TotalRevenueOfShopAssistan);
		
		return TotalRevenueOfShopAssistan;
	}	
		
}