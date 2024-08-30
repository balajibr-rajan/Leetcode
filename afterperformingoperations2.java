package array;

public class afterperformingoperations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nums= {"++x","++x","++x","++x"};
		
		int result = afterperformingoperations2.answer(nums);
		System.out.println(result);
		}

	private static int answer(String[] operations) {
		// TODO Autoenerated method stub
		int x=0;
		for(int i=0;i<operations.length;i++) {
			
			if(operations[i] =="++x" || operations[i]=="x++")	
				x=x+1;
			else if (operations[i] =="--x" || operations[i]=="x--") 
				x=x-1;
			System.out.println(operations[i]);
			//System.out.println(x);
			}
		return x;
		
	}

}
