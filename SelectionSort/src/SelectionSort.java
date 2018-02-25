
public class SelectionSort {

	public int[] sort(int[] list){
		
		int temp=0;
		int min=-1;
		for (int i=0;i<list.length;i++){
			min = list[i];
			
			for(int j=i;j<list.length;j++){
				
				if (list[j]<min){
					temp = min;
					min=list[j];
					list[j]=temp;
					temp=0;
				}else{
					continue;
				}
				
				
			}
		if(min<list[i]){
			
			temp = min;
			min=list[i];
			list[i]=temp;
			temp=0;
		}
			
			
		}
		
		return list;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list ={ 4,7,9,2,1};
		SelectionSort ss = new SelectionSort();
		int[] result = ss.sort(list);
		for(int i=0;i<result.length;i++){
			
			System.out.print(result[i] + " ");
		}
		

	}

}
