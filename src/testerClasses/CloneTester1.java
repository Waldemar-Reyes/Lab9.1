package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;

public class CloneTester1 {
	public static void main(String args[]){
		/** LinkedTree **/
		System.out.println("------------------------------------");
		System.out.println("----- LinkedTree with elements -----");
		//Original LinkedTree (from Utils)
		LinkedTree<Integer> t1 = new LinkedTree<>();
		t1 = Utils.buildExampleTreeAsLinkedTree();
		Utils.displayTree("Original Tree:", t1);
		//Cloned LinkedTree
		LinkedTree<Integer> cloneTree1 = null;
		try {
			cloneTree1 = t1.clone();
			Utils.displayTree("Cloned Tree:", cloneTree1);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\n----- Empty LinkedTree -----");
		//Original empty LinkedTree
		LinkedTree<Integer> t2 = new LinkedTree<>();
		Utils.displayTree("Original Tree:", t2);
		//Cloned empty LinkedTree
		LinkedTree<Integer> cloneTree2 = null;
		try {
			cloneTree2 = t2.clone();
			Utils.displayTree("Cloned Tree:", cloneTree2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		/** LinkedBinaryTree **/
		System.out.println("\n\n------------------------------------------");
		System.out.println("----- LinkedBinaryTree with elements -----");
		//Original LinkedBinaryTree (from Utils)
		LinkedBinaryTree<Integer> t3 = new LinkedBinaryTree<>();
		t3 = Utils.buildExampleTreeAsLinkedBinaryTree();
		Utils.displayTree("Original Tree:", t3);
		//Cloned LinkedBinaryTree
		LinkedBinaryTree<Integer> cloneBinaryTree1 = null;
		try {
			cloneBinaryTree1 = t3.clone();
			Utils.displayTree("Cloned Tree:", cloneBinaryTree1);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\n----- Empty LinkedBinaryTree -----");
		//Original empty LinkedBinaryTree
		LinkedBinaryTree<Integer> t4 = new LinkedBinaryTree<>();
		Utils.displayTree("Original Tree:", t4);
		//Cloned empty LinkedBinaryTree
		LinkedBinaryTree<Integer> cloneBinaryTree2 = null;
		try {
			cloneBinaryTree2 = t4.clone();
			Utils.displayTree("Cloned Tree:", cloneBinaryTree2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}