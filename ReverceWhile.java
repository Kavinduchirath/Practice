public class ReverceWhile {
    public static void main(String[] args) {
        
        int [] numbers = {10,20,30,40,50,60,70};

        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        int x = numbers.length-1;
        while (x >= 0) {
            System.out.println(numbers[x]);
            x--;   
        }
    }

}
