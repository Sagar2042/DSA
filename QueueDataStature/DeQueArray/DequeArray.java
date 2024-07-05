import java.util.Scanner;
public class DequeArray{
	public int length;
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public DequeArray(int n){
		data=new int[n];
		length=n;
		front=0;
		rear=-1;
		size=0;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public boolean isfull(){
		return size==length;
	}
	
	public void insertrear(int e){
		if(isfull()){
			System.out.println("Queue is Full");
			return;
		}
		rear=rear+1;
		if(rear==length){
			rear=0;
		}
		data[rear]=e;
		
		size=size+1;
	}
	
	public void deleterear(){
		if(isEmpty()){
			System.out.println("Queue is Empty ");
			return;
		}
		if(rear==-1){
			rear=length-1;
		}else{
			rear=rear-1;
		}
		int e=data[rear];
		size=size-1;
		System.out.print("Removed Data --> "+e+"\n");
	}
	
	public void insertfront(int e){
		if(isfull()){
			System.out.println("Queue is Full ");
			return;
		}
		if(front==0){
			front=length-1;
		}	
		else {
			front=front-1;
		}
		data[front]=e;
		size=size+1;
	}
	
	public void deletefront(){
		int e;
		if(isEmpty()){
			System.out.println("Queue is Empty ");
			return;
		}
		e=data[front];
		if(front==length){
			front=0;
		}else{
			front=front+1;
		}
		
		size=size-1;
		System.out.print("Deleted Data --> "+e+"\n");
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		
		System.out.println("Data Are : ");
		if(front<rear){
			for(int i=front;i<rear;i++){
				System.out.println(data[i]);
			}
		}else if(front>rear){
			for(int i=front;i<length;i++){
				System.out.println(data[i]);
			}
			for(int i=0;i<=rear;i++){
				System.out.println(data[i]);
			}
		}else{
			System.out.println("Something Error");
		}
		
	}
	
	public static void main(String [] args){
		int n,in,infront,inrear;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array ");
		n=sc.nextInt();
		DequeArray d=new DequeArray(n);
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
			d.insertfront(infront);
			break;
			case 2:
			System.out.print("Enter Data --> ");
			inrear=sc.nextInt();
			d.insertrear(inrear);
			break;
			case 3:
			d.deletefront();
			break;
			case 4:
			d.deleterear();
			break;
			case 5:
			d.display();
			break;
		}
	}while(in!=6);
	}
}