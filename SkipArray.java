public class SkipArray {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if ( i % 2 != 0 && i % 7 != 0) {
                System.out.print(i);
            } else {
               continue; 
            }            
        }
        System.out.println();
        
        int i = 1;
        while (i <= 50) {
            if (i % 2 != 0 && i % 7 != 0) {
                System.out.print(i);
            } else {
                i++;
                continue;
            }
            i++;
        }
    }
}
