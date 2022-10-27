public class Node {
    // The value of the node
    public int data;
    // The next node in the list
    public Node address;

    public Node(int input) {
        // Set the value of the node
        this.data = input;
        // Set the next node to null
        this.address = null;
    }
}