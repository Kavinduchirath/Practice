public class TimeCounter {
    public static void main(String[] args) {

        int sec_one = 58;int sec_two = 55;
        int min_one = 54;int min_two = 49;
        int hour_one = 9;int hour_two = 12;

        int seconds;int delay_sec;int delay_mins;

        if (sec_one + sec_two >= 59){
            delay_sec = 1;
            seconds = (sec_one + sec_two) - 60;

        } else {
            delay_sec = 0;
            seconds = sec_one + sec_two;         
        }

        int minitues = delay_sec + min_one + min_two;
        if (minitues >= 59) {
            delay_mins = 1;
            minitues = (min_one + min_two + delay_sec)- 60;
            
        } else {
            delay_mins = 0;
            minitues = min_one + min_two;      
        }

        int hours = hour_one + hour_two + delay_mins;
        if (hours <= 24) {
            hours = hour_one + hour_two + delay_mins;          
        }
        
        System.out.println(hours+":"+ minitues + ":" + seconds);
    }
}


