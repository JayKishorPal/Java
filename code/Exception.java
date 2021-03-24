class Exception{
public static void main(String []args){
int balance=5000;
int withdrawAmount=3000;
try{
if(balance<withdrawAmount){
throw new ArithmeticException("Insufficient balance");
}
balance=balance-withdrawAmount;
System.out.println("transaction completed");
}
catch(NullPointerException e){
System.out.println(e.getMessage());
}
catch(ArithmeticException e){
System.out.println(e.getMessage());
}
finally{
System.out.println("kishor");
}
}
}