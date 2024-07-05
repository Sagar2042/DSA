import java.util.*;
public class Linkedlist{
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
	
	public Linkedlist(){
		head = null;
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
		Node newest =new Node(e,null);
		if(isEmpty()){
			head =newest;
		}else{
			tail.next=newest;
		}
		tail=newest;
		size=size+1;
	}
	public void addfirst(int e){
		Node newest=new Node(e,null);
		if(isEmpty()){
			head =newest;
			tail=newest;
		}else{
			newest.next=head;
			head=newest;
		}
		size=size+1;
		
	}
	public void addany(int e,int position){
		if(position<=0||position>=size){
			System.out.println("Invalid position");
		}
		Node newest=new Node(e,null);
		Node p= head;
		int i=1;
		while(i<position-1){
			p=p.next;
			i=i+1;
		}
		newest.next=p.next;
		p.next=newest;
		size=size+1;
	}
	public void removefirst(){
		int e;
		if(isEmpty()){
			System.out.println("Linked List is Empty");
		}
			e=head.element;
			head=head.next;
			size=size-1;
			if(isEmpty()){
				tail=null;
			}
			System.out.print("	Removed Element --> "+e+"\n");
	}
	public void removelast(){
		int i,e;
		Node p;
		if(isEmpty()){
			System.out.println("Linked list is Empty");
		}
		p=head;
		i=1;
		while(i<length()-1){
			p=p.next;
			i++;
		}
		tail=p;
		p=p.next;
		e=p.element;
		tail.next=null;
		size=size-1;
		System.out.print("Removed Element -->"+e+"\n");
	}
	public void removeany(int position){
		Node p;
		int i,e;
			if(isEmpty()){
				System.out.println("Linked list is Empty");
			}
			p=head;
			i=1;
			while(i<position-1){
				p=p.next;
				i=i+1;
			}
			e=p.next.element;
			p.next=p.next.next;
			size = size-1;
			System.out.print("removed Element -->"+e+"\n");
	}
	public int search(int key){
		if(isEmpty()){
			System.out.println("Linked List is Empty");
		}
		Node p=head;
		int i=0;
		while(p!=null){
			if(p.element==key){
				return i;
			}
			p=p.next;
			i++;
		}
		return -1;
	}
	public void display(){
			Node p=head;
			if(p==null){
				System.out.println("Linked List is Empty");
			}
			while(p != null){
				System.out.println(p.element+" ");
				p=p.next;
			}
			System.out.println();
	}

public static void main(String []args){
	//System.out.println("Enter number for inserting ");
	Linkedlist l= new Linkedlist();
	Scanner sc=new Scanner(System.in);
	int n,a,rmb,rme,rma,rm,position;
	do{
	System.out.print("----------------");
	System.out.println("\n 1. Inserting Element \n 2. Display All Element \n 3. Element Remove \n 4. Element Search \n 5. Exit ");
	System.out.print("----------------\n");
	System.out.print("Enter Input -->");
	n=sc.nextInt();
	
	switch(n){
		case 1:
		do{
		System.out.println("		1.Insert In Last \n		2.Insert In Begining \n		3.Enter in any location \n		4.Exit");
		System.out.println("----------------");
		System.out.print("Enter Input -->");
		a=sc.nextInt();
			switch(a){
				case 1:
				System.out.println("Insert Element in last");
				n=sc.nextInt();
				l.addlast(n);
				break;
				case 2:
				System.out.println("Insert Element in Beginging");
				n=sc.nextInt();
				l.addfirst(n);
				break;
				case 3:
				System.out.print("Enter the location ->");
				position=sc.nextInt();
				System.out.print("Enter the Element ->");
				a=sc.nextInt();
				l.addany(a,position);
			}
		}while(a!=4);
		case 2:
		System.out.println("All Element Are :-");
		l.display();
		break;
		case 3:
		do{
		System.out.println(" 		1. Remove for begining \n 		2. Remove from Ending \n 		3. Remove from any position \n 		4. Exit");
		System.out.println("--------------------");
		System.out.print("Enter Input -->");
		rm=sc.nextInt();
		switch(rm){
		case 1:
			l.removefirst();
			break;
		case 2:
			l.removelast();
			break;
			case 3:
			System.out.print("Enter the Position -->");
			position=sc.nextInt();
			l.removeany(position);
			break;
		}
		}while(rm!=4);
		case 4:
		System.out.print("Enter the Key -->");
		int key = sc.nextInt();
		l.search(key);
		int idx=l.search(key);
		System.out.print(" Position --> "+idx+"\n");
		break;
	}
	
	}while(n!=5);
	
	}
}