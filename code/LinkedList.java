class LinkedList{
static Node head;
private static class Node{
private int data;
private Node next;
public Node(int data){
this.data=data;
this.next=null;
}
}

public void addAtBegin(int data){
Node new_node=new Node(data);
if(head==null){
head=new_node;
}
new_node.next=head;
head=new_node;
}

public void display(Node node){

Node current=node;
while(current!=null){
System.out.print(current.data+"->");
current=current.next;
}
System.out.println(current);
}
// Add node afterNode 
public void addAfter(Node node,int data){
Node new_node=new Node(data);
new_node.next=node.next;
node.next=new_node;
}

// Add At last

public void addLast(int data){
Node new_node=new Node(data);
if(head==null){
head=new Node(data);
return;
}
Node current=head;
while(current.next!=null){
current=current.next;
}
current.next=new_node;
}
//Insert at given position

public void addAtPostion(int pos,int data){
Node new_node=new Node(data);
int count=1;
Node current=head;
while(count<pos-1){
count++;
current=current.next;
}
new_node.next=current.next;
current.next=new_node;
}
// Reverse the list

public Node reverseList(Node node){
Node current=node;
Node next=null;
Node prev=null;
while(current!=null){
next=current.next;
current.next=prev;
prev=current;
current=next;
}
//node=head;
return prev;
}

//Length of List
public int length(Node node){
if(node==null){
return 0;
}
Node current=node;
int count=1;
while(current.next!=null){
count++;
current=current.next;
}
return count;
}

//Delete first Node 
public Node deleteFirst(Node node){
Node current=node;
Node t=null;
node=current.next;
current.next=t;
return current;
}
// Delete n node at given postion
public Node deleteAtPostion(Node head,int pos){
Node prev=head;
//Node t=null;
int count=1;
while(count<pos-1){
count++;
prev=prev.next;
}
Node current=prev.next;
prev.next=current.next;
current.next=null;
return current;
}
// find the middle term 
public Node middleNode(Node node){
Node slow=head;
Node fast=head;
while(fast!=null && fast.next!=null){
slow=slow.next;
fast=fast.next.next;
}
return slow;
}
// Find nth node from end
public Node nthNodeEnd(Node node, int n){
Node ref=head;
Node main=head;
int count=0;
while(count<n){
ref=ref.next;
count++;
}
while(ref!=null){
ref=ref.next;
main=main.next;
}
return main;
}
public static void main(String []args){
LinkedList a=new LinkedList();
a.head=new Node(6);

a.addAtBegin(10);
a.display(head);
a.addAtBegin(7);
a.addAtBegin(12);
a.display(head);
a.addAfter(a.head.next.next,8);
a.display(head);
a.addLast(45);
a.display(head);
System.out.println(a.length(head));
a.addAtPostion(4,4);
a.display(head);

//Node d=a.reverseList(head);
Node s=a.nthNodeEnd(head,2);
System.out.println(s.data);
//Node r=a.middleNode(head);
//System.out.println(r.data);
//Node d=a.deleteFirst(head);
//System.out.println(d.data);


}
}
