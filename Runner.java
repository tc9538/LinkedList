
public class Runner {
	
	public static void main (String args[])
	{
		List list = new List();
		Node nodeA = list.insertBefore(6);
		Node nodeB = list.insertBefore(7);
		Node nodeC = list.insertBefore(8);
		Node nodeD = list.insertBefore(9);
		
		for (Node temp = list.getHead(); temp != null; temp = temp.next) 
            System.out.print(temp.data + " "); 
	}

}
