import java.util.*;
import java.text.*;
abstract class Account{
public String name;
public int number;
public int balance;
public Date startDate;
public Date endDate;
public Account(String name,int number,int balance,Date startDate,Date endDate){this.name=name;
this.number=number;
this.balance=balance;
this.startDate=startDate;
this.endDate=endDate;
}
abstract double calculateInterest(int a);
abstract int monthsDifference(Date startDate,Date endDate);
/*Calendar c1=new GregorianCalendar();
c1.etTime(startDate);
Calendar c2=new GregorianCalendar();
c2.setTime(endDate);
int ans=(c2.get(c2.YEAR)-c1.get(c1.YEAR))*12;
ans+=c2.get(c2.MONTH)-c1.get(c1.MONTH);

return ans;
}*/
}
class CurrentAccount extends Account{
public CurrentAccount(String name,int number,int balance,Date startDate,Date endDate){
super(name,number,balance,startDate,endDate);
}
//double calculateInterest(int b){
public int monthsDifference(Date startDate,Date endDate){
Calendar c1=new GregorianCalendar();
c1.setTime(startDate);
Calendar c2=new GregorianCalendar();
c2.setTime(endDate);
int ans=(c2.get(c2.YEAR)-c1.get(c1.YEAR))*12;
ans+=c2.get(c2.MONTH)-c1.get(c1.MONTH);

return ans/12;
}
double calculateInterest(int b){
int s=(balance*12*b)/100;
double interest=(double)s;
return interest;
}
}
class SavingAccount extends Account{
public SavingAccount(String name,int number,int balance,Date startDate,Date endDate){
super(name,number,balance,startDate,endDate);
}
public int monthsDifference(Date startDate,Date endDate){
Calendar c1=new GregorianCalendar();
c1.setTime(startDate);
Calendar c2=new GregorianCalendar();
c2.setTime(endDate);
int ans=(c2.get(c2.YEAR)-c1.get(c1.YEAR))*12;
ans+=c2.get(c2.MONTH)-c1.get(c1.MONTH);

return ans/12;
}
double calculateInterest(int c){
int s=(balance*5*c)/100;
double interest=(double)s;
return interest;
}
}

public class Bank{
public static void main(String []args){
Scanner x=new Scanner(System.in);
int n=x.nextInt();
if(n==1){
String name=x.next();
int number=x.nextInt();
int balance=x.nextInt();
SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
String startingDate=x.next();
String endingDate=x.next();
try{
Date startDate=df.parse(startingDate);
Date endDate=df.parse(endingDate);
CurrentAccount c=new CurrentAccount(name,number,balance,startDate,endDate);
int a=c.monthsDifference(startDate,endDate);
System.out.println(c.calculateInterest(a));
}
catch(ParseException e){
System.out.println("unable to parse"+ startingDate+" "+endingDate);
}
}
if(n==2){
String name=x.next();
int number=x.nextInt();
int balance=x.nextInt();
SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
String startingDate=x.nextLine();
String endingDate=x.nextLine();
try{
Date startDate=df.parse(startingDate);
Date endDate=df.parse(endingDate);
SavingAccount s=new SavingAccount(name,number,balance,startDate,endDate);
int a=s.monthsDifference(startDate,endDate);
System.out.println(s.calculateInterest(a));
}
catch(ParseException e){
System.out.println("unable to parse"+ startingDate+" "+endingDate);
}
}
}
}
