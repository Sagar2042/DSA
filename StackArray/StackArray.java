import java.util.Scanner;
public class StackArray{
	private int data[];
	private int top;
	
	public StackArray(int n){
		data =new int[n];
		top=0;
	}
	
	public int length(){
		return top;
	}
	
	public boolean isEmpty(){
		return top==0;
	}
	
	public boolean isfull(){
		return top==data.length;
	}
	
	public void push(int e){
		if(isfull()){
			System.out.println("Stack is Full ");
		return;
		}
		data[top]=e;
		top=top+1;
		System.out.print("Pushed Element --> "+e+"\n");
	}
	
	public void pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty ");
			return;
		}
		int e=data[top-1];
		top=top-1;
		System.out.print("Poped Element --> "+e+"\n");
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Stack is Empty ");
		}
		System.out.println("Data Are :- ");
		for(int i=0;i<top;i++){
			System.out.print(data[i]+"\n");
		}
	}
	
	
	public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		int in,pus,pop,n;
		System.out.println("Enter Size of Stack");
		n=sc.nextInt();
		System.out.println("Size of Stack is "+n);
		StackArray s=new StackArray(n);
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