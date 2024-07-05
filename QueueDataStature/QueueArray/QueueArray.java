import java.util.Scanner;
public class QueueArray{
		private int data[];
		private int size;
		private int front;
		private int rear;
	
	
	public QueueArray(int n){
		data = new int[n];
		front=0;
		rear =0;
		size=0;
	}
	public int length(){
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	public boolean isfull(){
		return size==data.length;
	}
	
	public void enqueue(int e){
		if(isfull()){
			System.out.println("Queue is full ");
			return;
		}
		data[rear]=e;
		rear=rear+1;
		size=size+1;
	}
	public void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty ");
			return;
		}
	
		int e=data[front];
		front=front+1;
		size=size-1;
		System.out.println("Deleted Data --> "+e+"\n");
		
	}
	public void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println("Data Are : ");
		for(int i=front; i<rear;i++){
			System.out.println(data[i]);
		}
	}
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int n,in,eq;
		System.out.println("Enter the Size of Array ");
		n= sc.nextInt();
		System.out.println("Size of Array : "+n);
		QueueArray q=new QueueArray(n);
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