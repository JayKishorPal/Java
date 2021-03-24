import java.util.*;
class Sort{

public void bubbleSort(int a[]){
int n=a.length;
int flag;
for(int i=0;i<n-1;i++){
flag=0;
for(int j=0;j<n-i-1;j++){
if(a[j]>a[j+1]){
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
flag=1;
}
}
if(flag==0){
break;
}
}
}

// Insertion sort
public void insertionSort(int a[],int n){
for(int i=1;i<n;i++){
int temp=a[i];
int j=i-1;
while(j>=0 && a[j]>temp){
a[j+1]=a[j];
j--;
}
a[j+1]=temp;
}
}

// Selection sort
public void selectionSort(int a[],int n){
for(int i=0;i<n;i++){
int min=i;
for(int j=i+1;j<n;j++){
if(a[min]>a[j]){
min=j;
}
int temp=a[min];
a[min]=a[i];
a[i]=temp;
}
}
}

// Quick sort 
public int partition(int a[],int low,int high){
int start=low;
int end=high;
int pivot=a[low];
while(start<end){
while(a[start]<=pivot){
start++;
}
while(a[end]>pivot){
end--;
}
if(start<end){
int temp=a[start];
a[start]=a[end];
a[end]=temp;
}
}
int t=a[low];
a[low]=a[end];
a[end]=t;
return end;
}

public void quickSort(int a[],int low,int high){
if(low<high){
int loc=partition(a,low,high);
quickSort(a,low,loc-1);
quickSort(a,loc+1,high);
}
}
public void display(int a[]){
int b=a.length;
for(int i=0;i<b;i++){
System.out.print(a[i]+" ");
}
System.out.println();
}
}
class Sorting{
public static void main(String []args){
Scanner x=new Scanner(System.in);
int n=x.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=x.nextInt();
}
System.out.println("array before sorting :");
Sort obj=new Sort();
obj.display(a);
//obj.bubbleSort(a);
//obj.insertionSort(a,n);
//obj.selectionSort(a,n);
obj.quickSort(a,0,n-1);
System.out.println("array after sorting :");
obj.display(a);
}
}