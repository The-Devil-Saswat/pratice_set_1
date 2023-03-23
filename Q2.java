package Set_1;

import java.util.*;

public class Q2 {
	
	
	static int fact(int x)
	{
		if (x==0 && x==1)
			return x;
		return x*(fact(x));
	}

	public static void main(String[] args) 
	{
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the len of arrays");
		int len=so.nextInt();
		int [] arr1=new int [len];
		for (int i=0;i<arr1.length;i++)
			arr1[i]=so.nextInt();
		int [] arr2=new int [len];
		for (int i=0;i<arr2.length;i++)
			arr2[i]=so.nextInt();
		int c=0;
		for (int e=0;e<len;e++)
		{
			for (int f=0;f<len;f++)
			{
				if(arr1[e]==arr2[f])
					break;
				else if(arr1[e]!=arr2[f] && f==len-1)
					c=1;
			}
			if (c>0)
			{
				System.out.println("Array are not same");
				break;
			}
			else if(e==len-1)
				System.out.println("Array are same");
		}	

	}

}
