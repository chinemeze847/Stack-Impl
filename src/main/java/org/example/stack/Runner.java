package org.example.stack;

public class Runner {


	public static void main(String[] args){
		Stack  stack = new Stack();
		stack.push(5);
		stack.push(10);
		stack.push(20);
		stack.push(15);

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

		stack.display();
	}
}
