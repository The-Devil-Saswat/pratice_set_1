package Set_1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the len of arrays");
		int len=so.nextInt();
		int [] arr=new int [len];
		System.out.println("Enter arr");
		for (int i=0;i<arr.length;i++)
			arr[i]=so.nextInt();
		int j=0;
		int[] narr=new int[len]; 
		for (int i=0;i<len;i++)
		{
			if(i==len-1)
			{
				narr[j]=arr[i];
				j++;
			}
			else if (arr[i]>=arr[i+1])
			{
				narr[j]=arr[i];
				j++;
			}
				
		}
		for (int e:narr)
			if (e!=0)
				System.out.print(e+",");

	}

}
