package Set_1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the len of arrays");
		int len=so.nextInt();
		int [] arr=new int [len];
		System.out.println("Enter arr");
		for (int i=0;i<arr.length;i++)
			arr[i]=so.nextInt();
		System.out.println("Enter s");
		int s=so.nextInt();
		int st=0;
		int en=0;
		for (int i=0;i<len;i++)
		{
			st=i;
			int sum=0;
			int c=0;
			for (int j=i;j<len;j++)
			{
				if (sum==s)
				{
					en=j-1;
					c=1;
				}
				sum+=arr[j];
			}
			if(c==1)
			{
				System.out.println("Start index="+st+" end index="+en);
				for (int m=st;m<=en;m++)
					System.out.print(arr[m]);
				break;
			}
			else if(c==0 && i==len-1)
				System.out.println("-1");
		}
		
			

	}

}
