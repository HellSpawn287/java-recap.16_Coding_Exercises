public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean range = temperature >= 25 && temperature <= 35;
        boolean rangeInSummer = temperature >= 25 && temperature <= 45;
        boolean isCatPlaying = false;

        if (range || (rangeInSummer && (summer == true))) {
            isCatPlaying = true;
            return isCatPlaying;
        }
        return isCatPlaying;
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(true,36));
    }
}
