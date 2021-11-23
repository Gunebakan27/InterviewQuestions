package practice;

public class Overriding {


//What will be the output of below program?


    public static void main(String args[]) {
    	
    	 int i = 5;
         System.out.print("Output = ");

         for (int x = 0; x <= (i % 7); x += 1)
         {
             
         }System.out.print(i%7);
    }}
//    	System.out.println("---------------");
//        A a = new A();
//        System.out.println("---------------");
//        B b = new B();
//        System.out.println("---------------");
//        C c = new C();
//        System.out.println("---------------");
//    
//    }
//}
//
//class A
//{
//    A()    // LINE A
//    {
//        System.out.println("Created A");
//    }
//}
//
//class B extends A
//{
//    B()
//    {
//        System.out.println("Created B");
//    }
//}
//
//class C extends B
//{
//    C()
//    {
//        System.out.println("Created C");
//    }
//}
    
//        B subobj = new B();
//        subobj.getdata(20, 30);
//        subobj.multiplication();
//    }
//}
//class A {
//    int a;
//    int b;
//    void getdata(int c, int d) {
//        a = c;
//        b = d;
//        System.out.println(a + " " + b);
//    }
//}
//
//class B extends A {
//    int mul;
//    void multiplication() {
//        mul = a * b;
//    }
//}
//What will be the output of the following program?
//
//
//    public static void main(String[] args) {
//        new M().product(3);
//        new N().product(3);
//        new O().product(3);
//    }
//}
//
//class M {
//    int product(int i) {
//        int result = i * i;
//        System.out.print("{ " + i + " = " + result + " } ");
//        return result;
//    }
//}
//
//class N extends M {
//    int product(int i) {
//        int result = super.product(i) * super.product(i);
//        System.out.print("[ " + i + " = " + result + " ] ");
//        return result;
//    }
//}
//
//class O extends M {
//    int product(int i) {
//        int result = super.product(i) * i;
//        System.out.print("( " + i + " = " + result + " ) ");
//        return result;
//    }
//}
//	


