package com.hallaAL;

public class LinkedListQueue {
	
	private class Node{
		private Object data;
		private Node nextNode;
		
		Node(Object data){
			this.data=data;
			this.nextNode=null;
			
		}
		
	}
	
	private Node front;
	private Node rear;
	
	//생성자
	public LinkedListQueue() {
		this.front=null;
		this.rear=null;
	}
	
	//큐가 비어있는지 확인
	
	public boolean isEmpty() {
		return (front==null);
	}
	
	//data 룰 큐의 rear에 넣는다.
	public void insert(Object item) {
		
		Node node=new Node(item);
		node.nextNode=null;
		
		if(isEmpty()) {
			rear=node;
			front=node;
		}else {
			rear.nextNode=node;
			rear=node;
		}
	}
	//front 반환
	public Object peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return front.data;
	}
	
	//front를 큐에서 제거
	public Object remove() {
		
		Object data=peek();
		front=front.nextNode;
		
		if(front==null) {
			rear=null;
		}
		
		return data;
	}
	public void show() {
		System.out.println("LinkedListQueue 내부");
		Node temp=front;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.nextNode;
		}
	}
}
