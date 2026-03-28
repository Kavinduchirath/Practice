public class MaxNumber {
    public static void main(String[] args) {

        int [] ArrayCont = {114,39,425,69,14,447,1122,
            558,211,447,22,1,9,66,88,774,226};

    //     for(int indexes : ArrayCont){
    //     System.out.println("Enter Number : "+ indexes);
    //    }

       try {
        int x=1;
        while (x<= ArrayCont.length-1) {
        if (ArrayCont[0]>ArrayCont[x]) {
            ArrayCont[0]=ArrayCont[0];
            
        } else {
            ArrayCont[0]=ArrayCont[x];
        }
        x=x+1;
    }
    System.out.println("Max Number : "+ArrayCont[0]);
       } catch (Exception e) {
        System.out.println("This Programme has some error");
        System.out.println(e.getMessage());
       }
       finally{
        System.out.println("This is From Finally");
       }
    }
}
