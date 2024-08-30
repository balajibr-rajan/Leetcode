package array;

public class richestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] accounts = {{1,2,3},{1,0,0}};
		int result = wealth(accounts);
		System.out.println(result);
		
	}

	private static int wealth(int [][] accounts) {
		int highestWealth =0;
		
		for(int i=0;i<accounts.length;i++) {
			int wealth=0;int wealth1=0;
		
		for(int j=0;j<accounts[i].length;j++) {
				wealth1 = accounts[i][j];
				wealth=wealth+wealth1;}
		
		if(wealth>=highestWealth) {
			highestWealth=wealth;}}
		return highestWealth;}
	}