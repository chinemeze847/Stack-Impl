package org.example.stack;


public class Stack {
	int capacity ;
	int[] stack ;

	int top;

	public Stack(){
		capacity = 2;
		stack = new int[capacity];
		top = 0;
	}

	public void push(int data)
	{
		if(top == capacity){
			expand();
		}
		stack[top] = data;
		top++;
	}

	public String pop()
	{
		if(isEmpty()){
			return "Array is empty";
		}
		else{
			int data = stack[top-1];
			stack[top-1] = 0;
			top--;
			return data + " ";
		}
	}

	public void expand(){
		int[] newArray = new int[size() * 2];
		System.arraycopy(stack,0,newArray,0,stack.length);
		stack = newArray;
	}

	public int size(){
		return stack.length;
	}

	public void display(){
		for(int member : stack){
			System.out.print(member + " ");
		}
	}

	public Boolean isEmpty(){
		return stack[top-1] <= 0;
	}
}

