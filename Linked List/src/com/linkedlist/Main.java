package com.linkedlist;

public class Main {

	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data=data;
			next=null;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Node head=new Node(1);
             Node second=new Node(2);
             Node third=new Node(3);
             
             
             head.next=second;
             second.next=third;
             
             System.out.println(""+head.next);
             System.out.println(""+second.next);
             System.out.println(""+third.next);
	}

}
