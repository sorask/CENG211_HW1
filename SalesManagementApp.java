package ceng211.hw1;

public class SalesManagementApp {
	
	final static int NUMBER_OF_TRANSACTIONS = 1500;
	final static int TRANSACTION_PER_SHOP_ASSISTANTS = 15;
	
	public static FileIO files;
	
	static Product[] Products;
	static ShopAssistant[] ShopAssistants;
	
	public static TransactionManagement transactionManagement;
	
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
		
//		Transaction tmpTransaction1 = new Transaction(0);
//		System.out.println(tmpTransaction.getId());
//		System.out.println(tmpTransaction.arrayOfProducts[0].getName() + " " + tmpTransaction.arrayOfProducts[0].getId());
//		System.out.println(tmpTransaction.arrayOfQuantities[0]);
//		System.out.println(tmpTransaction.arrayOfProducts[1].getName() + " " + tmpTransaction.arrayOfProducts[1].getId());
//		System.out.println(tmpTransaction.arrayOfQuantities[1]);
//		System.out.println(tmpTransaction.arrayOfProducts[2].getName() + " " + tmpTransaction.arrayOfProducts[2].getId());
//		System.out.println(tmpTransaction.arrayOfQuantities[2]);
//		System.out.println(tmpTransaction.totalPrice);
//		System.out.println(tmpTransaction.transactionFee);
//		System.out.println(tmpTransaction1.toString());
		
//		int i = 0;
//		int j = 0;
		
		transactionManagement = new TransactionManagement();
		
//		Transaction tmpTransaction2 = transactionManagement.arrayOfTransactions[0][0];
//		Transaction tmpTransaction3 = transactionManagement.arrayOfTransactions[1][0];
//		System.out.println(tmpTransaction.getId());
//		System.out.println(tmpTransaction.arrayOfProducts[0].getName() + " " + tmpTransaction.arrayOfProducts[0].getId());
//		System.out.println(tmpTransaction.arrayOfQuantities[0]);
//		System.out.println(tmpTransaction.arrayOfProducts[1].getName() + " " + tmpTransaction.arrayOfProducts[1].getId());
//		System.out.println(tmpTransaction.arrayOfQuantities[1]);
//		System.out.println(tmpTransaction.arrayOfProducts[2].getName() + " " + tmpTransaction.arrayOfProducts[2].getId());
//		System.out.println(tmpTransaction.arrayOfQuantities[2]);
//		System.out.println(tmpTransaction.totalPrice);
//		System.out.println(tmpTransaction.transactionFee);
//		System.out.println(tmpTransaction2.toString());
//		System.out.println(tmpTransaction3.toString());
		
//		for (int i = 0; i < ShopAssistant.NUMBER_OF_SHOP_ASSISTANS; ++i) {
//		for (int j = 0; j < TRANSACTION_PER_SHOP_ASSISTANTS; ++j) {
		double tmpTotalRevenue = 0;		
		for (int i = 0; i < 2; ++i) {
			double tmpTotalPrice = 0;
			for (int j = 0; j < TRANSACTION_PER_SHOP_ASSISTANTS; ++j) {		
				System.out.println(TransactionManagement.arrayOfTransactions[i][j].toString());
				tmpTotalPrice += TransactionManagement.arrayOfTransactions[i][j].totalPrice;
			}
//			System.out.println(i + " " +tmpTotalPrice);
			System.out.println(i + " " + SalaryManagement.calculateTotalRevenuePerShopAssistant(i));
			tmpTotalRevenue += tmpTotalPrice;
		}
		System.out.println(tmpTotalRevenue);
		
		for (int i = 0; i < ShopAssistant.NUMBER_OF_SHOP_ASSISTANS; ++i) {
			System.out.println(FileIO.ShopAssistants[i].toString());
			FileIO.ShopAssistants[i].setSales(SalaryManagement.calculateTotalRevenuePerShopAssistant(i));
			FileIO.ShopAssistants[i].setCommision(SalaryManagement.calculateCommision(i));
			FileIO.ShopAssistants[i].setSalary(SalaryManagement.calculateSalary(i));
			System.out.println(FileIO.ShopAssistants[i].toString());
		}
	}
}
