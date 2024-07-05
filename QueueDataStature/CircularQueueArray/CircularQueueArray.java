import java.util.Scanner;
public class CircularQueueArray{
	
	private int front;
	private int rear;
	private int size;
	private int len;
	private int data[];
	
	public CircularQueueArray(int n){
		data =new int[n];
		front=-1;
		rear=-1;
		size=0;
	}
	public int length(int n){
		len=n;
		return len; 
	}
	public boolean isEmpty(){
		return size==0;
	}
	public boolean isfull(){
		return ((front==0 && rear == data.length-1)|| front==rear+1);
	}
	
	public void enqueue(int e){
		if(size==0){
			front=-1;
			rear=-1;
		}
		if(isfull()){
			System.out.println("Queue is Full");
			return;
		}
		
		if(rear==data.length-1){
			rear=0;
		}else{
			rear=rear+1;
		}
		data[rear]=e;
		size=size+1;
	}
	
	public void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		if(front==data.length||front==-1){
			front=0;
		}
		int e=data[front];
		front=front+1;
		size=size-1;
		
		System.out.println("Removed Data --> "+e+"\n");
	}
	public void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
	System.out.println("Data Are : ");
	
	if(front==-1){
		front=0;
	}
	int i=front;
	while(i!=rear){
		System.out.println(data[i]);
		i=(i+1)%data.length;
	}
		System.out.println(data[i]);
	}
	
	public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		int n,in,eq;
		System.out.println("Enter the Size of Array ");
		n= sc.nextInt();
		System.out.println("Size of Array : "+n);
		CircularQueueArray q=new CircularQueueArray(n);
		q.length(n);
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