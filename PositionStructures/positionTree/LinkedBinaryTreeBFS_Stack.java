package positionTree;

import dataStructureResources.LLStack;
import positionInterfaces.Position;
import positionListLLDirect.NodePositionList;

public class LinkedBinaryTreeBFS_Stack<E> extends LinkedBinaryTree<E> {

	protected void fillIterator(TreeNode<E> r, NodePositionList<Position<E>> list) {
		
	  BTNode<E> rbtn = (BTNode<E>) r;
	  LLStack<BTNode<E>> myStack = new LLStack<>(); //rbtn is the root myQueue.enqueue(rbtn);
	  //the stack will be used to replace the queue. So the enqueue will done with a push, and the dequeue with
	  //by creating a temp stack and pushing the content of the other into it. This way the "front" will
	  //be a the the top
	  //Enqueue the root
	 pseudoEnqueue(myStack, rbtn);
	  while(!myStack.isEmpty()){
		  //dequeue a node (with
		  BTNode<E> n = pseudoDequeue(myStack);
		  //add the dequeued node to the end of the list.
		  list.addLast((Position <E>) n);
		  
		  //try to get the left element of the node
		  BTNode<E> leftN = (BTNode<E>) n.getLeft();
		  if(leftN != null)
			 pseudoEnqueue(myStack,leftN); //enqueue if not null
		  
		  BTNode<E> rightN = (BTNode<E>) n.getRight();
		  if(rightN != null)
			  pseudoEnqueue(myStack, rightN);
		  
		  
		  //if both are null, then there are no more enqueues and the while will end
		  
	  }
	}
	
	private void pseudoEnqueue(LLStack<BTNode<E>> s, BTNode<E> n){
		s.push(n);
	}
	private BTNode<E> pseudoDequeue(LLStack<BTNode<E>> s){
		
		LLStack<BTNode<E>> tmpStack = new LLStack<>();
		if(s.isEmpty()) return null;
		
		//push the content of s into tmpStack (reversing)
		while(!s.isEmpty())
			tmpStack.push(s.pop());
		
		//top is the front of the queue.
		BTNode<E> ntr = tmpStack.pop();
		
		//reverse again.front will be at the bottom of the stack now 
		while(!tmpStack.isEmpty())
			s.push(tmpStack.pop());
		
		return ntr;
		
	}
	 
}
