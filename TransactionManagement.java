package ceng211.hw1;

public class TransactionManagement {
	
	public static Transaction[][] arrayOfTransactions;
	
	public TransactionManagement() {
		arrayOfTransactions = new Transaction[ShopAssistant.NUMBER_OF_SHOP_ASSISTANS][SalesManagementApp.TRANSACTION_PER_SHOP_ASSISTANTS];
		for (int i = 0; i < ShopAssistant.NUMBER_OF_SHOP_ASSISTANS; ++i) {
			for (int j = 0; j < SalesManagementApp.TRANSACTION_PER_SHOP_ASSISTANTS; ++j) {
				arrayOfTransactions[i][j] = new Transaction(i * SalesManagementApp.TRANSACTION_PER_SHOP_ASSISTANTS + j);
			}
		}
	}
}
