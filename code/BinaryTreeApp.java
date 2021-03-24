import java.lang.*;
class TreeNode{
int data;
TreeNode left;
TreeNode right;
}
class BinaryTree{
public TreeNode createNewNode(int data){
TreeNode a=new TreeNode();
a.data=data;
a.left=null;
a.right=null;
return a;
}

public void inorder(TreeNode node){
if(node == null){
return;
}
inorder(node.left);
System.out.print(node.data+" ");
inorder(node.right);
}

public void preorder(TreeNode node){
if(node == null){
return;
}
System.out.print(node.data+" ");
preorder(node.left);
preorder(node.right);
}

public void postorder(TreeNode node){
if(node == null){
return;
}
postorder(node.left);
postorder(node.right);
System.out.print(node.data+" ");
}

public int getSumOfNode(TreeNode node){
if(node == null){
return 0;
}
return node.data + getSumOfNode(node.left) + getSumOfNode(node.right);
}

// Difference of values at even and odd level
public int differenceOfEvenOdd(TreeNode node){
       if(node==null){
           return 0;
       }
       return node.data - differenceOfEvenOdd(node.left) - differenceOfEvenOdd(node.right);
}

// Get number of nodes in a binary tree
public int getNumberOfNodes(TreeNode node){
if(node==null){
return 0;
}
return 1 + getNumberOfNode(node.left) + getNumberOfNodes(node.right);
}

//Get number of leaf nodes 
public int getNumberOfLeafNode(TreeNode node){
if(node==null){
return 0;
}
if(node.left==null && node.right==null){
return 1;
}

return getNumberOfLeafNode(node.left) + getNumberOfLeafNode(node.right);
}

// Get height of a binary tree
public int getHeightOfTree(TreeNode node){
if(node==null){
return -1;
}
return Math.max(getHeightOfTree(node.left),getHeightOfTree(node.right)) +1;
}

// print elements at given level

public void printAtGivenLevel(TreeNode node, int level){
if(node==null){
return;
}
if(level==1){
System.out.print(node.data+" ");
return;
}
printAtGivenLevel(node.left,level-1);
printAtGivenLevel(node.right,level-1);
}

// print elements in level order
public void levelOrderTraversalUsingRecursion(TreeNode node){
if(node==null){
return;
}
int height=getHeightOfTree(node);
for(int i=0;i<=height;i++){
printAtGivenLevel(node,i+1);
System.out.println();
}
}

// print left view of binary tree
int maxLevel=0;
public void leftViewOfTree(TreeNode node, int level){
if(node==null){
return;
}
if(level>=maxLevel){
System.out.print(node.data+" ");
maxLevel++;
}
leftViewOfTree(node.left,level+1);
leftViewOfTree(node.right,level+1);
}

// print right view of binary tree
int maxLevel=0
public void rightViewOfTree(TreeNode node,int level){
if(node==null){
return;
}
if(level>=maxLevel){
System.out.print(node.data+" ");
maxLevel++;
}
rightViewOfTree(node.right,level+1);
rightViewOfTree(node.left,level+1);
}

// convert a binnary tree to its mirror tree

public TreeNode mirrorTree(TreeNode node){
if(node==null){
return null;
}

TreeNode t=node.left;
node.left=node.right;
node.right=t;

mirrorTree(node.left);
mirrorTree(node.right);
return node;
}

// Delete the binary tree

public TreeNode deleteNode(TreeNode node){
if(node==null){
return null;
}
node.left=deleteNode(node.left);
node.right=deleteNode(node.right);
System.out.println("deleting node :"+node.data);
node=null;
return node;
}

// check if two binary trees are identical
public boolean isIdentical(TreeNode t1,TreeNode t2){
if(t1==null && t2==null){
return true;
}
if(t1==null || t2==null){
return false;
}
return t1.data==t2.data && isIdentical(t1.left,t2.left) && isIdentical(t1.right,t2.right);
}

// get level of a given node
public int getLevelOfNode(TreeNode node,int val,int level){
if(node==null){
return 0;
}
int l;
if(node.data==val){
return level;
}

l=getLevelOfNode(node.left,val,level+1);
if(l!=0){
return l;
}

l=getLevelOfNode(node.right,val,level+1);
return l;
}

// print top view of binary tree(add one more int type height as key in TreeNode)

public void topView(TreeNode node){
if(node==null){
return;
}
TreeMap<Integer,Integer> m=new TreeMap<Integer,Integer>();

Queue<TreeNode> q=new LinkedList<TreeNode>();
q.add(node);
while(!q.isEmpty()){
TreeNode temp=q.remove();
int hd=temp.height;

if(m.get(hd)==null){
m.put(hd,temp.data);
}

if(temp.left!=null){
temp.left.height=hd-1;
q.add(temp.left);
}

if(temp.right!=null){
temp.right.height=hd+1;
q.add(temp.right);
}
}
System.out.println(m.values());
}

// print bottom view of binary tree
public void bottomView(TreeNode node){
if(node==null){
return;
}
TreeMap<Integer,Integer>m=new TreeMap<Integer,Integer>();
Queue<TreeNode> q=new LinkedList<TreeNode>();
q.add(node);
while(!q.isEmpty()){
TreeNode temp=q.remove();
int hd=temp.height;

m.put(hd,temp.data);

if(temp.left!=null){
temp.left.height=hd-1;
q.add(temp.left);
}

if(temp.right!=null){
temp.right.height=hd+1;
q.add(temp.right);
}
}
System.out.println(m.values());
}

// print the boundry nodes in binary tree
public void printBoundary(TreeNode node){
if(node!=null){
System.out.print(node.data+" ");
}
printLeftBoundary(node.left);
printLeaves(node.left);
printLeaves(node.right);
printRightBoundary(node.right);
}
// print left boundary of binary tree
public void printLeftBoundary(TreeNode node){
if(node==null){
return;
}
if(node.left!=null){
System.out.print(node.data+" ");
printLeftBoundary(node.left);
}
else if(node.right!=null){
System.out.print(node.data+" ");
printLeftBoundary(node.right);
}
}

// print leaf node of binary tree
public void printLeaves(TreeNode node){
if(node==null){
return;
}
printLeaves(node.left);
if(node.left==null && node.right==null){
System.out.print(node.data+" ");
}
printLeaves(node.right);
}

// print right boundary of binary tree
public void printRightBoundary(TreeNode node){
if(node==null){
return;
}

if(node.right!=null){
printRightBoundary(node.right);
System.out.print(node.data+" ");
}
else if(node.left!=null){
printRightBoundary(node.left);
System.out.print(node.data+" ");
}
}

// Search an element in binary tree(using recursive)
public boolean recursiveSearch(TreeNode node,int key){
if(node==null){
return false;
}

if(node.data==key){
return true;
}
return recursiveSearch(node.left,key) || recursiveSearch(node.right,key);
}

// search an element in binary tree(using iterative method)
public boolean iterativeSearch(TreeNode node,int key){
if(node==null){
return false;
}

Queue<TreeNode> q=new LinkedList<TreeNode>();
q.add(node);
while(!q.isEmpty()){
TreeNode temp=q.remove();

if(temp.data==key){
return true;
}

if(temp.left!=null){
q.add(temp.left);
}

if(temp.right!=null){
q.add(temp.right);
}
}
return false;
}

// print elements between any two given level of binary tree
public void printBetweenTwoLevel(TreeNode node, int min, int max){
if(node==null){
return;
}
Queue<TreeNode> q=new Linkedlist<TreeNode>();
q.add(node);
int l=1;
while(true){
int size=q.size();
if(size==0 || l>max){
break;
}
while(size>0){
TreeNode t=q.remove();
if(l>min && l<max){
System.out.print(t.data+" ");
}
if(t.left!=null){
q.add(t.left);
}

if(t.right!=null){
q.add(t.right);
}
size--;
}
l++;
}
}

// Get the maximun width of binary tree

public int getMaxWidth(TreeNode node){
if(node==null){
return 0;
}
Queue<TreeNode> q=new LinkedList<TreeNode>();
q.add(node);
int maxWidth=1;

while(true){
int size=q.size();
if(size==0){
break;
}
if(size>maxWidth){
maxWidth=size;
}
while(size>0){
TreeNode t=q.remove();

if(t.left!=null){
q.add(t.left);
}

if(t.right!=null){
q.add(t.right);
}
size--;
}
}
return maxWidth;
}

// Check if two trees are mirror to each other

public boolean ifMirrorTree(TreeNode node1,TreeNode node2){
if(node1==null && node2==null){
return true;
}
if(node1==null || node2==null){
return false;
}
return node1.data==node2.data && ifMirrorTree(node1.left,node2.right) && ifMirrorTree(node1.right,node2.left);
}

// Chech if two tree are mirror structure to eacg other
public boolean ifMirrorstructureTree(TreeNode node1,TreeNode node2){
if(node1==null && node2==null){
return true;
}
if(node1==null || node2==null){
return false;
}
return ifMirrorstructureTree(node1.left,node2.right) && ifMirrorstructureTree(node1.right,node2.left);
}

// Check if binary tree is foldable tree
public boolean ifFoldable(TreeNode node){
if(node==null){
return true;
}

return ifMirrorStructureTree(node.left,node.right);
}

// Check if two binary tree are isomorphic 
public boolean isIsomorphicTree(TreeNode node1,TreeNode node2){
if(node1==null && node2==null){
return true;
}
if(node1==null || node2==null){
return false;
}
if(node1.data!=node2.data){
return false;
}

return (isIsomorphicTree(node1.left,node2.left) && isIsomorphicTree(node1.right,node2.right)) || (isIsomorphic(node1.left,node2.right) && isIsomorphic(node1.right,node2.left));
}

//Get width of a level of binary tree
public int getWidthOfLevel(TreeNode node,int level){
if(node==null){
return 0;
}

if(level==1){
return 1;
}

return getWidthOfLevel(node.left,level-1) + getWidthOfLevel(node.right,level-1);
}

//Create double tree of given binary Tree
public void doubleTree(TreeNode node){
if(node==null)[
return ;
}
doubleTree(node.left);
doubleTree(node.right);

TreeNode newNode=new TreeNode(node.data);
newNode.left=node.left;
node.left=newNode;
}

//
}
public class BinaryTreeApp{
public static void main(String []args){
BinaryTree d=new BinaryTree();
TreeNode root=d.createNewNode(2);
root.left=d.createNewNode(7);
root.right=d.createNewNode(5);
root.left.left=d.createNewNode(2);
root.left.right=d.createNewNode(6);
root.left.right.left=d.createNewNode(5);
root.right.right.right=d.createNewNode(11);
root.right.right=d.createNewNode(4);
root.right.right.left=d.createNewNode(4);

System.out.print("inorder : ");
d.inorder(root);
System.out.println();

System.out.print("preorder : ");
d.preorder(root);
System.out.println();

System.out.print("postorder : ");
d.postorder(root);
System.out.println();

System.out.println("sum of node : "+ d.getSumOfNode(root));
System.out.println("difference :"+d.differenceOfEvenOdd(root));
System.out.println("number of leaf node :"+a.getNumberOfLeafNode(root));
	    System.out.println("height of node :"+a.getHeightOfTree(root));	
	    a.printAtGivenLevel(root,2);
	    System.out.println();
	    a.levelOrderTraversalUsingRecursion(root);
	    a.leftViewOfTree(root,0);
	    System.out.println();
	    a.rightViewOfTree(root,0);
TreeNode mirror=a.mirrorTree(root);
		a.inorder(mirror);
System.out.println(a.isIdentical(root,root1));

}
}

