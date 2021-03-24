import java.util.*;
class queue{
    public int rear=-1;
    public int front=-1;
    public int n=3;
    int a[]=new int[n];
    
    public void enqueue(int b){
        //int n;
        //int a[]=new int[n];
        if(rear==n-1){
            System.out.println("Overflow");
        }
        else if(front==-1 && rear==-1){
            rear=0;front=0;
            a[rear]=b;
        }
        else{
            rear++;
            a[rear]=b;
        }
    }
    
    public void dequeue(){
        if(rear==-1 && front==-1){
            System.out.println("underflow");
        }
        else if(front==rear){
            front=-1;rear=-1;
        }
        else{
            System.out.println(a[front]);
            front--;
        }
    }
    
    public void display(){
        for(int i=front;i<rear+1;i++){
            System.out.println(a[i]);
        }
    }
}
public class Queue
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		//int n=x.nextInt();
		//int a[]=new int[n];
	    queue s=new queue();
		s.enqueue(5);
		s.enqueue(3);
		s.enqueue(4);
		//s.push(2);
		s.display();
		s.dequeue();
		/*s.pop();
		s.pop();
		s.pop();
		*/
	}
}
