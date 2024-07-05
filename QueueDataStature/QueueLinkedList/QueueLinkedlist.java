import java.util.Scanner;
public class QueueLinkedlist{
	
	class Node{
		int element;
		Node next;
		
		public Node(int e, Node n){
			element=e;
			next=n;
		}
	}
	public QueueLinkedlist(){
		front=null;
		rear=null;
		size=0;
	}
	private Node front;
	private Node rear;
	private int size=0;
	
	public boolean isEmpty(){
		return size==0;
	}
	public int length(){
		return size;
	}
	
	public void enqueue(int e){
		Node newest = new Node(e,null);
		if(isEmpty()){
			front=newest;
		}else{
			rear.next=newest;
		}
		rear=newest;
		size=size+1;
	}
	
	public void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		int e=front.element;
		front=front.next;
		size=size-1;
		
		if(isEmpty()){
			rear=null;
		}
		System.out.print("Removed Data --> "+e+"\n");
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		int i=0;
		Node p=front;
		System.out.println("Data Are : ");
		while(p!=null){
			System.out.println(p.element);
			p=p.next;
		}
	}
	public static void main(String[] args){
		QueueLinkedlist q= new QueueLinkedlist();
		Scanner sc=new Scanner(System.in);
		int n,in,eq;
		do{
		System.out.println("-----------------");
		System.out.println(" 1. Insert Data \n 2. Delete Data \n 3. Display \n 4. Exit ");
		System.out.println("-----------------");
		System.out.print("Enter Input --> ");
		in=sc.nextInt();
		switch(in){
			case 1:
			System.out.print("Enter Data --> ");
			eq=sc.nextInt();
			q.enqueue(eq);
			break;
			case 2:
			q.dequeue();
			break;
			case 3:
			q.display();
			break;
		}
		}while(in!=4);
	}
}
