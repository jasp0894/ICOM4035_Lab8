package dataStructureResources;

import positionInterfaces.*;

public class LLQueue<E> implements Queue<E>
{
	private SNode<E> front, rear; 
	private int size; 
	
	public LLQueue() {
		front = rear = null; 
		size = 0; 
	}
	
	public E dequeue() throws EmptyQueueException {
		if (isEmpty())
			throw new EmptyQueueException("dequeue: Queue is empty."); 
		E etr = front.getElement(); 
		
		front = front.getNext(); //unlinks the previous front when the list is not empty
		if(size==1)
			rear = front; //if the dequeued element was the only element, then rear is affected. It must now be equal to front.
		// ADD MISSING CODE
		size--; //decrease size by oneS

		return etr;
	}

	public void enqueue(E e) {
		SNode<E> nn = new SNode<E>(e); 
		if (size == 0)
			front = nn; 
		else 
			rear.setNext(nn); 
		rear = nn; 
		size++; 
	}

	public E front() throws EmptyQueueException {
		if (isEmpty())
			throw new EmptyQueueException("front: Queue is empty."); 
		return front.getElement();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	// just for testing and grading....
    public void showReverse() { 
	    if (size == 0)
		   System.out.println("Queue is empty."); 
		else
		   recSR(front);
    } 
    private void recSR(SNode<E> f) { 
		if (f != null) { 
		   recSR(f.getNext()); 
		   System.out.println(f.getElement()); 
	     } 
    } 


}
