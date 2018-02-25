
public class BST {

	public int binarySearch(int[] arr, int low, int high,int key){
		
		if (high>=low){
				int mid =(high + low)/2;
				System.out.println(mid);
			if(arr[mid]==key){
				return mid;
			}else if(key<arr[mid]){
				return binarySearch(arr,low,mid-1,key);
			}else if(key>arr[mid]){
				return binarySearch(arr,mid+1,high,key);
			}
			
		}
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		BST ob = new BST();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 3;
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + 
                                                 result);
	}

}
