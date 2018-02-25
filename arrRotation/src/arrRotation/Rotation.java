package arrRotation;

import java.util.Arrays;
import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		
		int[] arr = new int[5];	
		System.out.println("Enter 5 elements of array");
		Scanner sc= new Scanner(System.in);

		for (int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int d=2;
		for(int i=0;i<d;i++){
			
			rotationArray(arr);
			
		}
		
	}

	public static void rotationArray(int[] arr){
		
		int temp = arr[0];
		
		for(int i=0;i<arr.length-1;i++){
		arr[i]=arr[i+1];
		
		}
		arr[arr.length-1]=temp;
		//arr[arr.length]=temp;
		
		System.out.println("here");
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}
	}

}
