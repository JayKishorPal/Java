import java.util.*;
class BinarySearch{
public int binarySearch(int a[],int l,int r,int x){
if(r>=l){
int mid=l+(r-1)/2;
if(a[mid]==x){
return mid;
}

if(a[mid]>x){
return binarySearch(a,l,mid-1,x);
}
else{
return binarySearch(a,mid+1,r,x);
}
}
return -1;
}

public static void main(String []args){
Scanner x=new Scanner(System.in);
int n=x.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=x.nextInt();
}
int b=x.nextInt();
BinarySearch ob=new BinarySearch();
int result=ob.binarySearch(a,0,n-1,b);
if(result==-1){
System.out.println("Element not present");
}
else{
System.out.println("Element found at index "+ result);
}
}
}
