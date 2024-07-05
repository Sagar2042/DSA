import java.util.Scanner;
public class DoublyLinkedList{
	class Node{
		int element;
		Node prev,next;
		
		public Node(int e,Node n,Node p){
			element=e;
			next=n;
			prev=p;
		}
	}
	private Node head;
	private Node tail;
	private int size;
	
	public DoublyLinkedList(){
		 head=null;
		 tail=null;
		 size=0;
		
	}
	public int length(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public void addlast(int e){
		Node newest =new Node(e,null,null);
		if(isEmpty()){
			head=newest;
			tail=newest;
		}else{
			tail.next=newest;
			newest.prev=tail;
			tail=newest;
		}
		size=size+1;
	}
	public void addfirst(int e){
			Node newest=new Node(e,null,null);
			if(isEmpty()){
				head=newest;
				tail=newest;
			}else{
				newest.next=head;
				head.prev=newest;
				head=newest;
			}
			size=size+1;
	}
	public void addany(int e, int pos){
		 Node newest=new Node(e,null,null);
		 if(pos<=0 || pos >=size){
			 System.out.println("Linked List is Empty ");
			 return;
		 }
		Node p=head;
		int i=1;
		while(i<pos-1){
			p=p.next;
			i++;
		}
		newest.next=p.next;
		p.next.prev=newest;
		p.next=newest;
		newest.prev=p;
		size=size+1;
		 
		
	}
	public void removefirst(){
		if(isEmpty()){
			System.out.println("Linked List is Empty ");
		return;
		}
		int e=head.element;
		head=head.next;
		size=size-1;
		if(isEmpty()){
			tail=null;
		}else{
			head.prev=null;
		}
		System.out.print("Removed Data --> "+e+"\n");
	}
	public void removelast(){
		if(isEmpty()){
			System.out.println("Linked List is Empty");
			return;
		}
		int e=tail.element;
		tail=tail.prev;
		tail.next=null;
		size=size-1;
		
		System.out.print("Removed Data --> "+e+"\n");
		
	}
	public void removeany(int pos){
		if(isEmpty()){
			System.out.println("Linked List is Empty ");
			return;
		}
		Node p=head;
		int i=1;
		while(i<pos-1){
			p=p.next;
			i=i+1;
		}
		int e= p.next.element;
		p.next=p.next.next;
		p.next.prev=p;
		size=size-1;
		System.out.print("Removed Data --> "+e+"\n");
		
	}
	
	public void display(){
		Node p=head;
		while(p != null){
			System.out.println(p.element);
			p=p.next;
		}
	}
	public static void main(String []args){
		DoublyLinkedList d=new DoublyLinkedList();
		Scanner sc=new Scanner(System.in);
		int n,in,inl,inf,ina,pos,rm,rmf,rml,rma;
		do{
		System.out.println("---------------------");
		System.out.println(" 1. Insert Data \n 2. Display Data \n 3. Remove Data \n 4. Exit ");
		System.out.println("---------------------");
		System.out.print("Enter In put --> ");
		n = sc.nextInt();         
		switch(n){
			case 1:
			do{
			System.out.println(" 1. Insert Data Last \n 2. Insert Data First \n 3. Insert Data Any Position \n 4. Exit ");
			System.out.print("Enter Input --> ");
			in=sc.nextInt();
			switch(in){
				case 1:
				System.out.print("Enter Data --> ");
				inl=sc.nextInt();
				d.addlast(inl);
				break;
				case 2:
				System.out.print("Enter Data --> ");
				inf=sc.nextInt();
				d.addfirst(inf);
				break;
				case 3:
				System.out.print("Enter Position --> ");
				pos = sc.nextInt();
				System.out.print("Enter Data --> ");
				ina=sc.nextInt();
				d.addany(ina,pos);
				break;
			}
			}while(in!=4);
			break;
			
			case 2:
			System.out.println("Data Are :- ");
			d.display();
			break;
			
			case 3: 
			do{
			System.out.println(" 1. Removed Data First \n 2. Removed Data Last \n 3. Removed Data Any Position \n 4. Exit ");
			System.out.print("Enter Input --> ");
			rm=sc.nextInt();
			switch(rm){
				case 1:
				d.removefirst();
				break;
				case 2:
				d.removelast();
				break;
				case 3:
				System.out.print("Enter Position --> ");
				pos=sc.nextInt();
				d.removeany(pos);
				break;
			}
			}while(rm!=4);
			break;
			
		}
		}while(n!=4);
	}
	
}