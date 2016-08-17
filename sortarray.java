import java.io.*;
import java.util.*;
class sortarray
{
public static void main(String args[])
{
int count=0;
Scanner in=new Scanner(System.in);
ArrayList<Integer> aaa=new ArrayList<Integer>();
ArrayList<Integer> aaa1=new ArrayList<Integer>();
System.out.println("Enter the number of elements");
int len=in.nextInt();
int[] a=new int[len];
for(int i=0;i<len;i++)
aaa.add(in.nextInt());
Collections.sort(aaa);

	for(int i=0;i<len;i++)
	{
		
	if(aaa.get(i)==i)
	{
	aaa1.add(aaa.get(i));
	}

	}
System.out.println(aaa1);
}
}