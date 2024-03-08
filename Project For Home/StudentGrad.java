


import java.util.Scanner;

public class StudentGrad {
    String name;
    int[] marks=new int[5];
    int per;
    void DisGrades(){
        System.out.println("Student Name: "+name);
        if(per>=90)
            System.out.println("Grade: A\nPass");
        else if(per>=80)
            System.out.println("Grade: B\nPass");
        else if(per>=70)
            System.out.println("Grade: C\nPass");
        else if(per>=60)
            System.out.println("Grade: D\nPass");
        else if(per>=50)
            System.out.println("Grade: E\nPass");
        else
            System.out.println("Grade: F\nFail");
    }
    void CalMarks(){
        int i=0;
        while(i<5){
            per+=marks[i];
            i++;
        }
        per=per/5;
        DisGrades();

    }

    void GetData(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Name: ");
        name=scn.nextLine();
        System.out.println("Enter Marks: ");
        for(int i=0;i<5;i++){
            System.out.println("Marks "+(i+1)+": ");
            marks[i]=scn.nextInt();
        }
        CalMarks();
    }
    public static void main(String[] args) {
        StudentGrad gc=new StudentGrad();
        gc.GetData();
    }
}