import java.util.Random;

public class Die {
    public static int roll(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }
}
