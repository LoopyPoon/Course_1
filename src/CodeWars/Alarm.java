package CodeWars;

public class Alarm {
    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println(sayAlarm(true, false));
        System.out.println(sayAlarm(true, true));
        System.out.println(sayAlarm(false, false));
        System.out.println(sayAlarm(false, true));
    }

=======
        System.out.println(sayAlarm(true,false));
        System.out.println(sayAlarm(true,true));
        System.out.println(sayAlarm(false,false));
        System.out.println(sayAlarm(false,true));
    }
>>>>>>> 1f2e59d (cw)
    public static boolean sayAlarm(boolean employed, boolean vacation) {
        return employed & !vacation;
    }
}
