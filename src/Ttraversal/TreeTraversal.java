package Ttraversal;

class Node
{
	Node lc;//left child
	Node rc;//right child
	char key;
	Node(char key)
	{
		this.key=key;
	}
}

class TreesTraversal//Traversing creation
{
	Node root;
	void preordertraversal(Node n)
	{
		if(n!=null)
		{
			 System.out.print(n.key+" ");
			 preordertraversal(n.lc);
			 preordertraversal(n.rc);
		}
	}
	
	void postordertraversal(Node n)
	{
		if(n!=null)
		{
			 
			 preordertraversal(n.lc);
			 preordertraversal(n.rc);
			 System.out.print(n.key+" ");
		}
	}
	
	void inordertraversal(Node n)
	{
		if(n!=null)
		{
			 
			 preordertraversal(n.lc);
			 System.out.print(n.key+" ");
			 preordertraversal(n.rc);
		}
	}
	
}

public class TreeTraversal {
public static void main(String[] args) {
	TreesTraversal t1=new TreesTraversal();
	t1.root=new Node('A');//adding nodes
	t1.root.lc=new Node('B');
	t1.root.rc=new Node('C');
	t1.root.lc.lc=new Node('D');
	t1.root.lc.rc=new Node('E');
	
	
	t1.preordertraversal(t1.root);
	System.out.println();
	t1.inordertraversal(t1.root);
	System.out.println();
	t1.postordertraversal(t1.root);
	
}
}
