import java.util.*;
class ArrayList{
public static void main(String []args){
Scanner x=new Scanner(System.in);
int n=x.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=x.nextInt();
}
ArrayList<Integer> umar=new ArrayList<Integer>();
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
umar.add(a[i]);
}
}
}
System.out.println(umar);
}
}