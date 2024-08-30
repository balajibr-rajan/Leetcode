package array;

public class suffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int nums[]= {2,3,5,4,1,7};
		int[] result=suffle(nums,n);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
	}

	private static int[] suffle(int[] nums,int n) {
		// TODO Auto-generated method stub
		int [] result= new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			if(i%2==0)
			result[i]= nums[i/2]; 
			else
			result[i]=nums[i/2+n];	
			}
		return result;
	}}
