package HomeWork7.Prints.PrintsVariant1;

// gives B's m1, A's m2, A's m3 as a result
public class Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        b.m1();
        c.m2();
        a.m3();
    }
}
