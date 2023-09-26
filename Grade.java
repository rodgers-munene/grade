public class Grade{
    public static void main(String[] args){
        String name = "Rodgers Munene";
        String rollNo = "C026-01-0939/2022";
        int currentSemester = 2;
        int database = 70;
        int systems = 68;
        int algorithm = 74;
        int statistics = 75;
        int total = database + systems + algorithm + statistics;
        float average = total/4f;
        String grade;
        if(average >= 70){
            grade = "A";
        }else if(average >= 60){
            grade = "B";
        }else if(average >= 50){
            grade = "C";
        }else if(average >= 40){
            grade = "D";
        }else{
            grade = "E";
        }
        System.out.println("                      Department of Computer Science            ");
        System.out.println("                         End of semester results                ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("|Name:-                   |Roll_No:                    Semester:");
        System.out.println("\n");
        System.out.println(name + "            " + rollNo + "                  "+ currentSemester);
        System.out.println("________________________________________________________________");
        System.out.println("|Unit Code                |Unit Name:                     Score:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("|CCS2101                  |Database                       |"+ database);
        System.out.println("\n");
        System.out.println("|CCS2102                  |Systems                        |"+ systems);
        System.out.println("\n");
        System.out.println("|CCS2103                  |Algorithm                      |"+algorithm);
        System.out.println("\n");
        System.out.println("|CCS2104                  |Statistics                     |"+ statistics);
        System.out.println("----------------------------------------------------------------");
        System.out.println("|Total                                                    |"+ total);
        System.out.println("----------------------------------------------------------------");
        System.out.println("|Average                                                  |"+ average);
        System.out.println("----------------------------------------------------------------");
        System.out.println("|Grade                                                    |"+ grade);
        System.out.println("----------------------------------------------------------------");
        System.out.println("                                            Recommendation|    " );
        System.out.println("----------------------------------------------------------------");
        System.out.println("Grading criteria             Overall Grade(A-D)  Recommend Pass  " );
        System.out.println("70-100      A");
        System.out.println("60-69       B");
        System.out.println("50-59       C");
        System.out.println("40-49       D");
        System.out.println("Below 40    F");
        System.out.println("----------------------------------------------------------------");


        

    }
}

    
