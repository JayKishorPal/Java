class LinkedList1{
static Node head;
private static class Node{
private int data;
private Node next;
public Node(int data){
this.data=data;
this.next=null;
}
}
public void push(int data){
Node new_node=new Node(data);
if(head==null){
head=new_node;
}
new_node.next=head;
head=new_node;
}

public void display(Node node){
if(node==null){
return;
}
Node current=node;
while(current!=null){
System.out.print(current.data+"->");
current=current.next;
}
System.out.println(current);
}

// Remove duplicate from sorted linked list
public void removeDuplicate(){
if(head==null){
return;
}
Node current=head;
while(current!=null && current.next!=null){
if(current.data==current.next.data){
current.next=current.next.next;
}
else{
current=current.next;
}
}
}

// Insert node in a sorted linked list
public void insertSort(int data){
Node new_node=new Node(data);
Node current=head;
Node t=null;
while(current!=null && current.data<new_node.data){
t=current;
current=current.next;
}
new_node.next=current;
t.next=new_node;

}

public static void main(String []args){
LinkedList1 a=new LinkedList1();
a.head=new Node(17);
a.push(16);
a.push(16);
a.push(14);
a.push(12);
a.push(12);
a.display(head);
a.removeDuplicate();
a.display(head);
a.insertSort(15);
a.display(head);
}
}