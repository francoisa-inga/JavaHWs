package HomeWork7.Prints.PrintsVariant2;

// gives B's m1, A's m2, C's m3, 13 as a result
public class Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        c.m1();
        c.m2();
        c.m3();
    }
}
