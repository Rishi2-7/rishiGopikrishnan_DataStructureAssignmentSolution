package com.greatlearning.main;

public class binarySearchRight
{
	static Node tempNode,selectNode;
	static class Node
	{
      int key;
      Node left,right;
    }

	static Node newNode(int data)
    {
		Node temp = new Node();

        temp.key=data;
          
        temp.left=null;
        temp.right=null;

        return temp;
    }
      
    public void inOrder(Node root)
    {
       if(root == null)
       {
    	   return;
       }
       		inOrder(root.left);
       		if(selectNode == null)
       		{
              selectNode=root;
              tempNode=root;
       		}
       		else
       		{
	          selectNode.right=root;
	          selectNode.left=null;
	          selectNode=selectNode.right;
            }
       		
          inOrder(root.right);
    }
    public static void main(String[] args)
    {
    	  binarySearchRight obj = new binarySearchRight();
    	  
	      Node root=null;
	      
	      root=newNode(50);
	      root.left=newNode(30);
	      root.right=newNode(60);
	      root.left.left=newNode(10);
	      root.right.left=newNode(55);
	      
	      System.out.println("Modified Binary Search Tree in Ascending order\n");
	      
	      obj.inOrder(root);
	      root=tempNode;
	      while(tempNode!=null)
	      {
	          System.out.print(tempNode.key+" ");
	          tempNode=tempNode.right;
	      }
    }
}
