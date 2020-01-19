
public class List {
	Node head;
	
	//Constructor
	public List()
	{
		head = null;
	}
	
	//Insert a node at the beginning of the linked list
	//Parameter: Pass in the node that needs to be inserted
	public Node insertNodeFirst(int data)
	{
		Node n = new Node(data);
		//If the linked list is empty
		if(head==null)
		{
			head= n;
		}
		else 
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
}
