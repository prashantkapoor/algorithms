package com.datastructure;

import java.util.NoSuchElementException;

public class QueueUsingArray {
	
	private int[] queue;
	private int headIndex;
	private int tailIndex=-1;
	
	public QueueUsingArray(int length){
		queue=new int[length];
	}
	
	public boolean add(int number) {
		if(tailIndex<queue.length)
			tailIndex++;
		else
			return false;
		queue[tailIndex]=number;
		return true;
	}
	
	//removes first el
	public int remove() {
		if(tailIndex==-1) {
			throw new NoSuchElementException();
		}else if(headIndex==tailIndex){
			int el=queue[headIndex];
			headIndex=0;
			tailIndex=-1;
			return el;
		}else {
			int el=queue[headIndex];
			headIndex++;
			return el;
		}
		
		
	}
	
	public int length() {
		return tailIndex-headIndex+1;
	}
	
	public static void main(String[] args) {
		QueueUsingArray q=new QueueUsingArray(12);
		
		q.add(2);
		
		q.remove();
		
		q.add(5);
		q.add(7);
		q.add(22);
		q.add(99);
		q.add(123);
		q.add(674);
		q.add(78);
		q.add(31);
		
		while(q.length()>0) {
			System.out.println(q.remove());
			
		}
		//System.out.println(q.remove());
		
		System.out.println(q.length());
		
		
		
		
	}
	

}
