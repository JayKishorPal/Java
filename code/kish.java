import java.util.*;
abstract class Themepark{
  public int adultTicket;
public int childrenTicket;
 int display(){
return((adultTicket*500)+(childrenTicket*300));
}
abstract void playGame(int Games[]);
}

class Queensland extends Themepark{
//int Games[]=new int[30];
/*Scanner a=new Scanner(System.in);
for(int i=0;i<30;i++){
Games[i]=a.nextInt();
}*/
void playGame(int Games[]){
for(int i=0;i<Games.length;i++){
if(i==0){
System.out.println("Playing game "+Games[0]+" at Queensland");
}
else{
for(int j=0;j<i;j++){

if(Games[i]==Games[j]){
//System.out.println("Playing game "+Games[i]+" at Queensland");
System.out.println("You have already played game "+Games[i]);
break;
}
else{
if(j==i-1){
System.out.println("Playing game "+Games[i]+" at Queensland");
}
}
}
}
}
}
}
class Wonderla extends Themepark{
//int Games[]=new int[40];
/*Scanner b=new Scanner(System.in);
for(int i=0;i<40;i++){
Games[i]=b.nextInt();
}*/
void playGame(int Games[]){
for(int i=0;i<Games.length;i++){
for(int j=0;j<i;j++){
if(Games[i]==Games[j]){
System.out.println("Playing Game "+Games[i]+" again at Wonderla");
}
else{
if(j==i){
System.out.println("Playing game "+Games[i]+" at Wonderla");
}
}
}
}
}
}
public class kish{
public static void main(String []args){
Scanner x=new Scanner(System.in);
int n=x.nextInt();

if(n==1){
int a=x.nextInt();
int b=x.nextInt();
int Games[]=new int[a+b];
for(int i=0;i<Games.length;i++){
Games[i]=false;
}
System.out.println("Welcome to Queensland!");
Queensland q=new Queensland();
q.playGame(Games);
}

if(n==2){
int a=x.nextInt();
int b=x.nextInt();
int Games[]=new int[a+b];
for(int i=0;i<Games.length;i++){
Games[i]=x.nextInt();
}
System.out.println("Welcome to Wonderla!");
Wonderla s=new Wonderla();
s.playGame(Games);
}
}
}