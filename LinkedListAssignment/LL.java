package LinkedList2; // submitted assignment

public class LL 
{
	
	 int size; 
	public Node head=null; 
	
	public void addend(int data) {
		Node node = new Node(data); 
		if (head == null) {
			node.next = null;
			head = node; 
		} else {
			Node travel = head; // referencing the same obj as head
			while (travel.next!=null) {
				travel=travel.next; // that obj has a next property ~ 
			}
			node.next = null; 
			travel.next = node; 
		}			
	}
	
	public void delend() {
		if (head == null) {
		} else {
			Node travel = head; 
			while (travel.next.next!=null) {
				travel=travel.next;  
			}
			travel.next = null;
		}
	}

	public void display()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	private class Node
	{
		private Node next;
		int data;
		public Node(int data)
		{
			this.data=data;
		}
	}
}
