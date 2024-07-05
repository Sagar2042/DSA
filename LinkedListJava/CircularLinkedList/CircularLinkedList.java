import java.util.Scanner;
public class CircularLinkedList{
	
	class Node{
		int element;
		Node next;
		public Node(int e,Node n){
			element=e;
			next=n;
		}
	}
	private Node head;
	private Node tail;
	private int size;
	
	public CircularLinkedList(){
	head= null;
	tail = null;
	size = 0;
	}	
	
	public int length(){
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public void addlast(int e){
		Node newest =new Node(e,null);
		if(isEmpty()){
			newest.next=newest;
			head =newest;
		}else{
			newest.next=tail.next;
			tail.next=newest;
		}
		tail=newest;
		size=size+1;
	}
	public void addfirst(int e){
		Node newest = new Node(e,null);
		if(isEmpty()){
			newest.next=newest;
			head=newest;
			tail=newest;
		}else{
			tail.next=newest;
			newest.next=head;
			head=newest;
		}
		size=size+1;
	}
	public void addany(int e, int position){
		if(isEmpty()){
			System.out.println("Linked List is Empty");
		}else{
			Node newest = new Node(e,null);
			Node p=head;
			int i=1;
			while(i<position-1){
				p=p.next;
				i++;
			}
			newest.next=p.next;
			p.next=newest;
			size++;
		}
	}
	public void removefirst(){
		int e;
		 if(isEmpty()){
			 System.out.println("Linked List is Empty");
		 }
		 e=head.element;
		 tail.next=head.next;
		 head = head.next;
		 size=size-1;
		 if(isEmpty()){
			 head=null;
			 tail=null;
		 }
		 System.out.print("Removed Element --> "+e+"\n");
	}
	public void removelast(){
		if(isEmpty()){
			System.out.print("Linked list is Empty");
		}
		Node p=head;
		int i=1,e;
		while(i<length()-1){
			p=p.next;
			i++;
		}
		tail=p;
		p=p.next;
		tail.next=head;
		e=p.element;
		size=size-1;
		System.out.print("Removed Data --> "+e+"\n");
	}
	public void removeany(int position){
		if(isEmpty()){
			System.out.println("Linked List is Empty");
		}
		Node p=head;
		int i=1;
		while(i<position-1){
			p=p.next;
			i++;
		}
		int e=p.next.element;
		p.next=p.next.next;
		size=size-1;
		System.out.print("Removed Data --> "+e+"\n");
	}
	
	public void display(){
		Node p = head;
		int i=0;
		while(i<length()){
			System.out.println(p.element);
			p=p.next;
			i=i+1;
		}
	}
	
	
	public static void main(String []args){
		CircularLinkedList c= new CircularLinkedList();
		int n,in,last,fst,pos,d,rin,any;
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("------------------");
		System.out.println(" 1 . Insert Data \n 2 . Display Data \n 3 . Remove Data \n 4 . Exit ");
		System.out.println("------------------");
		System.out.print("Enter Input --> ");
		n=sc.nextInt();
		switch(n){ 
	case 1:
		do{
		System.out.println(" 1. Inster in Last \n 2. Insert in first \n 3. Insert in any Position \n 4. Exit");
		System.out.print("Enter Input --> ");
		in=sc.nextInt();
		switch(in){
			case 1:
			System.out.print("Enter data --> ");
			last=sc.nextInt();
			c.addlast(last);
			break;
			case 2:
			System.out.print("Enter Data --> ");
			fst=sc.nextInt();
			c.addfirst(fst);
			break;
			case 3:
			System.out.print("Enter Position --> ");
			pos=sc.nextInt();
			System.out.print("Enter Data --> ");
			d=sc.nextInt();
			c.addany(d,pos);
		}
		}while(in!=4);
	break;
	case 2:
		System.out.println("Data are : ");
		c.display();
		break;
	case 3:
	do{
		System.out.println(" 1. Remove in first \n 2. Remove in Last \n 3. Remove in any Position \n 4. Exit");
		System.out.print("Enter Input --> ");
		rin=sc.nextInt();
		switch(rin){
		case 1:
		c.removefirst();
		break;
		case 2:
		c.removelast();
		break;
		case 3:
		System.out.print("Enter Position --> ");
		any=sc.nextInt();
		c.removeany(any);
		break;
		}
	}while(rin!=4);
	break;	
		}
		}while(n!=4);
		
	}
	
}