public class Reverse {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50,60};
        
        int increment = numbers.length-1;

        while (increment >= 0) {
            System.out.println(numbers[increment]);
            increment-=1;
        }

    }

}
