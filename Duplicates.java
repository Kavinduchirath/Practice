public class Duplicates {
    public static void main(String[] args) {

        int [] main  = {10,20,30,40,50,60};
        int [] duplicate = {20,10,50,20,20,70,10,60,60,60,40,50,10,20,70,40,20,40,20,10,30,60,40,50,10,20,30};

        for (int i = 0; i < main.length; i++) {
            int count =0;
            for (int j = 0; j < duplicate.length; j++) {
                if (main[i] == duplicate[j]) {
                    count+=1;
                } else {
                    continue;
                }
            }
            System.out.println(main[i]+":"+count);  
        }
    }
}
