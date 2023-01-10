import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número que você deseja atingir na pirâmide: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            String s = ""+i;
            String repeatedString = s.repeat(i);
            System.out.println(repeatedString);
        }
    }
}
