package Set_1;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the len of arrays");
		int len=so.nextInt();
		int [] arr=new int [len];
		System.out.println("Enter arr");
		for (int i=0;i<arr.length;i++)
			arr[i]=so.nextInt();
		int i=0;
		int jump=0;
		while(i<arr.length)
		{
			int step=arr[i];
			int max=-1;
			int in=-1;
			for (int j=i;j<=i+step & j<arr.length;j++)
			{
				if(max<arr[j])
				{
					max=arr[j];
					in=j;
				}
			}
			if(max==-1 | max==0)
			{
				System.out.println("No jump possible");
				break;
			}
			else if(max>0)
			{
				i=in;
				jump++;
			}
			if(i==(arr.length-1))
				break;
		}
		System.out.println("No. of Jumps="+jump);

	}

}
