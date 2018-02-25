import java.util.Scanner;

public class OPS {
	static Scanner sc;
	public static void main(String[] args) {
		System.out.println(" Enter the size of array : ");
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements ");

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();	
		}

		System.out.println("Menu");
		System.out.println("1.Insert in array ");
		System.out.println("2.Delete from array ");
		System.out.println("3.Search in array ");
		System.out.println("Enter choice: ");
		int choice = sc.nextInt();
		if ((choice<=3)&&(choice>0)){


			switch(choice){

			case 1:insert(arr);
			case 2:delete(arr);
			case 3:int n1=search(arr);
					if(n1==-1){
						System.out.println("Element not in array");
					}else{
						System.out.println("Element found at index "+n1);
					}
			}
		}
		else{
			System.out.println("Incorrect choice ");
		}


	}

	public static int[] insert(int arr[]){
		System.out.println("How many elements to insert ?");
		int insertElementNumber=sc.nextInt();
		int oldLength =arr.length;
		int newLength= arr.length+insertElementNumber;

		int[] arrt=new int[newLength];
		System.out.println("Enter elements to insert");

		for(int i=0;i<arr.length;i++){

			arrt[i]=arr[i];
		}

		for(int i=oldLength;i<newLength;i++)
		{
			arrt[i]= sc.nextInt();
		}

		for(int i=0;i<arrt.length;i++){

			System.out.println(arrt[i]);
		}

		return null;

	}
	public static int[] delete(int[] arr){
		System.out.println("enter element to delete?");
		int del =sc.nextInt();

		for (int i=0; i<arr.length; i++)
			if (arr[i] == del)
				arr[i]=-1;

		for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);
		}
		return null;

	}
	public static int search(int[] arr){

		System.out.println("Enter element to search>?");
		int element=sc.nextInt();

		for(int i=0;i<arr.length;i++){

			if (arr[i] == element)
				return i;
			else{
				continue;
			}
		}

		return -1;

	}

}
