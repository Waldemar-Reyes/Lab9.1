package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>();
		//root
		t.addRoot(4);
		//2nd layer
		Position<Integer> lC = t.addChild(t.root(), 9);
		Position<Integer> rC = t.addChild(t.root(), 20);
		//3rd layer
		t.addChild(lC, 7);
		t.addChild(lC, 10);
		Position<Integer> e15 = t.addChild(rC, 15);
		Position<Integer> e21 = t.addChild(rC, 21);
		//4th layer
		t.addChild(e15, 12);
		Position<Integer> e17 = t.addChild(e15, 17);
		Position<Integer> e40 = t.addChild(e21, 40);
		//5th layer
		t.addChild(e17, 19);
		t.addChild(e40, 30);
		t.addChild(e40, 45);
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		//root
		t.addRoot(4);
		//2nd layer
		Position<Integer> lC = t.addLeft(t.root(), 9);
		Position<Integer> rC = t.addRight(t.root(), 20);
		//3rd layer
		t.addLeft(lC, 7);
		t.addRight(lC, 10);
		Position<Integer> e15 = t.addLeft(rC, 15);
		Position<Integer> e21 = t.addRight(rC, 21);
		//4th layer
		t.addLeft(e15, 12);
		Position<Integer> e17 = t.addRight(e15, 17);
		Position<Integer> e40 = t.addRight(e21, 40);
		//5th layer
		t.addLeft(e17, 19);
		t.addLeft(e40, 30);
		t.addRight(e40, 45);
		
		return t; 
	}


}
