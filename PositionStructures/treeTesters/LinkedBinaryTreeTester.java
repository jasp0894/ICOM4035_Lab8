package treeTesters;

import positionInterfaces.Tree;
import positionTree.BTNode;
import positionTree.LinkedBinaryTree;
import positionTree.LinkedBinaryTreeBFS;
import positionTree.LinkedBinaryTreeBFS_Stack;
import positionTree.LinkedBinaryTreeInOI;
import positionTree.LinkedBinaryTreePostOI;

public class LinkedBinaryTreeTester {

	public static void main(String[] args) {
		LinkedBinaryTree<Integer> t1 = new LinkedBinaryTree<Integer>();
		BTNode<Integer> v, m;

		v = (BTNode<Integer>) t1.addRoot(4);

		// add child to the left of root
		m = (BTNode<Integer>) t1.insertLeft(v, 9);
		// add child to left
		v = (BTNode<Integer>) t1.insertLeft(m, 7);
		// add child to right
		v = (BTNode<Integer>) t1.insertRight(m, 10);

		// add child to right of root
		v = (BTNode<Integer>) t1.root(); // get ref to root
		v = (BTNode<Integer>) t1.insertRight(v, 20);

		// add child to left direct child of root
		m = (BTNode<Integer>) t1.insertLeft(v, 15);
		// add child to left
		v = (BTNode<Integer>) t1.insertLeft(m, 12);
		// add child to right
		v = (BTNode<Integer>) t1.insertRight(m, 17);
		// add child to left
		v = (BTNode<Integer>) t1.insertLeft(v, 19);

		// get root
		m = (BTNode<Integer>) t1.root();

		// get children of root at right
		m = (BTNode<Integer>) t1.right(m);
		// insert node at right
		v = (BTNode<Integer>) t1.insertRight(m, 21);
		// insert node at right (internal node)
		m = (BTNode<Integer>) t1.insertRight(v, 40);

		// add child to left
		v = (BTNode<Integer>) t1.insertLeft(m, 30);

		// add child to right
		v = (BTNode<Integer>) t1.insertRight(m, 45);

		showTreeElements(t1);

		t1.makeEmpty();
		showTreeElements(t1);

		LinkedBinaryTreePostOI<Integer> t2 = new LinkedBinaryTreePostOI<Integer>();
		// ADD NECESSARY INSTRUCTIONS TO CONSTRUCT A NEW COPY OF THE SPECIFIED
		// TREE...

		v = (BTNode<Integer>) t2.addRoot(4);

		// add child to the left of root
		m = (BTNode<Integer>) t2.insertLeft(v, 9);
		// add child to left
		v = (BTNode<Integer>) t2.insertLeft(m, 7);
		// add child to right
		v = (BTNode<Integer>) t2.insertRight(m, 10);

		// add child to right of root
		v = (BTNode<Integer>) t2.root(); // get ref to root
		v = (BTNode<Integer>) t2.insertRight(v, 20);

		// add child to left direct child of root
		m = (BTNode<Integer>) t2.insertLeft(v, 15);
		// add child to left
		v = (BTNode<Integer>) t2.insertLeft(m, 12);
		// add child to right
		v = (BTNode<Integer>) t2.insertRight(m, 17);
		// add child to left
		v = (BTNode<Integer>) t2.insertLeft(v, 19);

		// get root
		m = (BTNode<Integer>) t2.root();

		// get children of root at right
		m = (BTNode<Integer>) t2.right(m);
		// insert node at right
		v = (BTNode<Integer>) t2.insertRight(m, 21);
		// insert node at right (internal node)
		m = (BTNode<Integer>) t2.insertRight(v, 40);

		// add child to left
		v = (BTNode<Integer>) t2.insertLeft(m, 30);

		// add child to right
		v = (BTNode<Integer>) t2.insertRight(m, 45);

		showTreeElements(t2);

		LinkedBinaryTreeInOI<Integer> t3 = new LinkedBinaryTreeInOI<Integer>();
		// ADD NECESSARY INSTRUCTIONS TO CONSTRUCT A NEW COPY OF THE SPECIFIED
		// TREE...
		
		v = (BTNode<Integer>) t3.addRoot(4);

		// add child to the left of root
		m = (BTNode<Integer>) t3.insertLeft(v, 9);
		// add child to left
		v = (BTNode<Integer>) t3.insertLeft(m, 7);
		// add child to right
		v = (BTNode<Integer>) t3.insertRight(m, 10);

		// add child to right of root
		v = (BTNode<Integer>) t3.root(); // get ref to root
		v = (BTNode<Integer>) t3.insertRight(v, 20);

		// add child to left direct child of root
		m = (BTNode<Integer>) t3.insertLeft(v, 15);
		// add child to left
		v = (BTNode<Integer>) t3.insertLeft(m, 12);
		// add child to right
		v = (BTNode<Integer>) t3.insertRight(m, 17);
		// add child to left
		v = (BTNode<Integer>) t3.insertLeft(v, 19);

		// get root
		m = (BTNode<Integer>) t3.root();

		// get children of root at right
		m = (BTNode<Integer>) t3.right(m);
		// insert node at right
		v = (BTNode<Integer>) t3.insertRight(m, 21);
		// insert node at right (internal node)
		m = (BTNode<Integer>) t3.insertRight(v, 40);

		// add child to left
		v = (BTNode<Integer>) t3.insertLeft(m, 30);

		// add child to right
		v = (BTNode<Integer>) t3.insertRight(m, 45);

		showTreeElements(t3);
		
		
		LinkedBinaryTreeBFS<Integer> t4 = new LinkedBinaryTreeBFS<Integer>();
		// ADD NECESSARY INSTRUCTIONS TO CONSTRUCT A NEW COPY OF THE SPECIFIED
		// TREE...
		
		v = (BTNode<Integer>) t4.addRoot(4);

		// add child to the left of root
		m = (BTNode<Integer>) t4.insertLeft(v, 9);
		// add child to left
		v = (BTNode<Integer>) t4.insertLeft(m, 7);
		// add child to right
		v = (BTNode<Integer>) t4.insertRight(m, 10);

		// add child to right of root
		v = (BTNode<Integer>) t4.root(); // get ref to root
		v = (BTNode<Integer>) t4.insertRight(v, 20);

		// add child to left direct child of root
		m = (BTNode<Integer>) t4.insertLeft(v, 15);
		// add child to left
		v = (BTNode<Integer>) t4.insertLeft(m, 12);
		// add child to right
		v = (BTNode<Integer>) t4.insertRight(m, 17);
		// add child to left
		v = (BTNode<Integer>) t4.insertLeft(v, 19);

		// get root
		m = (BTNode<Integer>) t4.root();

		// get children of root at right
		m = (BTNode<Integer>) t4.right(m);
		// insert node at right
		v = (BTNode<Integer>) t4.insertRight(m, 21);
		// insert node at right (internal node)
		m = (BTNode<Integer>) t4.insertRight(v, 40);

		// add child to left
		v = (BTNode<Integer>) t4.insertLeft(m, 30);

		// add child to right
		v = (BTNode<Integer>) t4.insertRight(m, 45);

		showTreeElements(t4);
		
		
		LinkedBinaryTreeBFS_Stack<Integer> t5 = new LinkedBinaryTreeBFS_Stack<Integer>();
		// ADD NECESSARY INSTRUCTIONS TO CONSTRUCT A NEW COPY OF THE SPECIFIED
		// TREE...
		
		v = (BTNode<Integer>) t5.addRoot(4);

		// add child to the left of root
		m = (BTNode<Integer>) t5.insertLeft(v, 9);
		// add child to left
		v = (BTNode<Integer>) t5.insertLeft(m, 7);
		// add child to right
		v = (BTNode<Integer>) t5.insertRight(m, 10);

		// add child to right of root
		v = (BTNode<Integer>) t5.root(); // get ref to root
		v = (BTNode<Integer>) t5.insertRight(v, 20);

		// add child to left direct child of root
		m = (BTNode<Integer>) t5.insertLeft(v, 15);
		// add child to left
		v = (BTNode<Integer>) t5.insertLeft(m, 12);
		// add child to right
		v = (BTNode<Integer>) t5.insertRight(m, 17);
		// add child to left
		v = (BTNode<Integer>) t5.insertLeft(v, 19);

		// get root
		m = (BTNode<Integer>) t5.root();

		// get children of root at right
		m = (BTNode<Integer>) t5.right(m);
		// insert node at right
		v = (BTNode<Integer>) t5.insertRight(m, 21);
		// insert node at right (internal node)
		m = (BTNode<Integer>) t5.insertRight(v, 40);

		// add child to left
		v = (BTNode<Integer>) t5.insertLeft(m, 30);

		// add child to right
		v = (BTNode<Integer>) t5.insertRight(m, 45);

		showTreeElements(t5);
		
	}

	/**
	 * Shows the elements in a particular tree based on the available iterator
	 * for the particular type of tree....
	 * 
	 * @param t
	 *            the tree to traverse...
	 */
	private static void showTreeElements(Tree<Integer> t) {
		System.out.println("The tree has " + t.size() + " elements. These are: ");
		for (Integer e : t)
			System.out.print(e + " ");
		System.out.println();
	}

}
