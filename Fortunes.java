// Basic Fortune Cookie Program

import java.util.Random;

public class Fortunes {
    // Creating an array of strings
    static String [] fortunes = {"Delight the world with compassion, kindness and grace.",
            "The early bird gets the worm, but the second mouse gets the cheese.",
            "Some days you are pigeon, some days you are statue. Today, bring umbrella.",
            "The fortune you seek is in another cookie.",
            "Be on the alert to recognize your prime at whatever time of your life it may occur.",
            "Your reality check about to bounce.",
            "Tension is who you think you should be. Relaxation is who you are.",
            "When blind leading the blind……..get out of the way.",
            "Everyone seems normal until you get to know them.",
            "Only difference between rut and a grave is depth.",};
    public static void main(String[] args) {
        Random rand = new Random(); // Random object
        int r = rand.nextInt(fortunes.length);
        System.out.println(fortunes[r]); // Prints out any of the quotes in the fortunes array
    }
}