package HomeWork4.Mixes;

// gives 14 1 as a result
public class Mix4Variant1 {
    int counter = 0;
    public static void main(String[] args) {
        int count=0;
        Mix4Variant1[]m4a = new Mix4Variant1[20];
        int x=0;
        while(x<7){
            m4a[x] = new Mix4Variant1();
            m4a[x].counter = m4a[x].counter+1;
            count = count+1;
            count = count+m4a[x].MaybeNew(x);
            x=x+1;
        }
        System.out.println(count+" "+m4a[1].counter);
    }
    public int MaybeNew(int index){
        if(index<7){
        Mix4Variant1 m4 = new Mix4Variant1();
        m4.counter = m4.counter+1;
        return 1;
        }
        return 0;
    }
}
