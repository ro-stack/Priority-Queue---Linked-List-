package AssignmentOne_TicketSystem;

public class Node {
	// initializing objects
    Object Request;
    int Priority;
    Node Next;
    Node nextNode;
    int uniqueID;
    private static int requestNo = 0;     
    public Node(){} // Dummy node forhead
    // Creating a node which allows a request and priority
    public Node(Object request, int priority)
    {
        this.Request = request;
        this.Priority = priority;
        requestNo++; // increases each node added
        this.uniqueID = requestNo;
    }
    //Creating a node which now points to the next
    public Node(Object request, int priority, Node next)
    {
        this.Request = request;
        this.Priority = priority;
        this.Next = next;
        requestNo++; // increases each node added
        this.uniqueID = requestNo;
    }
    
    /* get and set methods for each object
     * Allows you to return the object or
     * set the object.
     */
    public Node getNext() { return Next; }
    public void setNext(Node next) { this.Next = next; }

    public Object getRequest() { return this.Request; }
    public void setRequest(Object data) { this.Request = data; }

    public int getPriority() { return this.Priority; }
    public void setPriority(int priority) { this.Priority=priority; }

    public int getUniqueID() { return this.uniqueID; }
    public void setUniqueID(int id) { this.uniqueID = id; }
    
    // getting the request data and converting to a string
    @Override
    public String toString()
    {
        return getRequest().toString();
    }
}
