import java.util.*;
class queue{
    public int n=3;
    public int top1=-1;
    public int top2=-1;
    int s1[]=new int[n];
    int s2[]=new int[n];
    
    public void push1(int x){
        if(top1==n-1){
            System.out.println("overflow");
        }
        else{
            top1++;
            s1[top1]=x;
        }
    }
    
    public void push2(int x){
        if(top2==n-1){
            System.out.println("overflow");
        }
        else{
            top2++;
            s2[top2]=x;
        }
    }
    
    public int pop1(){
        return s1[top1--];
    }
    public int pop2(){
        return s2[top2--];
    }
    int count=0;
    public void enqueue(int x){
        push1(x);
        count++;
    }
    
    public void dequeue(){
        int i,a,b;
        if(top1==-1 && top2==-1){
            System.out.println("Queue empty");
        }
        else{
            for(i=0;i<count;i++){
                a=pop1();
                push2(a);
            }
            b=pop2();
            System.out.println(b);
            count--;
            for(i=0;i<count;i++){
                a=pop2();
                push1(a);
            }
        }
    }
    
    public void display(){
        for(int i=0;i<=top1;i++){
            System.out.println(s1[i]);
        }
    }
    
}
public class QueueUsingStack
{
	public static void main(String[] args) {
		queue s=new queue();
		s.enqueue(3);
		s.enqueue(4);
		s.enqueue(5);
		System.out.println("queue is :");
		s.display();
		System.out.println("pop element :");
		s.dequeue();
		System.out.println("queue is :");
		s.display();
	}
}
