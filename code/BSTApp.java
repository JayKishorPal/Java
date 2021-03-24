class TreeNode{
int data;
Treenode left;
TreeNode right;
}
class BST{
public TreeNode createNode(int data){
TreeNode a=new TreeNode();
a.data=data;
a.left=null;
a.right=null;
return a;
}

public TreeNode insert(TreeNode node,int val){
if(node==null){
return createNode(val);
}
if(val<node.data){
node.left=insert(node.left,val);
}
else if(val>node.data){
node.right=insert(node.right,val)
}
return node;
}

public Treenode delete(Treenode node,int val){
if(node==null){
return null;
}
if(val>node.data){
node.right=delete(node.right,val);
}
else if(val<node.data){
node.left=delete(node.left,val);
}
else{
if(node.left==null || node.right==null){
Treenode temp=null;
 temp=node.left==null?node.left:node.right;
if(temp==null){
return null;
}
else{
return temp;
}
}
else{
TreeNode successor=getSuccessor(node);
node.data=successor.data;
node.right=delete(node.right,val);
return temp;
}
}
return node;
}

public TreeNode getSuccessor(TreeNode node){
if(node==null){
return null;
}
TreeNode temp=node.right;
while(temp.left!=null){
temp=temp.left;
}
return temp;
}
}

// Check given binary tree is BST or not
boolean left(Node root, int pdata) {
    if (root == null) return true;
    if (root.data >= pdata) return false;
    return left(root.left, root.data) &&
        left(root.left, pdata) &&
        left(root.right, pdata) &&
        right(root.right, root.data);
}

boolean right(Node root, int pdata) {
    if (root == null) return true;
    if (root.data <= pdata) return false;
    return right(root.right, root.data) &&
        right(root.right, pdata) &&
        right(root.left, pdata) &&
        left(root.left, root.data);
}

boolean checkBST(Node root) {
	return left(root.left, root.data) &&
    	right(root.right, root.data);
}

public class BSTApp{
public static void main(String args[]){
BST d=new BST();
TreeNode root=null;
root=d.insert(root,8);
root=d.insert(root,3);
root=d.insert(root,6);
root=d.insert(root,10);
root=d.insert(root,4);
}
}