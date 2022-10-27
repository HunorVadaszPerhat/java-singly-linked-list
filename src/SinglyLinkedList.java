public class SinglyLinkedList {
    // The rerefence to first node in the list
    private Node head;

    public SinglyLinkedList() {
        // Set the head to null
        this.head = null;
    }

    // add a new node to the list
    public void insertInBeginning(int input) {
        // Create a new node
        Node newNode = new Node(input);
        // Set the next node to the current head
        newNode.address = this.head;
        // Set the head to the new node
        this.head = newNode;
    }

    // display the list
    public void displayList() {
        // declare pointer refererence to head
		Node pointer;

        // check is list is empty
		if(head == null)
		{
            // display message of empty list
			System.out.println("List is empty");
            //exit the method
			return;
		}
        // set pointer to head
		pointer = head;

        // iterate through the list
        // and print the value of each node
		while(pointer != null)
		{
            // print the value of the node
			System.out.print(pointer.data);
            // move to the next node
			pointer = pointer.address;
		}
		System.out.println();
    }

    // insert a new node at the end of the list
    public void insertAtEnd(int data)
	{
        // declare pointer refererence to head
		Node pointer;
        // create a new node
		Node newNode = new Node(data);
		
        // check is list is empty
        // if it is, set the head to the new node
		if(head == null)
		{
            // set the head to the new node
			head=newNode;
			return;
		}
		// set pointer to head
		pointer = head;
        // iterate through the list
		while(pointer.address != null)
			pointer = pointer.address;
		
        // set the next node to the new node
		pointer.address=newNode;
	}

}
