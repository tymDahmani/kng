import java.util.Random;
import java.util.Scanner;

public class generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("lenth of the name: (3-6)");
            byte length = scanner.nextByte();

            if (length <= 6 && length >= 3) {
                
            } else {
                System.out.println("please input a correct number between 3 and 6 :)");
                continue;
            }

            System.out.println("choose the first syllable(2,3):  [/ for random]");
            String first_syll = scanner.next();

            String name = generator(first_syll, length);

            System.out.println("your kitty name is: " + name);

            System.out.println("wanna generate another name?[y/n]");
            char y = scanner.next().charAt(0);

            if (y == 'y') {
                continue;
            } else {
                System.out.println("have fun with your kitty!");
                break;
            }

        }
    }

    public static String generator(String first_syll, byte length) {
        String[] syllables = {"bou", "shi", "bi", "sha", "na", "ni", "la", "ra", "ka", "tie", "sha", "ro", "bo", "to"};

        Random rndm = new Random();
        StringBuilder name = new StringBuilder();

        if (!first_syll.equals("/")) {
            name.append(first_syll);
        } else if (first_syll == "/") {
            name.append(syllables[rndm.nextInt(syllables.length)]);
        }

        while (name.length() < length) {
            name.append(syllables[rndm.nextInt(syllables.length)]);
        }

        return name.substring(0, length);
    }
}