package HomeWork7.Prints.PrintsVariant3;

// gives 'A's m1, A's m2, C's m3, 13 as a result
public class Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        a.m1();
        b.m2();
        c.m3();
    }
}
