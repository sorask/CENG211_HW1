package ceng211.hw1;

public class Query {
	public static Transaction theHighestTotalPriceTransaction()
	{
		Transaction maxTranscaction = new Transaction();
		maxTranscaction = TransactionManagement.arrayOfTransactions[0][0];
		double max = maxTranscaction.getTotalPrice();
		for (int i = 0; i < ShopAssistant.NUMBER_OF_SHOP_ASSISTANS; ++i) {
			for (int j = 0; j < SalesManagementApp.TRANSACTION_PER_SHOP_ASSISTANTS; ++j) {	
				if (max < TransactionManagement.arrayOfTransactions[i][j].getTotalPrice()) {
					max = TransactionManagement.arrayOfTransactions[i][j].getTotalPrice();
					maxTranscaction = TransactionManagement.arrayOfTransactions[i][j];
				}	
			}
		}
		return maxTranscaction;
	}
	
	public static Product theLowestTotalPriceTransactionWithTheMostExpensiveProduct()
	{
		Transaction minTranscaction = new Transaction();
		minTranscaction = TransactionManagement.arrayOfTransactions[0][0];
		double min = minTranscaction.getTotalPrice();
		for (int i = 0; i < ShopAssistant.NUMBER_OF_SHOP_ASSISTANS; ++i) {
			for (int j = 0; j < SalesManagementApp.TRANSACTION_PER_SHOP_ASSISTANTS; ++j) {	
				if (min > TransactionManagement.arrayOfTransactions[i][j].getTotalPrice()) {
					min = TransactionManagement.arrayOfTransactions[i][j].getTotalPrice();
					minTranscaction = TransactionManagement.arrayOfTransactions[i][j];
				}	
			}
		}
		
		Product[] products = new Product[Transaction.SIZE_OF_PRODUCS_ARRAY];
		products = minTranscaction.getProducts();
		Product maxProduct = new Product();
		double max = products[0].getPrice();
		for (int i = 0; i < Transaction.SIZE_OF_PRODUCS_ARRAY; i++)
			if (max < products[i].getPrice()) {
				max = products[i].getPrice();
				maxProduct = products[i];
			}	
		return maxProduct;
	}
	
	public static Transaction theLowestTransactionFee()
	{
		Transaction LowestTranscaction = new Transaction();
		LowestTranscaction = TransactionManagement.arrayOfTransactions[0][0];
		double lowest = LowestTranscaction.getTransactionFee();
		for (int i = 0; i < ShopAssistant.NUMBER_OF_SHOP_ASSISTANS; ++i) {
			for (int j = 0; j < SalesManagementApp.TRANSACTION_PER_SHOP_ASSISTANTS; ++j) {	
				if (lowest > TransactionManagement.arrayOfTransactions[i][j].getTransactionFee()) {
					lowest = TransactionManagement.arrayOfTransactions[i][j].getTransactionFee();
					LowestTranscaction = TransactionManagement.arrayOfTransactions[i][j];
				}	
			}
		}
		return LowestTranscaction;
	}
	
	public static ShopAssistant theHighestSalaryShopAssistant()
	{
		ShopAssistant maxShopAssistant = new ShopAssistant();
		maxShopAssistant = FileIO.ShopAssistants[0];
		double max = maxShopAssistant.getSalary();
		for (int i = 0; i < ShopAssistant.NUMBER_OF_SHOP_ASSISTANS; ++i) {
			if (max < FileIO.ShopAssistants[i].getSalary()) {
				max = FileIO.ShopAssistants[i].getSalary();
				maxShopAssistant = FileIO.ShopAssistants[i];
			}	
		}	
		return maxShopAssistant;
	}
}
