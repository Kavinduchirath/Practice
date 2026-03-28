public class Increments {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Initial value of a: " + a);
        System.out.println();

        // Post-increment
        int postIncrement = a++;
        System.out.println("Post-increment (a++): " + postIncrement);
        System.out.println("Value of a after post-increment: " + a);

        //Space
        System.out.println("---");

        // Resetting a for demonstration
        a = 5;

        // Pre-increment
        int preIncrement = ++a;
        System.out.println("Pre-increment (++a): " + preIncrement);
        System.out.println("Value of a after pre-increment: " + a);

        a=5; // Resetting a again
        System.out.println("---");

        System.out.println(a=a+1);
        System.out.println(a);
    }

}
