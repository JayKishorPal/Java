import java.util.*;
class Event{
public String name;
public String detail;
public String ownerName;
public Event(String name,String detail,String ownerName){
this.name=name;
this.detail=detail;
this.ownerName=ownerName;
}
public double projectedRevenue(){
return (0.0);
}
}
class Exhibition extends Event{
public Integer noOfStall;
public Exhibition(String name,String detail,String ownerName,Integer noOfStall){
super(name,detail,ownerName);
this.noOfStall=noOfStall;
}
public double projectedRevenue(){
double d=(double)10000*noOfStall;
return d;
}
}
class StageEvent extends Event{
public Integer noOfShows;
public Integer noOfSeatsPerShow;
public StageEvent(String name,String detail,String ownerName,Integer noOfShows,Integer noOfSeatsPerShow){
super(name,detail,ownerName);
this.noOfShows=noOfShows;
this.noOfSeatsPerShow=noOfSeatsPerShow;
}
public double projectedRevenue(){
double d=(double)50*noOfShows*noOfSeatsPerShow;
return d;
}
}
public class Simple{
public static void main(String []args){
Scanner x=new Scanner(System.in);
String name=x.nextLine();
String detail=x.nextLine();
String ownerName=x.nextLine();
int n=x.nextInt();
x.nextLine();
if(n==1){
Integer noOfStall=Integer.parseInt(x.nextLine());
Exhibition e=new Exhibition(name,detail,ownerName,noOfStall);
System.out.println(e.projectedRevenue());
}
if(n==2){
Integer noOfShows=Integer.parseInt(x.nextLine());
Integer noOfSeatsPerShow=Integer.parseInt(x.nextLine());
StageEvent s=new StageEvent(name,detail,ownerName,noOfShows,noOfSeatsPerShow);
System.out.println(s.projectedRevenue());
}
}
}