public class MinMax {
    public static void main(String[] args) {

    int [] ArrayCont = {84,80,45,69,84,67,79,58};
    int index_max = 0;int index_min = 0;
    
      //Calculate the total 
      int total = 0;
      for (int i = 0; i < ArrayCont.length; i++) {
        total = total + ArrayCont[i];
      }
      System.out.println("Total : "+ total);

      //Calculate Average
      double Avg;
      Avg = total / ArrayCont.length;
      System.out.println("Average Marks : "+Avg);

      //Calculate number of students
      int number_of_student;
      number_of_student= 0;
      for (int i = 0; i < ArrayCont.length; i++) {
        if (ArrayCont[i] > Avg) {
            number_of_student = number_of_student +1;
        } else {
            continue;
        }
      }
      System.out.println("Number of Students Marks Greater than Average : "+ number_of_student);
    
    //Find Maximum Marks
    var max = ArrayCont[0]; var min = ArrayCont[0];
      try {
        // int index_max;
        for (int i = 1; i < ArrayCont.length-1; i++) {
            if (max < ArrayCont[i]) {
                max = ArrayCont[i];
                index_max=i;
            } else {
                continue;
            }
        // System.out.println(max); "Wedima Numbers Thuna Print wenawa"
        }
        System.out.println("Max Value : "+ max);
        System.out.println("Max index : "+ index_max);

      } catch (Exception e) {
        System.out.println("Error");
      }
      //Find minimum marks
      try {
        // int index_min;
        for (int i = 1; i < ArrayCont.length-1; i++) {
            if (min > ArrayCont[i]) {
                min = ArrayCont[i];
                index_min=i;
            } else {
                continue;
            }
         //System.out.println(max); //"Wedima Numbers Thuna Print wenawa"
        }
        System.out.println("Min Value : "+ min);
        System.out.println("Min index : "+ index_min);

      } catch (Exception e) {
        System.out.println("Error");
      }
    }
}