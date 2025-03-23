package _07_OOP.Polymorphie.Aufgabe2;

public class Veranschaulichung {
    public static void main(String[] args) {
        Z.test();
    }
}

class X {
    int a = 4;
    int get() {
        return a;
    }
}

class Y extends X {
    static int a = 7;
    static void set(int x) {
        a = x;
    }
    static void set(char c) {
        a = 2*c;
    }
}

class Z extends Y {
    static int b = 3;
    int get() {
        return b+a;
    }
    static int get(X x) {
        return x.a;
    }
    static void set(int i) {
        a = 3*i;
    }
    static void set(X x, int i){
        a = i;
    }
    static void test() {
        Z z = new Z();
        System.out.println("z.a = " + z.a);
        System.out.println("get(z) = " + get(z));
        System.out.println("z.b = " + z.b);
        System.out.println("((X)z).get() = " + ((X)z).get());
        System.out.println("z.set('d'-'a'-1)");
        z.set('d'-'a'-1);
        System.out.println("z.a = " + z.a);
        System.out.println("get(z) = " + get(z));
        System.out.println("z.b = " + z.b );
        System.out.println("z.get() = " + z.get());
        Y y = z;
        System.out.println("y.set(2)");
        y.set(2);
        System.out.println("y.a = " + y.a);
        System.out.println("z.a = " + z.a);
        System.out.println("z.b = " + z.b );
        System.out.println("z.get() = " + z.get());
        System.out.println("z.set(y,0)");
        z.set(y, 0);
        System.out.println("z.a = " + z.a);
        System.out.println("y.a = " + y.a);
        System.out.println("z.b = " + z.b );
        System.out.println("y.get() = " + y.get());
    }
}
