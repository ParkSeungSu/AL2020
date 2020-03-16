package com.hallaAL;

public class LinkedListStack {
	
	private Node top;
	
	private class Node{
		private Object data;
		private Node nextNode;
		
		Node(Object data){
			this.data=data;
			this.nextNode=null;
		}
	}
	
	
	//생성자
	public LinkedListStack() {
		this.top=null;
	}
	
	//isEmpty
	public boolean isEmpty() {
		return (top==null);
	}
	
	//push
	public void push(Object data) {
		Node newNode=new Node(data);
		newNode.nextNode=top;
		top=newNode;
	}
	//peek 
	public Object peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return top.data;
	}
	//pop
	public Object pop() {
		Object data=peek();
		top=top.nextNode;
		return data;
	}
	//show
	public void show() {
		System.out.println("LinkedListStack 내부");
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.nextNode;			
		}
	}
}
