import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
int n=x.nextInt();
x.nextLine();
String a[]=new String[n];
//String t=x.nextLine();
for(int i=0;i<n;i++){
a[i]=x.nextLine();
}
String t=x.nextLine();
ArrayList<String> umar=new ArrayList<String>();
for(int i=0;i<n;i++){
    umar.add(a[i]);
}
Collections.sort(umar);

for(String i:umar){
    System.out.print(i+" ");
}
System.out.println(umar.indexOf(t));
}	
}
