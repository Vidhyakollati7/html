/*  1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method.


class Static 
{ 

int  c=7;
int d=5;
void e()
{
    System.out.println("Instance Method 1");
}
void f()
{
    System.out.println("Instance Method 2");
}

    static int a=24;
    static  int b=23;

    static{
    
    System.out.println("Static Variables");
    System.out.println(a);
    System.out.println(b);
    }

    {
    System.out.println("Instance Variables");
    System.out.println(c);
    System.out.println(d);
    }
    static void call()
    {
    System.out.println("Static Call Method 1");
    }
    static void ring()
    {
        System.err.println("Static Ring Method 2");
    }
public static  void main(String[]  args)
{
    
System.out.println("Static  Main Method");

Static s= new Static();
call();
ring();
s.e();
s.f();

}
}


Output:


Static Variables
24
23
Static  Main Method
Instance Variables
7
5
Static Call Method 1
Static Ring Method 2
Instance Method 1
Instance Method 2
*/

//  2.Print instance variables in static methods

/*
class Static 
{
    int a = 2;
    int b = 3;

    static void sta() 
    {
        Static s = new Static();  
        System.out.println(s.a);     
        System.out.println(s.b);         
    }

    public static void main(String[] args)
    {   
        System.out.println("Main Method");
        sta(); 
    }
}


Output:

Main Method
2
3

*/


//  3.Print static variables in Instance methods

/*

class Static 
{ 
    static int a=24;
    static int b=23;

    void ins()
    {
        System.out.println(a);
    }
    void inst()
    {
        System.out.println(b);
    }
public static  void main(String[]  args)
{
    
System.out.println("Static  Main Method");

Static s= new Static();
s.ins();
s.inst();

}
}


Output:
Static  Main Method
24
23
*/


// 4.Call instance methods in static methods

/*
class Static
{
    void instance() 
    {
        System.out.println("Instance method ");
    }

    static void staticmethod() 
    {

        Static s = new Static();
        s.instance();
    }

    public static void main(String[] args) {
        System.out.println(" Main Method");
        staticmethod();  
    }
}


Output:

Main Method
Instance method
*/

// 5. Call static methods in instance methods

/*


class Static{
    
    static void a()
     {
        System.out.println("Static Method");
    }

    void ins() 
    {
        a();
    }

    public static void main(String[] args) {
        Static s = new Static();
        s.ins(); 
    }
}

Output:
Static Method

*/

//  6. Print all the static, instance variables in main method

/*

class Static
{    
    static int a = 10;
    static int b = 20;
    int c = 30;
    int d = 40;

    public static void main(String[] args) {
        System.out.println("Static Variables:");
        System.out.println( a);
        System.out.println(b);

        Static s = new Static();

        System.out.println("Instance Variables:");
        System.out.println(s.c );
        System.out.println(s.d);
    }
}


Output:

Static Variables:
10
20
Instance Variables:
30
40

*/


//  7. Call static methods and instance methods in main method.

/*

class Static
{
    static void a()
    {
        System.out.println("Welcome");
    }
    void ins()
    {
        System.out.println("Back to home");
    }
    public static void main(String[] args)
    {
        System.out.println("Main method");
        a();
        Static s=new Static();
        s.ins();
    }
}

Output:

Main method
Welcome
Back to home

*/



