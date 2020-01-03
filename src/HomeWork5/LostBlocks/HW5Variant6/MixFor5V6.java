package HomeWork5.LostBlocks.HW5Variant6;

class MixFor5V6 {

    // gives 6 14 as a result
    public static void main(String[] args) {
        int x=0;
        int y=30;
        for(int outer=0;outer<3;outer++){
            for(int inner=4;inner>1;inner--) {
                //inserted block which, however, does not impact
                x=x+0;
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y=y-2;
        }
        System.out.println(x+" "+y);
    }
}
