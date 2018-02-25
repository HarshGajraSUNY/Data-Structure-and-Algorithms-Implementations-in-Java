
public class Q {
	
	Node head;
	Node tail;
	
	private static class Node{
		private int data;
		private Node next;
		
		
		public Node(int data){
			
			this.data=data;
			
		}
		
	}
	
	public int pop(){
		if (head==null){
			return -1;
		}else{
			int h =head.data;
			head=head.next;
			return  h;
		}
		
	}
	
	public void push(int data){
		Node n = new Node(data);
		
		tail.next=n;
		tail=n;
		
	}
	
	public int peek(){
		
		if (head==null){
			return -1;
		}else{
			
			return head.data;
		}
	}
		public int size(){
			Node n =head;
			int count=0;
			while(n!=null){
				count++;
				n=n.next;
				
			}
			return count;
		}
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		q.head=new Node(0);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		q.tail = new Node(3);
		
		q.head.next=n1;
		n1.next=n2;
		n2.next=q.tail;
				
		System.out.println("peek top head is "+q.peek());
		System.out.println("popped"+q.pop());
		System.out.println("peek top head is "+q.peek());
		q.push(5);
		q.push(6);
		System.out.println("peek"+ q.peek());
		System.out.println(q.size());
	}

}
