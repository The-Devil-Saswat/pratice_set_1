package Set_1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the len of arrays");
		int len=so.nextInt();
		int [] arr=new int [len];
		System.out.println("Enter arr");
		for (int i=0;i<arr.length;i++)
			arr[i]=so.nextInt();
		int sum=0;
		int i=0;
		for (int e:arr)
		{
			if (sum==e)
				System.out.println(i);
			i++;
			sum+=e;
		}

	}

}
