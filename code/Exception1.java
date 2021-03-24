class Exception1{
public static void main(String []args){
int x=5;
int y=0;
try{
System.out.println(x/y);
}
catch(NullPointerException e){
System.out.println(e.getMessage());
}
catch(ArithmeticException e){
System.out.println(e.getMessage());
}
}
}