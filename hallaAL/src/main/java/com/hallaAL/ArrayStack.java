package com.hallaAL;

public class ArrayStack {
	private int top;
	private int maxSize;
	private Object[] stackArray;
	
	//생성자
	public ArrayStack(int maxSize) {
		this.maxSize=maxSize;
		this.stackArray=new Object[maxSize];
		this.top=-1;
		
	}
	//비어있는지 확인
	public boolean isEmpty(){
		return (top==-1);
	}
	//꽉 차있는지 확인
	public boolean isFull() {
		return (top==maxSize);
	}
	//push
	public void push(Object data) {
		if(isFull()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		stackArray[++top]=data;
	}
	//top data확인
	public Object peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		return stackArray[top];
		
	}
	//pop
	public Object pop() {
		Object data=peek();
		top--;
		
		return data;
	}
	//show 
	public void show() {
		System.out.println("ArrayStack 내부");
		for(int i=top;i>=0;i--) {
			System.out.println(stackArray[i]);
		}
	}
}

