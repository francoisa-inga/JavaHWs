package HomeWork11.Magnets;

public class ExTestDrive {

    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if("yes".equals(t)){
            throw new MyEx();
        }
        System.out.print("r");
        System.out.print("o");
    }

    public static void main(String[] args) {
        String[] tests = {"yes", "no"};

        for (int i = 0; i < 2; i++) {
            System.out.print(tests[i] + ", ");

            System.out.print("t");
            try {
                doRisky(tests[i]);
//
            } catch (MyEx e) {
                System.out.print("a");

            } finally {
                System.out.print("w");
            }
            System.out.println("s");
        }

    }

}
