
public class MyStack {
	StackNode top;
	private static class StackNode{
		
		private int data;
		private StackNode next;
		
		public StackNode (int data){
			this.data=data;
			
		}
		
	}
	
	public int maxmi(){
		int max=-1;
		StackNode k = null;
		k =top;
		while(k!=null){
			int t = k.data;
			
			if(t>max){
				max =t;
			}
			k =k.next;
		}
		
		return max;
	}
	
	public int pop(){
	
		if(top==null){
			System.out.println("null");
			return -1;
		}else{
			int item =top.data;
			top =top.next;
			return item;
			
		}
		
		
	}
	
	public void push(int item){
		StackNode n = new StackNode(item);
		n.next=top;
		top =n;
		
		
	}
	public int peek(){
		if(top==null){
			return -1;
		}
		else{
			return top.data;
		}
		
	}
	

	public static void main(String[] args) {
	
		MyStack my=new MyStack();
		my.top =new StackNode(3);
		StackNode n2 =new StackNode(2);
		StackNode n1 = new StackNode(1);
		
		my.top.next =n2;
		n2.next=n1;
		
		System.out.println("pop" + my.pop());
		//System.out.println("pop" + my.pop());
		my.push(4);
		System.out.println("peek" + my.peek());
		my.push(8);
		my.push(7);
		System.out.println("max is " + my.maxmi());
	}

}
