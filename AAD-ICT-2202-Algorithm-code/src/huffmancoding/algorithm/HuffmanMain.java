package huffmancoding.algorithm;

import java.util.*;

public class HuffmanMain {
	
	static int totallength=0;
	static int totalascii=0;
	static int totalhuffman=0;
	public static void printcode(HuffmanNode root,String s)
	{
		if(root.left==null && root.right==null & Character.isLetter(root.c))
		{
			System.out.println (root.c + " :  "+ s+ " length : " + s.length());
			totallength=totallength+s.length();
			totalascii=totalascii+(root.data*8);
			totalhuffman=totalhuffman+(root.data*s.length());
			return;
		}
		
		printcode(root.left,s+"0");
		printcode(root.right,s+"1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		char [] charArray= {'A','C','E','M','U','Z'};
		int []charfreq= {100,53,133,60,44,8};
		
		PriorityQueue<HuffmanNode> q=new PriorityQueue<>(n,new MyComparator());
		for(int i=0;i<n;i++)
		{
			HuffmanNode n1=new HuffmanNode();
			n1.data=charfreq[i];
			n1.c=charArray[i];
			n1.left=null;
			n1.right=null;
			
			q.add(n1);
		}
		
		HuffmanNode root=null;
		 while(q.size()>1)
		 {
			 HuffmanNode x=q.poll();
			 HuffmanNode y=q.poll();
			 
			 HuffmanNode f=new HuffmanNode ();
			 f.data=x.data+y.data;
			 f.c='-';
			  
			 f.left=x;
			 f.right=y;
			 root=f;
			 q.add(f);
			 
		}
		 printcode(root,"");
		 System.out.println("\nTotal huffmancode length = "+totallength);
		 System.out.println("Total ascii weight = "+totalascii);
		 System.out.println("Total huffmancode weight = "+totalhuffman);
		 
		 double ratio=(double)totalhuffman/totalascii;
		 System.out.println("ratio = "+ratio);

	}

}
