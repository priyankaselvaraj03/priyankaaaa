import java.io.*;
import java.util.*;
class num2
{
public static void main(String a[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n>=0&&n<=100000)
{
if(n>1)
{
System.out.print("Positive");
}
else
{
System.out.print("Zero");
}
}
else
{
System.out.print("Negative");
}

}
}

