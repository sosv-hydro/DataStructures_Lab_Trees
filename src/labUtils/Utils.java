package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		t.addRoot(4);
		
		Position<Integer> grandChild9 = t.addChild(t.root(), 9);
		t.addChild(grandChild9, 7);
		t.addChild(grandChild9, 10);
		
		Position<Integer> grandChild20 = t.addChild(t.root(), 20);
		
		Position<Integer> grandChild15 = t.addChild(grandChild20, 15);
		t.addChild(grandChild15, 12);
		Position<Integer> grandChild17 = t.addChild(grandChild15, 17);
		t.addChild(grandChild17, 19);
	
		Position<Integer> grandChild21 = t.addChild(grandChild20, 21);
		Position<Integer> grandChild40 = t.addChild(grandChild21, 40);
		t.addChild(grandChild40, 30);
		t.addChild(grandChild40, 45);
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		t.addRoot(4);
		
		Position<Integer> grandChild9 = t.addLeft(t.root(), 9);
		t.addLeft(grandChild9, 7);
		t.addRight(grandChild9, 10);
		
		Position<Integer> grandChild20 = t.addRight(t.root(), 20);
		
		Position<Integer> grandChild15 = t.addLeft(grandChild20, 15);
		t.addLeft(grandChild15, 12);
		Position<Integer> grandChild17 = t.addRight(grandChild15, 17);
		t.addLeft(grandChild17, 19);
	
		Position<Integer> grandChild21 = t.addRight(grandChild20, 21);
		Position<Integer> grandChild40 = t.addRight(grandChild21, 40);
		t.addLeft(grandChild40, 30);
		t.addRight(grandChild40, 45);
		
		return t; 
	}


}
