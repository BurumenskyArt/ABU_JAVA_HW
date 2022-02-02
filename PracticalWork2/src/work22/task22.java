package work22;



public class task22 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis()/1000;
        long sec = (time % 60);
        long min = ((time/ 60) %60);
        long hour = ((time/3600 +2)%24);  //без использования тайм зоны, по умолчанию время по гринвичу
        long day = ((time/(3600 * 24)));  // количество дней  от начала unix эпохи

        System.out.println(time);
        System.out.println("Current time is "+ day + ":" + hour+  ":"+ min +":"+ sec);

    }
}
