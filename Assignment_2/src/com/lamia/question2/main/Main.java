package com.lamia.question2.main;

import com.lamia.question2.service.Node;
import com.lamia.question2.service.Service;

public class Main {

	public static void main(String[] args) {
		
		Service obj= new Service();
		Node node;
		
		node= new Node(50);
		node.left= new Node(30);
		node.right= new Node(60);
		node.left.left= new Node(10);
		node.right.left= new Node(55);
		
		Node rightSkewedTree= obj.completeBSTtoSkewed(node);
		System.out.println("the resultant output is:");
		obj.traverseRightSkewedTree(rightSkewedTree);


	}

}
