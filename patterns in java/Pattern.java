
 /* 1
class  Pattern
{
public static void main(String args[])
{
 int i,j;
for(i=0; i<5; i++)
{
for(j=0; j<5; j++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}
*/


/*2

class  Pattern
{
public static void main(String args[])
{
 int i,j;
for(i=1; i<6; i++)
{
for(j=0; j<5; j++)
{
System.out.print(i+" ");
}
System.out.println( );
}
}
}*/

/*3
class  Pattern
{
public static void main(String args[])
{
 int i,j;
for(i=1; i<6; i++)
{
for(j=1; j<6; j++)
{
System.out.print(j+ " ");
}
System.out.println( );
}
}
}*/


/* 4
  class  Pattern
{
public static void main(String args[])
{
int i,j;
int n=1;
for(i=1;i<6; i++)
{ 
for(j=1;j<6; j++)
{ 
System.out.print(n+" ");
n++;
}
System.out.println();
}
}
}*/

/* 5
  class  Pattern
{
public static void main(String args[])
{
int i,j;
int n=1;
for(i=1;i <6;i++)
{
for(j=1;j<6;j++){
System.out.print(n+ " ");
n++;
if(n>9){
n=1;
}
}
System.out.println(" ");

}
}
}
*/

/*6
class  Pattern
{
public static void main(String args[])
{
int i,j;
int n=1;
for(i=1;i<5; i++)
{
for(j=0;j<6;j++)
{
System.out.print(n+" ");
n--;
if(n!=0){
}
}
System.out.println(" ");
}
}
}*/

/* 7
class  Pattern
{
public static void main(String args[])
{
int i,j;
int n=1;
for(i=1;i <6;i++)
{
for(j=1;j<6;j++){
System.out.print(n+ " ");
if(j%2==0){
System.out.println(0+" ");

}
else{ System.out.println(1+" ");
System.out.println(" ");

}
}
}*/

/* 8
class  Pattern
{
public static void main(String args[])
{
int i,j;

for(i=0; i<=6; i++)
{
for(j=1; j<=i; j++)
{
System.out.print("*");
}
System.out.println( );
}
}
}*/




 
/* 8
class  Pattern
{
public static void main(String args[])
{
 for(int i=1; i<6;i++)
{
for( int j=1;j<6; j++)
{
if(j<6-i) 
 {
 System.out.print(" ");}
else{
System.out.print("* ");
}
}
System.out.println(" ");
}
}
}
*/ 

/* 9
class  Pattern
{
public static void main(String args[])
{
for(int i=1;i<=5;i++){
for(int j=1;j<=5-i;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print((2*k) + " ");
}
System.out.println();
}
}
}
     2
   2 4
  2 4 6
 2 4 6 8
2 4 6 8 10
*/



/* 10 
class  Pattern
{
public static void main(String args[])
{
 String word="INDIA";
for(int i=1; i<=word.length; i++)
{System.out.println(word.substring(0,i));
}
}
}*/


/* 11
class  Pattern
{
public static void main(String args[])
{
int n=5;
for(int i=1; i<=n;i++)
{
for( int j=1;j<n; j++)
System.out.println( );
for( int k=1;k<=(2*i-1); k++)
 System.out.print("*");
}
System.out.println( );
}
}
*/



/* 12
class  Pattern
{
public static void main(String args[])
{
int n = 4;
for (int i = 1; i <= n; i++) {
for (int j = i; j < n; j++) {
System.out.print(" ");
} 
for (int j = 1; j <= (2 * i - 1); j++) 
{
System.out.print("*");
 }
System.out.println();
 }
 for (int i = n - 1; i >= 1; i--) {
 for (int j = n; j > i; j--) {
  System.out.print(" ");
  }
  for (int j = 1; j <= (2* i - 1); j++) {
  System.out.print("*");
  }
   System.out.println();
    }
    }
   }
*/


/* 14
class  Pattern
{
public static void main(String args[])
{
for(int i=0; i<6; i++)
{
for(int j=0; j<6; j++)
{
if(i==0||  j==0 ||  i==6-1 ||j==6-1)
{
System.out.print("* ");
}
else{
System.out.print(" ");
}
}
System.out.println( );
}}
}



 ******
*          *
*          *
*          *
*          *
 ******

/* 15
class  Pattern
{
public static void main(String args[])
{
int n=7;

for( int i=1;i<=n;i++)
{
for(int  j=1;j<=n;j++)
{
if(i==n/2+1|| j==n/2+4)
 System.out.print("* ");
else
System.out.print(" ");
}
System.out.println(" ");
}
}
}
*/    



/* 17
class  Pattern
{
public static void main(String args[])
{
 for(int i=1; i<=7; i++)
{
for(int j=1; j<=7; j++)
{
if(i==1||i==7||i==(7+1)/2||j==1||j==7||j==(7+1)/2)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println( );
}
}
}
*******
*  *   *
*  *   *
*******
*  *  *
*  *  *
*******
*/



/* 19
class  Pattern
{
public static void main(String args[])
{
int i,j;

for(i=0; i<=6; i++)
{
for(j=1; j<=i; j++)
{
System.out.print("*");
}
System.out.println(i);
}
}
}
*/ 