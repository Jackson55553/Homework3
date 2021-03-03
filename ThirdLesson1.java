import java.util.Scanner;

public class ThirdLesson1 {
    public static void main(String[] args) {
        findWord();
        for (int i = 1; i > 0; i++) {
            System.out.println("Повторить игру ещё раз? 1 - да/0 - нет");
            Scanner sc = new Scanner(System.in);
            int askForReplay = sc.nextInt();
            if (askForReplay == 1) {
                findWord();
            }if (askForReplay == 0){
                System.out.println("Game over");
                break;
            }
        }
    }

    public static void findWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String[] noLeters = {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"};
        int s = (int) (Math.random() * words.length);
        for (int i = 1; i > 0; i++) {
            String word = words[s]; //выбрал слово из массива
            Scanner sc = new Scanner(System.in);
            String playerAnswer = sc.next();//игрок ввел слово
            int rightLetters = 0;
            if (word.equals(playerAnswer)) {
                System.out.println("Победа");
                break;
            } else {
                int j = 0;
                int symb = 0; //счетчик использованных символов
                while (playerAnswer.length() > j && word.length() > j){
                        symb++;
                        char a = word.charAt(j);
                        char b = playerAnswer.charAt(j);
                        if (a == b) {
                            System.out.print(a);
                            rightLetters++;
                        }
                        if (a != b) {
                            System.out.print(noLeters[j]);
                        }
                        j++;
                    }
                for (int k = symb; k < 15; k++) {
                    System.out.print(noLeters[k]);
                }
            }
            System.out.println("Вы отгадали " + rightLetters + " букв. Попробуйте ещё раз.");
            }
            System.out.println();
        }
    }

