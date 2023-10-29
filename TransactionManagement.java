package ceng211.hw1;

public class TransactionManagement {
	public Transaction[][] arrayOfTransactions;
	
	public TransactionManagement() {
		arrayOfTransactions = new Transaction[SalesManagementApp.NUMBER_OF_SALES_PERSON][SalesManagementApp.TRANSACTION_PER_SALES_PERSON];
//		arrayOfTransactions[0][0] = new Transaction(0);
		for (int i = 0; i < SalesManagementApp.NUMBER_OF_SALES_PERSON; i++) {
			for (int j = 0; j < SalesManagementApp.TRANSACTION_PER_SALES_PERSON; j++) {
				arrayOfTransactions[i][j] = new Transaction(i + j);
			}
		}
	}
}
