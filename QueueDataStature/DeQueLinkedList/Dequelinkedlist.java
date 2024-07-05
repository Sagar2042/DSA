import java.util.Scanner;
public class Dequelinkedlist{
	
	class Node{
		int element;
		Node next;
		public Node(int e,Node n){
			element=e;
			next=n;
		}
	}
	private Node front;
	private Node rear;
	private int size;
	public int length;
	
	public Dequelinkedlist(){
		front=null;
		rear=null;
		size=0;
	}
	public int length(){
		return length=size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	
	public void addlast(int e){
		Node newest = new Node(e,null);
		if(isEmpty()){
			front=newest;
		}else{
			rear.next=newest;
		}
			rear=newest;
			size=size+1;
	}
	public void addfirst(int e){
		Node newest=new Node(e,null);
		if(isEmpty()){
			front=newest;
			rear=newest;
		}else{
			newest.next=front;
			front=newest;
		}
		size=size+1;
	}
	public void deletelast(){
		
		if(isEmpty()){
			System.out.println("Queue is Empty ");
			return;
		}
		Node p=front;
		int i=1;
		while(i<length()-1){
			p=p.next;
			i++;
		}
		
		rear=p;
		int e=p.next.element;
		size=size-1;
		System.out.print("Deleted Data--> "+e+"\n");
		if(isEmpty()){
			rear=null;
		}
	}
	public void deletefirst(){
		if(isEmpty()){
			System.out.println("Queue is Empty ");
			return;
		}
		int e=front.element;
		front=front.next;
		size--;
		if(isEmpty()){
			front.next=null;
		}
		System.out.print("Deleted Data--> "+e+"\n");
	}
	public void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty ");
			return;
		}
		Node p=front;	
		System.out.println("Data Are : ");
		while(p!=null){
			System.out.println(p.element);
			p=p.next;
		}
	}
	
	public static void main(String [] args){
		Dequelinkedlist d= new Dequelinkedlist();
		int n,in,infront,inrear;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("\n-----------------");
		System.out.println(" 1. Insert Data front \n 2.Insert Data rear \n 3. Delete Data  front \n 4. Delete Data  rear \n 5 Display \n 6. Exit ");
		System.out.println("-----------------");
		System.out.print("Enter Input --> ");
		in=sc.nextInt();
		switch(in){
			case 1:
			System.out.print("Enter Data --> ");
			infront=sc.nextInt();
			d.addfirst(infront);
			break;
			case 2:
			System.out.print("Enter Data --> ");
			inrear=sc.nextInt();
			d.addlast(inrear);
			break;
			case 3:
			d.deletefirst();
			break;
			case 4:
			d.deletelast();
			break;
			case 5:
			d.display();
			break;
		}
	}while(in!=6);
	}
}

