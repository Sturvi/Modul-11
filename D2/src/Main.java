import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        while (true){
            try {
                numberList.add(scanner.nextInt());
            } catch (InputMismatchException e) {
                break;
            }
        }

        for (int i = 0; i < numberList.size(); i++) {
            System.out.println(numberList.get(i));
        }
    }
}