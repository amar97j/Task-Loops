public class WeekdaysPrinter {
    public static void main(String[] args) throws Exception {

        String[] Weekdays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

       for(int i=0; i<Weekdays.length; i++){
        if (i>4){
            break;
        }
       
        System.out.println(Weekdays[i]);
    }
    }
}
