package com.coderaviverma.springtestDummy.java.oops;

public class OverloadingTest {
    //
    static void  m1(int a){
        System.out.println("int - "+a);
    }
    static void m1(long a) {
        System.out.println("long - " + a);
    }

    static void m1(float a) {
        System.out.println("float - " + a);
    }

    static void m1(double a) {
        System.out.println("double - " + a);
    }

    static void m1(String a) {
        System.out.println("String - " + a);
    }
//    static void m1(StringBuffer a) {
//        System.out.println("StringBuffer - " + a);
//    }
   static void m1(Object a) {
        System.out.println("Object - " + a);
    }

    public static void main(String[] args) {
//        m1('1');
//        m1(null);

        String a=new String("dip");
        String b=new String("dip");
        String c=new String("dip").intern();
        String d="dip";
        String e="dip";
        String f="dip";
//
//        Demo demo1=new Demo();
//        Demo demo2=new Demo();
//
//        System.out.println(demo1.hashCode());
//        System.out.println(demo2.hashCode());
//
//        System.out.println(a.hashCode());
////        System.out.println(b.hashCode());
////        System.out.println(c.hashCode());
//        System.out.println(d.hashCode());

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
        System.out.println(System.identityHashCode(e));
        System.out.println(System.identityHashCode(f));

        ;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
