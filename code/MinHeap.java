public class MinHeap{
private int heap[];
private int size;
private int maxsize;

public MinHeap(int maxsize){
this.maxsize=maxsize;
this.size=0;
heap=new int[this.maxsize+1];
heap[0]=Integer.MIN_VALUE;
}

// Function to return the position of parent for the node currently at pos
private int parent(int pos){
return pos/2;
}

//Function to return the position of left child for the node currently at pos
private int leftChild(int pos){
return (pos*2);
}

//Function to return the position of right child for the node currently at pos
private int rightChild(int pos){
return (2*pos)+1;
}

// Function that return true if the passed node is a leaf node
private boolean isLeaf(int pos){
if(pos>=(size/2) && pos<=size){
return true;
}
else{
return false;
}
}

// Function to swap two nodes of the heap
private void swap(int fpos,int spos){
int temp;
temp=heap[fpos];
heap[fpos]=heap[spos];
heap[spos]=temp;
}

// Function to heapify the node at pos
private void minHeapify(int pos){
// if the node is a non-leaf node and greater than any of its child
if(!isLeaf(pos)){
   if(heap[pos]>heap[leftChild(pos)] || heap[pos]>heap[rightChild(pos)]){
       if(heap[leftChild(pos)] < heap[rightChild(pos)]){
           swap(pos,leftChild(pos));
           minHeapify(leftChild(pos));
        }
        else{
           swap(pos,rightChild(pos));
           minHeapify(rightChild(pos));
        }
   }
}
}

// Function to insert a node intothe heap
public void insert(int element){
  if(size>=maxsize){
     return;
   }
  heap[++size]=element;
  int current=size;
  while(heap[current]<heap[parent(current)]){
  swap(current,parent(current));
  current=parent(current);
  }
}

// Function to print the contents of the heap
public void print(){
for(int i=1;i<=size/2;i++){
   System.out.print(" PARENT : "+ heap[i]+" LEFT CHILD :"+ heap[2*i]
                     +" RIGHT CHILD :" + heap[2*i+1]);
   System.out.println();
}
}

//Function to build the min heap using the minHeapify

public void minHeap(){
 for(int pos=(size/2);pos>=1;pos--){
  minHeapify(pos);
 }
}

public static void main(String []args){
System.out.println("The Min Heap is ");
MinHeap minHeap=new MinHeap(15);
minHeap.insert(5);
minHeap.insert(3);
minHeap.insert(17);
minHeap.insert(10);
minHeap.insert(84);
minHeap.insert(19);
minHeap.insert(6);
minHeap.insert(22);
minHeap.insert(9);
//minHeap.minHeap();

minHeap.print();
}
}
