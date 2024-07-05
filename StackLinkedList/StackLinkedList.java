import java.util.Scanner;
public class StackLinkedList{
	
	class Node{
		int element;
		Node next;
		
		public Node(int e,Node n){
			element =e;
			next=n;
		}
	}
	private Node top;
	private int size=0;
	public StackLinkedList(){
		top=null;
	}
	
	public int length(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	
	public void push(int e){
		Node newest = new Node(e,null);
		if(isEmpty()){
			top = newest;
		}else{
			newest.next=top;
			top=newest;
		}
	size =size+1;
	}
	
	public void pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty ");
		return;
		}
		int e= top.element;
		top=top.next;
		size =size-1;
		System.out.print("Poped Element --> "+e+"\n");
		
	}
	public void display(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Stack Are --> ");
		Node p= top;
		while(p!=null){
			System.out.println(p.element);
			p=p.next;
			
			
		}
		
		
	}
	
	public static void main(String []args){
		StackLinkedList s=new StackLinkedList();
		Scanner sc=new Scanner(System.in);
		int in,pus,pop,n;
		do{
		System.out.println("-------------------");
		System.out.println(" 1. Push \n 2. Pop \n 3. Display \n 4. Exit");
		System.out.println("-------------------");
		System.out.print("Enter Input --> ");
		in=sc.nextInt();
		switch(in){
			case 1:
			System.out.print("Enter Data --> ");
			pus=sc.nextInt();
			s.push(pus);
			break;
			case 2:
			s.pop();
			break;
			case 3:
			s.display();
			break;
		}
		}while(in!=4);
	
	}
	
}