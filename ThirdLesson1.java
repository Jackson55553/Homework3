import java.util.Scanner;

public class ThirdLesson1 {
    public static void main(String[] args) {
        findWord();
    }

    public static void findWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String[] noLeters = {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"};
        int s = (int) (Math.random() * words.length);
        for (int i = 1; i > 0; i++) {
            String word = words[s]; //выбрал слово из массива
            Scanner sc = new Scanner(System.in);
            String playerAnswer = sc.next();//игрок ввел слово
            System.out.println(playerAnswer);
            if (word.equals(playerAnswer)) {
                System.out.println("Победа");
                break;
            } else {
                int rightLetters = 0;
                for (int j = 0; j < playerAnswer.length(); j++) {
                    char a = word.charAt(j);
                    char b = playerAnswer.charAt(j);
                    if (a == b) {
                        System.out.print(a);
                        rightLetters++;
                    }
                    if (a != b) {
                        System.out.print(noLeters[j]);
                    }
                }
                System.out.println("Вы отгадали " + rightLetters + " букв. Попробуйте ещё раз.");
            }
            System.out.println();
        }
    }
    }

