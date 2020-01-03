package HomeWork5.LostBlocks.HW5Variant3;

class MixFor5V3 {

    // gives 45 6 as a result
    public static void main(String[] args) {
        int x=0;
        int y=30;
        for(int outer=0;outer<3;outer++){
            for(int inner=4;inner>1;inner--) {
                //inserted block
                x=x+2;
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
