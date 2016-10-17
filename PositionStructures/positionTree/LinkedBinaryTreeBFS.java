package positionTree;

import dataStructureResources.LLQueue;
import positionInterfaces.Position;
import positionListLLDirect.NodePositionList;

public class LinkedBinaryTreeBFS<E> extends LinkedBinaryTree<E> {

	protected void fillIterator(TreeNode<E> r, NodePositionList<Position<E>> list) {
		
		  BTNode<E> rbtn = (BTNode<E>) r;
		  LLQueue<BTNode<E>> myQueue = new LLQueue<>(); //rbtn is the root myQueue.enqueue(rbtn);
		  
		  //enqueue the root
		  myQueue.enqueue(rbtn);
		  while(!myQueue.isEmpty()){
			  //dequeue a node
			  BTNode<E> n = myQueue.dequeue();
			  //add the dequeued node to the end of the list.
			  list.addLast((Position <E>) n);
			  
			  //try to get the left element of the node
			  BTNode<E> leftN = (BTNode<E>) n.getLeft();
			  if(leftN != null)
				  myQueue.enqueue(leftN); //enqueue if not null
			  
			  BTNode<E> rightN = (BTNode<E>) n.getRight();
			  if(rightN != null)
				  myQueue.enqueue(rightN);
			  
			  
			  //if both are null, then there are no more enqueues and the while will end
			  
		  }
		 
	}
}
