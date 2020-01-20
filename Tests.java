import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	//Insert a node to an empty linked list
	@Test
	void testinsertNodeEmptyLL() {
		List list = new List();
		assertEquals(2, list.insertBefore(2).data);
		list.clearList();
	}
	
	//Insert a node to a linked list has 2 elements
	@Test
	void testinsertNodeNonEmptyLL() 
	{
		List list = new List();
		Node nodeA = list.insertBefore(5);
		Node nodeB = list.insertBefore(9);
		
		assertEquals(12, list.insertBefore(12).data);
		list.clearList();
	}
	
	@Test
	void testGetNode()
	{
		List list = new List();
		Node nodeA = list.insertBefore(81);
		Node nodeB = list.insertBefore(91);
		Node nodeC = list.insertBefore(50);
		
		assertEquals(81, list.getNode(2));
		list.clearList();
	}
	
	@Test
	void testGetListSize()
	{
		List list = new List();
		Node nodeA = list.insertBefore(6);
		Node nodeB = list.insertBefore(7);
		Node nodeC = list.insertBefore(8);
		Node nodeD = list.insertBefore(9);
		
		assertEquals(4, list.getListSize());
		list.clearList();
	}
	
	@Test
	void testRemoveNode()
	{
		List list = new List();
		Node nodeA = list.insertBefore(6);
		Node nodeB = list.insertBefore(7);
		Node nodeC = list.insertBefore(8);
		Node nodeD = list.insertBefore(9);
		list.removedNode(1); //remove the node at index 1 
		assertEquals(8, list.getNode(1));
		list.clearList();
	}
	
	@Test
	void testRemoveFirstNode()
	{
		List list = new List();
		Node nodeA = list.insertBefore(6);
		Node nodeB = list.insertBefore(7);
		Node nodeC = list.insertBefore(8);
		Node nodeD = list.insertBefore(9);
		list.removedNode(0); 
		assertEquals(8, list.getNode(0));
		list.clearList();
	}
	
	@Test
	void testUpdatedLinkedListSize()
	{
		List list = new List();
		Node nodeA = list.insertBefore(20);
		Node nodeB = list.insertBefore(21);
		Node nodeC = list.insertBefore(22);
		Node nodeD = list.insertBefore(23);
		list.removedNode(1); //remove the node at index 1 
		assertEquals(3, list.getListSize());
		list.clearList();
	}
	
}
