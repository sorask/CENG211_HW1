package ceng211.hw1;

public class SalesManagementApp {
	
	final static int NUMBER_OF_TRANSACTIONS = 1500;
	final static int TRANSACTION_PER_SHOP_ASSISTANTS = 15;
	
	public static FileIO files;
	
//    private final static String PRODUCTS_FILE = "src\\ceng211\\hw1\\files\\products.csv";
//    private final static String SHOP_ASSISTANTS_FILE = "src\\ceng211\\hw1\\files\\shopAssistants.csv";
    
//    public static Product[] Products = new Product[NUMBER_OF_PRODUCTS];
	
	public static void main(String[] args) {
	
		files = new FileIO();
		
//		for (int i = 0;i < Product.NUMBER_OF_PRODUCTS; i++) {
//			System.out.println(FileIO.Products[i].toString());
//		}
		
//		for (int i = 0;i < ShopAssistant.NUMBER_OF_SHOP_ASSISTANS; i++) {
//			System.out.println(FileIO.ShopAssistants[i].toString());
//		}		
		
//		Transaction tmpTransaction = new Transaction(0);
//		System.out.println(tmpTransaction.getId());
//		System.out.println(tmpTransaction.arrayOfProducts[0].getName() + " " + tmpTransaction.arrayOfProducts[0].getId());
//		System.out.println(tmpTransaction.arrayOfQuantities[0]);
//		System.out.println(tmpTransaction.arrayOfProducts[1].getName() + " " + tmpTransaction.arrayOfProducts[1].getId());
//		System.out.println(tmpTransaction.arrayOfQuantities[1]);
//		System.out.println(tmpTransaction.arrayOfProducts[2].getName() + " " + tmpTransaction.arrayOfProducts[2].getId());
//		System.out.println(tmpTransaction.arrayOfQuantities[2]);
//		System.out.println(tmpTransaction.totalPrice);
//		System.out.println(tmpTransaction.transactionFee);
		
		int i = 1;
		int j = 1;
		TransactionManagement tmpTransactionManagement = new TransactionManagement();
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].getId());
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].arrayOfProducts[0].getName() + " " + tmpTransactionManagement.arrayOfTransactions[0][0].arrayOfProducts[0].getId());
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].arrayOfQuantities[0]);
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].arrayOfProducts[1].getName() + " " + tmpTransactionManagement.arrayOfTransactions[0][0].arrayOfProducts[1].getId());
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].arrayOfQuantities[1]);
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].arrayOfProducts[2].getName() + " " + tmpTransactionManagement.arrayOfTransactions[0][0].arrayOfProducts[2].getId());
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].arrayOfQuantities[2]);
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].totalPrice);
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].transactionFee);
	}
}
