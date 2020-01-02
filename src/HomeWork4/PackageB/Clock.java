package HomeWork4.PackageB;

public class Clock {
    String time;

    void setTime(String t){
        time=t;
    }
    /**
     * void can't be used here with return; void should be replaced by 'String' as time as declared as String

    void getTime(){
     */
        String getTime(){
        return time;
    }
}
