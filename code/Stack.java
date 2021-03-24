import java.util.*;
class stack{
    public int top=-1;
    public int n=3;
    int a[]=new int[n];
    
    public void push(int b){
        //int n;
        //int a[]=new int[n];
        if(top==n-1){
            System.out.println("Overflow");
        }
        else{
            top++;
            a[top]=b;
        }
    }
    
    public void pop(){
        if(top==-1){
            System.out.println("underflow");
        }
        else{
            System.out.println(a[top]);
            top--;
        }
    }
    
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
public class Stack
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		//int n=x.nextInt();
		//int a[]=new int[n];
		stack s=new stack();
		s.push(5);
		s.push(3);
		//s.push(4);
		//s.push(2);
		s.display();
		s.pop();
		/*s.pop();
		s.pop();
		s.pop();
		*/
	}
}