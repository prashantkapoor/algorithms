/*
 * package com.leetcode;
 * 
 * import java.util.Stack; //1628. Design an Expression Tree With Evaluate
 * Function public class ExpressionTree {
 * 
 * public static void main(String[] args) { TreeBuilder obj = new TreeBuilder();
 * //["4","2","+","3","5","1","-","*","+"] Node expTree = obj.buildTree(new
 * String[] {"4","2","+","3","5","1","-","*","+"}); int ans =
 * expTree.evaluate();
 * 
 * }
 * 
 * }
 *//**
	 * This is the interface for the expression tree Node. You should not remove it,
	 * and you can define some classes to implement it.
	 */
/*
 * 
 * abstract class Node { public abstract int evaluate(); // define your fields
 * here };
 * 
 * class Tree extends Node{ String val; Tree right; Tree left;
 * 
 * public Tree(String val){ this.val=val; }
 * 
 * public int evaluate(){ return traverseAndEvaluate(this); }
 * 
 * public int traverseAndEvaluate(Tree tree){
 * if(tree.left==null&&tree.right==null){ return Integer.parseInt(tree.val); }
 * if(tree.val.equals("/")){ return
 * (traverseAndEvaluate(tree.left))/(traverseAndEvaluate(tree.right)); }
 * if(tree.val.equals("*")){ return
 * (traverseAndEvaluate(tree.left))*(traverseAndEvaluate(tree.right)); }
 * if(tree.val.equals("+")){ return
 * (traverseAndEvaluate(tree.left))+(traverseAndEvaluate(tree.right)); }
 * if(tree.val.equals("-")){ return
 * (traverseAndEvaluate(tree.left))-(traverseAndEvaluate(tree.right)); } return
 * -1; }
 * 
 * 
 * }
 * 
 *//**
	 * This is the TreeBuilder class. You can treat it as the driver code that takes
	 * the postinfix input and returns the expression tree represnting it as a Node.
	 */
/*
 * 
 * class TreeBuilder { Node buildTree(String[] postfix) { int index=0; Tree
 * root=null; //boolean wasPrevOperand=false; Stack<Tree> stack=new
 * Stack<Tree>(); while(index<postfix.length){ if( !isOperand(postfix[index]) ){
 * stack.push(new Tree(postfix[index])); } else{ root=new Tree(postfix[index]);
 * root.right=stack.pop(); root.left=stack.pop(); stack.push(root); } index++; }
 * return stack.pop(); } public boolean isOperand(String s){ return
 * s.equals("/")||s.equals("*")||s.equals("+")||s.equals("-"); } };
 * 
 * 
 *//**
	 * Your TreeBuilder object will be instantiated and called as such: TreeBuilder
	 * obj = new TreeBuilder(); Node expTree = obj.buildTree(postfix); int ans =
	 * expTree.evaluate();
	 */