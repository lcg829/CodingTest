package StackAndQueue;

import java.util.Stack;

/**
 * ���һ����getMin���ܵ�ջ
 * 1.pop, push, getMin������ʱ�临�Ӷȶ���O(1)
 * 2.��Ƶ�ջ���Ϳ���ʹ���ֳɵ�ջ�ṹ
 * 
 * �������ջ��һ����ͨջ��һ�������ʱ�ڵ���Сֵ
 */
public class GetMinStack {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public GetMinStack() {
		this.stackData = new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
	}
	
	public void push(int newNum) {
		if(this.stackMin.isEmpty() || newNum <= this.getMin()) {
			this.stackMin.push(newNum);
		}
		this.stackData.push(newNum);
	}
	
	public int pop() {
		if(this.stackData.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		int value = this.stackData.pop();
		if(value == this.getMin()) {
			this.stackMin.pop();
		}
		return value;
	}
	
	public int getMin() {
		if(this.stackMin.isEmpty()) {
			throw new RuntimeException("Your stack is empty");
		}
		return this.stackMin.peek();
	}
}
