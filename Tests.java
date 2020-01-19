import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void testinsertNodeFirst() {
		Node head = new Node(4);
		assertEquals(2, head.insertNodeFirst(head, 2).data);
	}

}
