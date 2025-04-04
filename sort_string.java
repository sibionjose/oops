import java.util.Scanner;
  public class sort_string{
	public static void main(String args[]){
	String temp;
	int i,j,count;
	Scanner scan = new Scanner(System.in);
	System.out.print("enter the number of strings yoy would like to enter:");
	count = scan.nextInt();
	String[] str = new String[count];
	Scanner scan2 = new Scanner(System.in);
	System.out.println("enter the Strings one by one:");
for(i=0; i < count; i++)
{
str[i] = scan2.nextLine();
}

	System.out.println(" the strings before sorting:");
	for(i=0;i<count;i++)
	{
		System.out.println(str[i]);
	}
	for (i=0;i<count;i++)
	{
		for(j=i+1;j<count;j++)
		 {
			if((str[i].compareTo(str[j]))>0)
			   {
				temp=str[i];
				str[i]=str[j];
				str[j]=temp;
			   }
		  }
	}
	
	System.out.println("\n the Strings after sorting:");
	for(i=0;i<count;i++)
 	 {
		System.out.println(str[i]);
	 }
	}
}	