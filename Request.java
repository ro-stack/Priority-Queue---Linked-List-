package AssignmentOne_TicketSystem;

public class Request {// initializing objects 
    private static int requestNo = 0;
    int priority;
    int uniqueID;
    String ownerName;
    String creator;
    String problemDescription;

    // holds the information about each request
    public Request(String creator,String problem, int newPriority) {
        requestNo++; // increases every request forming unique number
        this.uniqueID = requestNo;
        this.creator = creator;
        this.problemDescription = problem;
        this.priority = newPriority;
        // simple if statement to assign a owner depending on priority
        if (priority == 1)
        { this.ownerName = "Dave";}
        else if(priority ==2)
        {this.ownerName = "Smithy";}
        else if (priority == 3)
        { this.ownerName = "Mary";}
        else if(priority ==4)
        {this.ownerName = "Stevo";}
    }

    /* get and set methods for each object
     * Allows you to return the object or
     * set the object.
     */
    public int getUniqueID() { return uniqueID; }
    public void setUniqueID(int id) { this.uniqueID = id; }

    public int getPriority() { return priority; }
    public void setPriority(int priority) { this.priority = priority; }

    public String getOwner() { return ownerName; }
    public void setOwner(String ownerName) { this.ownerName = ownerName; }

    public String getCreator() { return creator; }
    public void setCreator(String creator) { this.creator = creator; }

    /* String method to output the data from a request
     * Nicely alligned and clearly set out
     */
    public String displayNodeData() {
        if(uniqueID > 0){ 
            System.out.printf("%10d | %10d | %10s | %20s | %30s | ", 
                uniqueID, priority, ownerName, creator, problemDescription );
            System.out.println();
        }
        return "";
    }

    @Override    
    public String toString(){
        return displayNodeData();
    }
}