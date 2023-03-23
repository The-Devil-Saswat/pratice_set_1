package Set_1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the len of arrays");
		int len=so.nextInt();
		int [] arr=new int [len];
		System.out.println("Enter arr");
		for (int i=0;i<arr.length-1;i++)
			arr[i]=so.nextInt();
		for (int i=1;i<=len;i++)
			for (int e:arr)
			{
				if (i==e)
					break;
				else if(i!=e && e==arr[len-1])
					System.out.println("Missing element is "+i);
			}

	}

}
