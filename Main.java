package AssignmentOne_TicketSystem;

public class Main {

public static void main(String[] args) {
    //create new list
    LinkedList list = new LinkedList();

    // Creating new requests with correct data
    Request One = new Request("Draco Malfoy", "Malicious emails", 1);       
    Request Two = new Request("Neville Longbottom", "Printer configuration", 4);
    Request Thr = new Request("Harry Potter", "WiFi connection", 2);
    Request Fou = new Request("Ron Weasley", "Frozen screen", 2);
    Request Fiv = new Request("Hermoine Granger", "Application update", 3);
    Request Six = new Request("Albus Dumbledore", "Crashing application", 3);
    Request Sev = new Request("Profressor Snape", "Virus pop up", 1);
    Request Eig = new Request("Lord Voldermort", "No internet", 4);

    /*Turning the requests into nodes and adding to the list 
    * via priority.*/
    Node OneNode = list.addByPriority(One, One.getPriority()); 
    Node TwoNode = list.addByPriority(Two, Two.getPriority());
    Node ThrNode = list.addByPriority(Thr, Thr.getPriority());
    Node FouNode = list.addByPriority(Fou, Fou.getPriority());
    Node FivNode = list.addByPriority(Fiv, Fiv.getPriority());
    Node SixNode = list.addByPriority(Six, Six.getPriority());
    Node SevNode = list.addByPriority(Sev, Sev.getPriority());
    Node EigNode = list.addByPriority(Eig, Eig.getPriority());
    
    // printing the full list 
    System.out.println("FULL LIST");
    System.out.printf("%10s | %10s | %10s | %20s | %30s |\n", 
        "UNIQUE ID", "PRIORITY", "OWNER", "CREATOR", "PROBLEM");
    System.out.println(list);
    
    /* removing the top priority and printing the list
     * using the removeTopPriority method
     */
    list.removeTopPriority();
    System.out.println("TOP PRIORITY REMOVED");
    System.out.printf("%10s | %10s | %10s | %20s | %30s |\n", 
        "UNIQUE ID", "PRIORITY", "OWNER", "CREATOR", "PROBLEM");
    System.out.println(list);
    
    /* finding a specific node via its unique ID
     * using the findNodeByID method
     */ 
    System.out.println("FIND NODE VIA ID");
    System.out.printf("%10s | %10s | %10s | %20s | %30s |\n", 
        "UNIQUE ID", "PRIORITY", "OWNER", "CREATOR", "PROBLEM");
    System.out.println(list.findNodeByID(6));
    
    /* returning the top priority 
     * using returnTopPriority method
     */
    System.out.println("RETURN TOP PRIORITY");
    System.out.printf("%10s | %10s | %10s | %20s | %30s |\n", 
        "UNIQUE ID", "PRIORITY", "OWNER", "CREATOR", "PROBLEM");
    System.out.println(list.returnTopPriority());
    
    /* removing node by ID 
     * using deleteNodeById method
     */
    System.out.println("DELETE NODE VIA ID");
    System.out.printf("%10s | %10s | %10s | %20s | %30s |\n", 
        "UNIQUE ID", "PRIORITY", "OWNER", "CREATOR", "PROBLEM");
    list.deleteNodeByID(7);
    System.out.println(list);
    
    // getSize method to return size of list
    System.out.println("CURRENT SIZE OF LIST = " +list.getSize());
    System.out.println();
    
    /* changing the priority via
     * setPriority method
     */
    System.out.println("CHANGING PRIORITY");
    Six.setPriority(1);
    System.out.printf("%10s | %10s | %10s | %20s | %30s |\n", 
        "UNIQUE ID", "PRIORITY", "OWNER", "CREATOR", "PROBLEM");
    System.out.println(Six);
    
    // A few random method tests
    System.out.println("Method toString test:");
    System.out.printf("%10s | %10s | %10s | %20s | %30s |\n", 
        "UNIQUE ID", "PRIORITY", "OWNER", "CREATOR", "PROBLEM");
    System.out.println(One.toString()); 
    
    System.out.println("Method getPriority test:");
    System.out.println("Priority for node one = " + One.getPriority());

    System.out.println("Method getUniqueID test:");
    System.out.println("UniqueID for node two = " + Two.getUniqueID());
          
    System.out.println("Method getOwner test:");
    System.out.println("Owner for node two = " +Two.getOwner());
    
    System.out.println("Method getCreator test:");
    System.out.println("Creator for node one = " + One.getCreator());
      
           
    /*Testing delete all method and then seeing 
     * how many items are in the list using getSize
     */
    System.out.println();
    list.DeleteAll();
    System.out.print("SIZE OF LIST AFTER DELETE ALL = " +list.getSize());



}
}
