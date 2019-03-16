package AssignmentOne_TicketSystem;

public class LinkedList{
	Node root;
    int size;
    public LinkedList() // empty list constructor
    {
        root = new Node();
        size = 0;
    }

    /* This method will add via the priority of the request and traverse the list
     * It creates a node to add and a empty root node. It then checks if the current 
     * node is null, if not it traverses the list checking if the next has a lower 
     * (higher number) priority. If so it will add it and increase the size of the 
     * list.  
     */
    public Node addByPriority(Object request, int priority) {
        Node nodeToAdd = new Node(request, priority); // initialize node to add
        Node currentNode = this.root; // current node will be the root/head
        if (currentNode != null) { // current not null
            while (currentNode.getNext() != null && (nodeToAdd.getPriority() 
                - currentNode.getNext().getPriority()) >= 0)
                // next is not null & compare the priorities are >= zero
            {
                currentNode = currentNode.getNext();
            }
            size++; // increase size
            nodeToAdd.setNext(currentNode.getNext()); 
            currentNode.setNext(nodeToAdd); 
        }
        return nodeToAdd;
    }

    // Search for specific id and return it
    public Node findNodeByID(int id) {
        Node nodeToFind = root;		// node to find becomes root
        while (root != null) { // whne root not null
            if (nodeToFind.getUniqueID() == id) { // get uniqueID compare to input
                return nodeToFind; // if match then return
            }
            nodeToFind = nodeToFind.getNext(); 
        } 
        return null;
    }

    // Find node by its ID and delete it
    public Node deleteNodeByID(int id) {
        Node nodeToFind = root;	// root is what you want to find	
        while (root != null) { // when not null
            if (nodeToFind.getUniqueID() == id) { 
                return nodeToFind;                
            }
            nodeToFind.setNext(nodeToFind.getNext().getNext());
            size--; // decrease size
            return nodeToFind;
        }return null;
    }

    /* Attempt to update an ID's priority
    public Node updatePriority(int id, int newPriority){
        Node old = findNodeByID(id);
        //Node current = this.root;
        if(old == findNodeByID(id))
        {
            old.setPriority(newPriority);   
            // id.getRequest();

        }
        return null;
    } */
    

    /*Returns the request with the highest priority
     * using returnTopPriority method
     */
    public Node returnTopPriority(){
        if (this.root.getNext() != null) { // if root is not null
            return this.root.getNext(); // returns first 
        }return null;
    }    

    /* This method will remove the highest priority in the list.
     * It checks if the root is not null, if so it decreases the size of
     * the list, and makes the root the next highest in the list. 
     */
    public void removeTopPriority(){
        if (root != null) {
            size--; // decreases size
            root = root.getNext(); // root becomes next highest priority
        }
    }    
    // Method to delete all requests from the list
    public boolean DeleteAll()
    {
        this.root = null; // root becomes empty
        size = 0; // size set to 0
        return true;
    }

    /* After getting a strange output of random numebers/letters I researched how to
     * eliminate this and get the output of the request data that i wanted.
     * It retrieves that request data and converts it to a string
     */
    public String toString()
    {
        StringBuilder request = new StringBuilder();
        if(this.root!=null)
        {
            Node currentNode = this.root.getNext();
            while(currentNode != null)
            {
                request.append(currentNode.getRequest().toString()); // gets request data
                currentNode = currentNode.getNext();
            }
        }
        return request.toString();
    } 
    // Simple method to return size count = size of list
    public int getSize()
    {
        return size; // returns final size
    }
    // Basic check to see if the root is null, if so the list is empty
    public boolean isEmpty()
    {
        return this.root==null; // if root is null
    }  
}

   
          
     
