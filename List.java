
public class List {
	Node head;
	
	//Constructor
	public List()
	{
		head = null;
	}
	
	/*
	 *  Insert new node into the front of the linked list
	 *  Parameter: Pass in the node that needs to be inserted
	 */
	public Node insertBefore(int data)
	{
		Node n = new Node(data);
		//If the linked list is empty
		if(head==null)
		{
			head= n;
			head.next = null;
		}
		else 
		{
			Node temp = head;
			n.next = temp;
			head = n;

		}
		return head;
	}
	
	public void removedNode(int index)
	{
		//Remove first node in the list
		if(index == 0)
		{
			head = head.next;
		}
		
		//if linked list is empty
		else if(head==null)
		{
			System.out.println("The linked list is empty. There's nothing to remove!!!");
		}
		
		
		else
		{
			//Search the node in the list
			Node currentNode = head;
			Node previousNode = null;
			int count = 0;
			while(currentNode!=null)
			{
				
				if(count == index)
				{
					previousNode = currentNode;
					currentNode.next = currentNode.next.next;
					currentNode = currentNode.next;
					
				}
				currentNode= currentNode.next;
				count++;
			}
		}
		
	}
	
	public int getNode(int index)
	{
		Node currentNode = head; //starts at the beginning of the list
		int count = 0; 
		while(currentNode!=null)
		{
			if(count == index)
			{
				return currentNode.data;
			}
			count++;
			currentNode = currentNode.next;
			
		}
		return 0; //for empty linked list, return 0
	}
	
	public int getListSize()
	{
		Node currentNode = head;
		int count = 0; 
		while(currentNode!=null)
		{
			currentNode = currentNode.next;
			count++;
		}
		return count;
		
	}
	public Node getHead()
	{
		return head;
	}
	
	public void clearList()
	{
		head =null;
	}
}
