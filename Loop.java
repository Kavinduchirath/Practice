public class Loop {
    public static void main(String[] args) {
        int [] arr ={10,20,30,40,50};
        System.out.println(arr.length);

        System.out.println();

        for (int i = 1; i <= arr.length; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i < 5; i+=1) {
            System.out.println(i);
        }

        int inc =0;
        while (inc < arr.length) {
            System.out.println(arr[inc]);
            inc+=1;
        }
    }
}
