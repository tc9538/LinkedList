import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	//Insert a node to an empty linked list
	@Test
	void testinsertNodeEmptyLL() {
		List list = new List();
		assertEquals(2, list.insertNodeFirst(2).data);
	}
	
	//Insert a node to a linked list has 2 elements
	@Test
	void testinsertNodeNonEmptyLL() 
	{
		List list = new List();
		Node nodeA = list.insertNodeFirst(5);
		Node nodeB = list.insertNodeFirst(9);
		
		assertEquals(12, list.insertNodeFirst(12).data);
	}
	
	@Test
	void testGetNode()
	{
		List list = new List();
		Node nodeA = list.insertNodeFirst(81);
		Node nodeB = list.insertNodeFirst(91);
		Node nodeC = list.insertNodeFirst(50);
		
		assertEquals(91, list.getNode(1));
	}

}
