package com.hallaAL;

public class Queue {
	private int front;
	private int rear;
	private int maxSize;
	private Object[] queue;
	//생성자
	public Queue(int maxSize) {
		
		this.maxSize = maxSize;
		this.front=0;
		this.rear=-1;
		this.queue = new Object[maxSize];
		
	}
	
	//isFull
	public boolean isFull() {
		return (rear==maxSize-1);
	}

	//isEmpty
	public boolean isEmpty() {
		return (front==rear+1);
	}
	
	//삽입
	public void insert(Object item) {
		if(isFull()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		queue[++rear]=item;
		
	}
	
	//큐의 맨 앞 반환
	public Object peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return queue[front];
		
	}
	
	//삭제
	public Object remove() {
		Object item=peek();
		front++;
		return item;
	}
	
	public void show() {
		System.out.println("큐 내부");
		for(int i=front;i<maxSize;i++) {
			System.out.println(queue[i]);
		}
	}
}
