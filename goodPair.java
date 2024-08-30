package array;

public class goodPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] nums = {1,2,3};
			int result= Goodpair(nums);
			System.out.println(result);
	}

	private static int Goodpair(int[] nums) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count=count+1;
				}
			}
		}
		return count;
	}

}
