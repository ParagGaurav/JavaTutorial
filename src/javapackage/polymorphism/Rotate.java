package javapackage.polymorphism;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6,7};
		int d = 2;
		
		int n =arr.length;
		int j = 0;
		int temp[] = new int[n];
		for(int i=d;i<n;i++) {
			temp[j] = arr[i];
			j = j+1;
		}
		for(int i =0;i<d; i++) {
			temp[j] = arr[i];
			j = j+1;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(temp[i] + " ");
		}
		
	}

}
