import java.util.*;
import java.text.*;
import java.io.*;
class Event{
public String name;
public String detail;
public String type;
public String ownerName;
public double costPerDay;
public Event(String name,String detail,String type,String ownerName,double costPerDay){
this.name=name;
this.detail=detail;
this.type=type;
this.ownerName=ownerName;
this.costPerDay=costPerDay;
}
}
class Exhibition extends Event{
public Integer noOfStall;
public Exhibition(String name,String detail,String type,String ownerName,double costPerDay,Integer noOfStall){
super(name,detail,type,ownerName,costPerDay);
this.noOfStall=noOfStall;
}
}
class StageEvent extends Event{
//public Integer noOfShows;
public Integer noOfSeats;
public StageEvent(String name,String detail,String type,String ownerName,double costPerDay,Integer noOfSeats){
super(name,detail,type,ownerName,costPerDay);
//this.noOfShows=noOfShows;
this.noOfSeats=noOfSeats;
}
}
public class GST{
public static void main(String []args){
Scanner x=new Scanner(System.in);
int n=x.nextInt();
if(n==1){
String name=x.nextLine();
String detail=x.nextLine();
String type=x.nextLine();
String ownerName=x.nextLine();
x.nextLine();
double costPerDay=x.nextDouble();
x.nextLine();
Integer noOfStall=Integer.parseInt(x.nextLine());
SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
String startingDate=x.nextLine();
String endingDate=x.nextLine();
try{
Date startDate=df.parse(startingDate);
Date endDate=df.parse(endingDate);
long difference=endDate.getTime()-startDate.getTime();
double daysBetween=(difference/(1000*60*60*24));
System.out.println((costPerDay*daysBetween)*5/100);
}
catch(ParseException e){
System.out.println("unable to parse"+ startingDate+" "+endingDate);
}
Exhibition e=new Exhibition(name,detail,type,ownerName,costPerDay,noOfStall);
}
if(n==2){
String name=x.nextLine();
String detail=x.nextLine();
String type=x.nextLine();
String ownerName=x.nextLine();
x.nextLine();
double costPerDay=x.nextDouble();
x.nextLine();
Integer noOfSeats=Integer.parseInt(x.nextLine());
SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
String startingDate=x.nextLine();
String endingDate=x.nextLine();
try{
Date startDate=df.parse(startingDate);
Date endDate=df.parse(endingDate);
long difference=endDate.getTime()-startDate.getTime();
double daysBetween=(difference/(1000*60*60*24));
System.out.println((costPerDay*daysBetween)*15/100);
}
catch(ParseException e){
System.out.println("unable to parse"+ startingDate+" "+endingDate);
}
StageEvent s=new StageEvent(name,detail,type,ownerName,costPerDay,noOfSeats);
}
}
}