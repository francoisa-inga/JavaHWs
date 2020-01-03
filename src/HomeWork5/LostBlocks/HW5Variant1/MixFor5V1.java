package HomeWork5.LostBlocks.HW5Variant1;

class MixFor5V1 {

    // gives 60 10 as a result
    public static void main(String[] args) {
        int x=0;
        int y=30;
        for(int outer=0;outer<3;outer++){
            for(int inner=4;inner>1;inner--) {
                //inserted block
                x=x+6;
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
