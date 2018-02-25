package p;

import java.util.*;

public class LinkedList {
	
	Node head;
	
	private static class Node
	{
	   private int data;
	   private Node next;

	   public Node(int data)
	   {
	      this.data = data;
	      this.next = next;
	   }
	}
	
	public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
	
	public void append(int new_data){
		
		Node new_node = new Node(new_data);
	
		Node last = head;
		
		while (last.next!=null){
			
			last =last.next;
		}
		last.next =new_node;
		new_node.next=null;
		return;
	}
	
	public void insertAfter(Node prev_node, int data){
		
		if (prev_node==null){
			
			System.out.print("WRONG");

		}
		
		Node new_node = new Node(5);
		
		new_node.next =prev_node.next;
		
		prev_node.next =new_node;
		return;
	}
	
	public void reverse(Node node){
		Node prev=null;
		Node curr =null;
		curr =node;
		Node n=null;
		
		while (curr!=null){
			n =curr.next;
			curr.next =prev;
			prev =curr;
			curr=n;
		}
			
			
		}
		
		
		
		
	}
	
	
	public void deleteNode(int key){
		Node temp=null;
		Node prev =null;
		temp =head;
		
		while(temp.next!=null && temp.data !=key){
			prev =temp;
			prev.next= temp;
			
		}
		
		if(temp.data==key){
			
			prev.next=temp.next;
			
		}
		return;
	}
	
	public static void main(String args[]) {
		
		LinkedList llist = new LinkedList();
		 
        llist.head       = new Node(1);
        Node second      = new Node(2);
        Node third       = new Node(3);
 
        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node
        llist.append(4);
        llist.insertAfter(llist.head, 5);
        llist.deleteNode(3);
        llist.printList();
		

		//char[] ch2 = s2.toCharArray();
	}

}
