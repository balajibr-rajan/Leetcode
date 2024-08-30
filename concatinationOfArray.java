package array;



public class concatinationOfArray {

public static void main(String[] args) {
		int ar1[] = {1,2,1};
		int ar2[] = new int[(ar1.length)*2];
		for(int i=0; i<ar1.length; i++) {
			ar2[i]=ar1[i];
			ar2[i+ar1.length]=ar1[i];}
			for(int j =0; j<ar2.length;j++) {
				System.out.print(ar2[j]);
			}}}
