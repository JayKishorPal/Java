class A{
public void f1(){
System.out.println("A");
}
}
class B extends A{
public void f2(){
System.out.println("B");
}
}
public class Exam{
public static void main(String []args){
A obj=new B();
obj.f1();
}
}