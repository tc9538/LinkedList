
public class Node 
{
	int data;
	Node next; //pointer to head of node
	Node head;
	//Constructor
	public Node(int d)
	{
		data = d;
		next = null;
	}
	
	//Insert a node at the beginning of the linked list
	//Parameter: Pass in the node that needs to be inserted
	public Node insertNodeFirst(Node head, int data)
	{
		Node n = new Node(data);
		//If the linked list is empty
		if(head==null)
		{
			head= n;
		}
		else 
			//if(head.next == null)
		{
			Node temp = head;
			head = n;
			n.next = temp;
			temp.next = null;
		}
		return head;
	}
	
	public int getNode(int index)
	{
		Node current = head;
		int count = 0; 
		while(current!=null)
		{
			if(count == index)
			{
				return current.data;
			}
			count++;
			current = current.next;
			
		}
		return 0;
		
		
	}
}
