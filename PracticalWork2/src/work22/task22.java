package work22;



public class task22 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis()/1000;
        final int POINT = 60;
        long sec = time % POINT;
        time /= POINT;
        long min = time % POINT;
        time /= POINT;
        long hour = ( time + 2 ) % 24;  //без использования тайм зоны, по умолчанию время по гринвичу
        long day =  time /  24;  // количество дней  от начала unix эпохи

//        System.out.println(time);
        System.out.println("Current time is " + day + ":" + hour + ":" + min + ":" + sec);

    }
}
