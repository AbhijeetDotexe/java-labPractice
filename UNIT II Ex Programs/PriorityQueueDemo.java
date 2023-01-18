// Java program to demonstrate the working of 
// priority queue in Java 
import java.util.*; 
//A PriorityQueue is used when the objects are supposed to be processed based on the priority.
//It is known that a queue follows the First-In-First-Out algorithm (FIFO), 
//but sometimes the elements of the queue are needed to be processed according to the priority 
//and this class is used in these cases. The PriorityQueue is based on the priority heap. 
//The elements of the priority queue are ordered according to the natural ordering, 
//or by a Comparator provided at queue construction time, depending on which constructor is used.
class PriorityQueueDemo { 
	public static void main(String args[]) 
	{ // Creating empty priority queue 
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();   
		// Adding items to the pQueue using add() 
		pQ.add(10); 
		pQ.add(20); 
		pQ.add(15); 
		// Printing the top element of PriorityQueue, elements ordered by default in natural order 
		System.out.println(pQ.peek()); 
		// Printing the top element and removing it from the PriorityQueue container 
		System.out.println(pQ.poll()); 
		// Printing the top element again 
		System.out.println(pQ.peek()); 
		
		//handling random integer priority queue
		Queue<Integer> iPQ = new PriorityQueue<>(7);
		Random rand = new Random();//create object of Random class
		for(int i=0;i<7;i++){iPQ.add(new Integer(rand.nextInt(1000)));}
		for(int i=0;i<7;i++){
			Integer in = iPQ.poll();
			System.out.println("Processing Integer:"+in);}
			
		//PriorityQueue example with Comparator
		Queue<Customer> cPQ = new PriorityQueue<>(7, idComparator);
		addDataToQueue(cPQ);
		pollDataFromQueue(cPQ);
		}
	
	//Comparator anonymous class implementation
	public static Comparator<Customer> idComparator = new Comparator<Customer>(){
		@Override
		public int compare(Customer c1, Customer c2) {
            return (int) (c1.getId() - c2.getId());}
	};

	//utility method to add random data to Queue
	private static void addDataToQueue(Queue<Customer> cPQ) {
		Random rand = new Random();
		for(int i=0; i<7; i++){
			int id = rand.nextInt(100);
			cPQ.add(new Customer(id, "Pankaj "+id));	}
	}
	
	//utility method to poll data from queue
	private static void pollDataFromQueue(Queue<Customer> cPQ) {
		while(true){
			Customer cust = cPQ.poll();
			if(cust == null) break;
			System.out.println("Processing Customer with ID="+cust.getId());}
	}
}
 class Customer {
	
	private int id;
	private String name;
	
	public Customer(int i, String n){
		this.id=i;
		this.name=n;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
