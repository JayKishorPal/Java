class CircularList{
Node last;
class Node{
public int data;
Node next;

public Node(int data){
this.data=data;
}
}

// creation of circular linked list
public void createCircularList(){
Node first=new Node(1);
Node second=new Node(5);
Node third=new Node(10);
Node fourth=new Node(15);

first.next=second;
second.next=third;
third.next=fourth;
fourth.next=first;
last=fourth;
}

//Display of list

public void display(){
if(last==null){
return;
}
Node first=last.next;
while(first!=last){
System.out.print(first.data+"->");
first=first.next;
}
System.out.println(first.data);
}

// insertion of node at the beginning of list
public void insertAtBegin(int data){
Node new_node=new Node(data);
if(last==null){
last=new_node;
}
else{
new_node.next=last.next;
}
last.next=new_node;
}

// insertion of node at last of list

public void insertAtEnd(int data){
Node new_node=new Node(data);
if(last==null){
last=new_node;
last.next=last;
}
else{
new_node.next=last.next;
last.next=new_node;
last=new_node;
}
}

// deletion of first node of list
public int deleteFirst(){
Node first=last.next;
last.next=first.next;
first.next=null;
return(first.data);
}

//deletion of last node of list
public int deleteLast(){
Node first=last.next;
while(first.next!=last){
first=first.next;
}
first.next=last.next;
last.next=null;
return(last.data);
}

public static void main(String []args){
CircularList a=new CircularList();
a.createCircularList();
a.display();
a.insertAtBegin(4);
a.display();
a.insertAtEnd(20);
a.display();
System.out.println(a.deleteFirst());
a.display();
}
}