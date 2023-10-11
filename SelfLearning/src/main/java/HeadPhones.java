public class HeadPhones {

    String charge ="Mircro usb";
    String[] controls ={"power", "volume", "skip" , "play/pause"};
    String color ="Red/black";

    static boolean power = false;

    public static void poweron(){
        power = true;
    }

    public static void poweroff(){
        power = false;
    }

}
