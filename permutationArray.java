package array;

public class permutationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int nums[]= {5,0,1,2,3,4};
				int ans[] = answer(nums);
				for(int i=0;i<nums.length;i++) {
					System.out.print(ans[i]+" ");
				}
				
	}

	private static int[] answer(int[] nums) {
			int[] ans= new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			ans[i]=nums[nums[i]];
		}
		return ans;
		// TODO Auto-generated method stub
		
	}

}
