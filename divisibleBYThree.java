package array;

public class divisibleBYThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[] = {1,2,3,4};
		int count=0;
		for(int i =0;i<ar1.length;i++) {
			if(ar1[i]%3!=0) {
				count=count+1;}
		
		}
		System.out.println(count);
	}

}
