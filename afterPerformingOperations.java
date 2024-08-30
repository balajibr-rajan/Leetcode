package array;

import java.util.Scanner;

public class afterPerformingOperations {
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter size of array");
			int n = scanner.nextInt();
			
			System.out.println("Enter the values of array");
			String [] nums= new String[n];  
			for(int i=0;i<n;i++) 
				{nums[i]=scanner.nextLine();}
			
			int x=0;
			for(int i=0;i<nums.length;i++) {
				
				if(nums[i] =="++x" || nums[i]=="x++")	
					x=x+1;
				else if (nums[i] =="--x" || nums[i]=="x--") 
					x=x-1;
				System.out.println(nums[i]);
				System.out.println(x);
				}
			System.out.println(x);
			
			
	}
	}
