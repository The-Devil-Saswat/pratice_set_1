package Pratice_Set_1;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the len of array");
		String [] arr=new String [so.nextInt()];
		System.out.println("Enter the array");
		for (int i=0;i<arr.length;i++)
			arr[i]=so.next();
		String pre=arr[0];
		int b=0;
		for (int i=1;i<arr.length;i++)
		{
			String s=arr[i];
			for (int j=0;j<s.length();j++)
			{
				String np="";
				if (pre.charAt(0)==s.charAt(j))
				{
					int c=0;
					for (int k=j;k<s.length() && c<pre.length();k++)
					{
						if (pre.charAt(c)==s.charAt(k))
							np+=s.charAt(k);
						c++;
					}
					pre=np;
					break;
				}
				else if(j==s.length()-1 && np=="")
				{
					b++;
				}
			}
			if(b>0)
			{
				System.out.println("no prefix");
				break;
			}
			else if(i==arr.length-1)
			{
				System.out.println(pre);
			}
		}

	}

}
