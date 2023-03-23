package Set_1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the len of arrays");
		int len=so.nextInt();
		int [] arr=new int [len];
		System.out.println("Enter the value of K");
		int k=so.nextInt();
		for (int i=0;i<arr.length;i++)
			arr[i]=so.nextInt();
		for (int i=0;i<len;i++)
		{
			int count=0;
			for (int j=0;j<len;j++)
			{
				if (arr[i]==arr[j])
					count++;
				if (count==k)
					break;
			}
			if (count==k)
			{
				System.out.println("The element is " + arr[i]);
				break;
			}
		}

	}

}
