package com.datastructure;


import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class TopViewOfBinaryTree {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    static Map<Integer,Boolean> mem=new HashMap<Integer,Boolean>();
	public static void topView(Node root) {
      
      printTop(root,0);
      
    }
    
    public static void printTop(Node root,int deviation){
    	
    	boolean isValid=false;
        boolean isLeftValid=true;
        boolean isRightValid=true;
        isValid=isLeftValid&&isRightValid;
        if(!mem.containsKey(deviation)){
            System.out.print(root.data+" ");
            mem.put(deviation,true);
        }
        if(root.left!=null){
            deviation--;
            printTop(root.left,deviation-1);
        }
        
        if(root.right!=null){
            deviation++;
            printTop(root.right,deviation);
        }
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}
