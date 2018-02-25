
public class QuickSort {
	//int[] arr ={15,22,13,27,12,10,20,25};
	public void quicksort(int[] arr,int low,int high){
		
		if (low<high){
			
			int pIndex = partition(arr,low,high);
			quicksort(arr,low,pIndex-1);
			quicksort(arr,pIndex+1,high);

		}

		
	}
	
	public int partition(int arr[],int low, int high ){
		int pIndex=low;
		int pivot = arr[high];
		
		for(int i=low;i<high;i++){
			
			if(arr[i]<=pivot){
				int temp =arr[i];
				arr[i]=arr[pIndex];
				arr[pIndex] =temp;
				pIndex =pIndex+1;
			}
		}
			int temp1 = arr[pIndex];
			arr[pIndex]=arr[high];
			arr[high]=temp1;
			
		return pIndex;
	}
	
	public static void main(String[] args) {
	
		int[] arr ={15,22,13,27,12,10,20,25};
		QuickSort ob = new QuickSort();
		ob.quicksort(arr,0,7);
		
		for(int i=0;i<8;i++){
			
			System.out.print(arr[i]+" ");
			
		}
		

	}

}
