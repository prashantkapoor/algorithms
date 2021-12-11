package com.datastructure;

import java.util.NoSuchElementException;

public class CustomQueueUsingArray<E> {
	
	private E[] queue;
	private int headIndex;
	private int tailIndex=-1;
	
	public CustomQueueUsingArray(int length){
		queue=(E[]) new Object[length];
	}
	
	public boolean add(E obj) {
		if(tailIndex<queue.length)
			tailIndex++;
		else
			return false;
		queue[tailIndex]=obj;
		return true;
	}
	
	//removes first el
	public E remove() {
		if(tailIndex==-1) {
			throw new NoSuchElementException();
		}else if(headIndex==tailIndex){
			E el=queue[headIndex];
			headIndex=0;
			tailIndex=-1;
			return el;
		}else {
			E el=queue[headIndex];
			headIndex++;
			return el;
		}
		
		
	}
	
	public int length() {
		return tailIndex-headIndex+1;
	}
	
	public static void main(String[] args) {
		CustomQueueUsingArray<CustomQueueUsingArray.Animal> q=new CustomQueueUsingArray<CustomQueueUsingArray.Animal>(12);
		
		
		q.add(q.new Animal(4,true));
		
		q.remove();
		
		q.add(q.new Animal(2,true));
		q.add(q.new Animal(3,true));
		q.add(q.new Animal(6,true));
		q.add(q.new Animal(8,true));
		q.add(q.new Animal(9,true));
		q.add(q.new Animal(2,false));
		q.add(q.new Animal(5,true));
		
		while(q.length()>0) {
			System.out.println(q.remove());
			
		}
		//System.out.println(q.remove());
		
		System.out.println(q.length());
		
		
		
		
	}
	private class Animal{
		private int feet;
		boolean veg;
		
		public Animal(int feet,boolean veg) {
			this.feet=feet;
			this.veg=veg;
		}
	}
	

}
