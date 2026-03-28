import java.util.Scanner;;;

public class SqureNum {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Range : ");
            int EndPoint = input.nextInt();

            int x=0;
            int y=1;

            for (int i = 0; i < EndPoint; i++) {
                x+=y;
                if (x <= EndPoint) {
                    System.out.println(x);
                    
                } else {
                    break;
                }
                y+=2;        
            }
        }
    }
}
