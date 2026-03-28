import java.util.Scanner;

public class SqureRange {
    public static void main(String[] args) {
        int x=1; int y=1; int total;

        try (Scanner input_ranges = new Scanner(System.in)) {
            System.out.println("Enter the Starting : ");
            int Start = input_ranges.nextInt();

            System.out.println("Enter the Ending : ");
            int Ending = input_ranges.nextInt();

            System.out.println();

            for (int i = 1; i <= Ending; i++) {
                total = x*y;
                if (total >= Start && total <= Ending) {
                    System.out.println(total);
                }
                x+=1; y+=1;
            }
        }
    }
}
