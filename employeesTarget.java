package array;

public class employeesTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] hours = {0,1,2,3,4};
		int target = 2;
		int result = employeeHours(hours, target);
		System.out.println(result);
		int hour[]=hours.clone();
		System.out.println(hours.getClass().getName());
	}

	private static int employeeHours(int[] hours, int target) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<hours.length;i++) {
			if(hours[i]>=target) {
				count=count+1;
			}}	return count;
	}
	}
