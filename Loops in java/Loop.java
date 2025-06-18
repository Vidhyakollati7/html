/* 1.class Loop{
public static void main(String[] args) {
for (int i=0;i<10;i++) {
System.out.println("Bright IT Career");
}
}
}

Output:
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career*/

/* 2.public class Loop {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
          System.out.println(i);
         i++;
        }
    }
}
 
Output:
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20*/

/* 3.public class Loop{
public static void main(String args[])
{
    int a = 23;
    int b = 23;
    int c = 17;

  System.out.println("a is equal to b:" + (a==b));

  System.out.println("a is equal to c:" + (a==c));

  System.out.println("a is  not equal to b:" +  (a!=b));

  System.out.println("a is not equal to c:" + (a!=b));
 }
    
}
Output:
a is equal to b:true
a is equal to c:false
a is  not equal to b:false
a is not equal to c:true*/



/* 4.import java.util.Scanner; 
class  Loop{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");
n=s.nextInt();
System.out.println("Even numbers are:");
for( int i=0;i<n;i++)
{
if(i%2==0)
{
System.out.println(i+ "");
}
}
System.out.println("Odd numbers are:");
for( int i=0;i<n;i++)
{
if(i%2!=0)
{
System.out.println(i+ "");
}
}
}
}

Output:
Enter the value of n:
10
Even numbers are:
0
2
4
6
8
Odd numbers are:
1
3
5
7
9*/

/* 5.class Loop{
public static void main(String args[]){
int a=23;
int b=17;
int c=12;
if((a>b)&&(a>c))
{
System.out.println("a is largest");
}
else if((b>a)&&(b>c)){
System.out.println("b is largest");
}
else{
System.out.println("c is largest");
}
}
}
 Output:
 a is largest*/


/* 6.import java.util.Scanner;
class Loop{
public static void main(String args[]){
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n between 10 to 100:");
n=s.nextInt();
while(n<=100){
if(n%2==0){
System.out.print(n + " ");
}
n++;
}
}
}  
Output:
Enter the value of n between 10 to 100:52
52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 */

/* 7.public class Loop{
public static void main(String args[]){
int i=1;
do{
System.out.println(i+ " ");
i++;
}while(i<=10);
}
}
Output:
1
2
3
4
5
6
7
8
9
10
 */

/*8.Armstrong number

import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        int n, i, rem, sum = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = s.nextInt();
        i = n;

        while (n > 0) {
            rem = n % 10;
            sum += rem * rem * rem; 
            n /= 10;
        }

        if (i== sum) {
            System.out.println(i + " is an Armstrong number");
        } else {
            System.out.println(i + " is not an Armstrong number");
        }
    }
}
Output:
Enter a number:
153
153 is an Armstrong number*/


