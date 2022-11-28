package Assignment4;

import java.util.*;

public class Palindrom

{

public static void main( String args[])

{

Scanner sc = new Scanner (System.in);

int a,b , rev=0, d;

System.out.println("Input a number");

a= sc.nextInt();

b=a;

while (a>0)

{

d=a%10;

rev=(rev*10)+d;

a/=10;

}

System.out.println(" Reverse Number: "+rev);

if(b==rev )

System.out.println(b+ " is a Palindrome Number ");

else

System.out.println(b+ " is not a Palindrome Number");

}

}
