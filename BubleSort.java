public class BubleSort {
    public static void main(String[] args) {

        int Ending = 50;
        int Start = 3;
        int total;int x = 1;int y=1;

        for (int i = 1; i <= Ending; i++) {
            total = x*y;
            if (total >= Start && total <= Ending) {
                System.out.println(total);
            }
            x+=1; y+=1;
        }
    }
}
