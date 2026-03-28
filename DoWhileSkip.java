public class DoWhileSkip {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
        if (i == 4) {
            i++;
            continue;
        }
        System.out.print(i+ " ");
        i++;
        }  

        System.out.println();

        for (i=0;i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.print(i+" ");
            }

            int[] numbers = {3, -1, 7, 0, 9};

        System.out.println();

        for (int n : numbers) {
        if (n < 0) {
            continue; // skip negative numbers
        }
        if (n == 0) {
            break; // stop loop when zero is found
        }
        System.out.print(n+" ");
        }
  }
}

