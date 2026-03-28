public class Pattern {
    public static void main(String[] args) {
        
        //pattern type 1 
        for (int i = 4; i > 0; i--) {
            int x = 1;

            while (x <= 4) {
                if (x <= i - 1) {
                    System.out.print(" \t");
                } else {
                    System.out.print("*\t");
                }
                x++;
            }
            System.out.println();
        }

        System.out.println();

        //pattern type 2 
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i <= 4; i++) {
                if (i <= j) {
                    System.out.print(" \t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }

        //pattern type 3 
        int i = 1;
        while (i <= 4) {
            int x = 1;
            while (x <= i) {
                System.out.print("*\t");
                x = x + 1;
            }
            System.out.println();
            i = i + 1;
        }
        System.out.println();

        //pattern type four
        i = 4;
        while (i >= 1) {
            int x = 1;
            while (x <= i) {
                System.out.print("*\t");
                x = x + 1;
            }
            System.out.println();
            i = i - 1;
        }
        System.out.println();
    }
}