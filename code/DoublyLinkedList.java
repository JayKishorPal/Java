class DoublyLinkedList{
 
static Node head;
static Node tail;
private static int length;

private static class Node{
private int data;
private Node next;
private Node prev;

public Node(int data){
this.data=data;
}
}
public DoublyLinkedList(){
this.head=null;
this.tail=null;
this.length=0;
}

public boolean isEmpty(){
return length==0;
}

public int length(){
return length;
}

// insert at Last
public void insertLast(int data){
Node newNode=new Node(data);
if(isEmpty()){
head=newNode;
}
else{
tail.next=newNode;
}
newNode.prev=tail;
tail=newNode;
length++;
}

// insert at beginning

public void insertBegin(int data){
Node newNode=new Node(data);
if(isEmpty()){
tail=newNode;
}
else{
head.prev=newNode;
}

newNode.next=head;
head=newNode;
length++;
}
public void displayForward(){
if(head==null){
return;
}

Node current=head;
while(current!=null){
System.out.print(current.data+"->");
current=current.next;
}
System.out.println("null");
}

public void displayBackward(){
if(tail==null){
return;
}
Node current=tail;
while(current!=null){
System.out.print(current.data+"->");
current=current.prev;
}
System.out.println("null");
}
// reverse list
static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
           DoublyLinkedListNode temp=null;
           DoublyLinkedListNode current=head;
           while(current!=null){
               temp=current.prev;
               current.prev=current.next;
               current.next=temp;
               current=current.prev;
           }
           if(temp!=null){
               head=temp.prev;
           }
            return head;
    }


public static void main(String []args){
DoublyLinkedList a=new DoublyLinkedList();
//a.head=new Node(2);
a.insertLast(1);
a.insertLast(10);
a.insertLast(15);
a.insertBegin(12);
a.displayForward();
a.displayBackward();
}
}