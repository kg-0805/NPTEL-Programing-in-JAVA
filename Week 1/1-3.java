import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   int sum=0;
		int num=0;
for(int i=0;i<n;i++)
{
  num=num+2;
  if(num%3==0)
  {
    sum=sum+num;
  }
}
System.out.print(sum);
 }
}
