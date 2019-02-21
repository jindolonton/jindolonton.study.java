package Assignment8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        Manager manager=new Manager();
        Student student=new Student();
        Scanner in=new Scanner(System.in);
        int x;
        do{
            System.out.println("|-----------------------");
            System.out.println("|0. Exit           |");
            System.out.println("|1. AddSudent      |");
            System.out.println("|2. Edit           |");
            System.out.println("|3. Delete         |");
            System.out.println("|4. SortbyName     |");
            System.out.println("|5. SortbyGpa      |");
            System.out.println("|6. Show           |");

            System.out.println("------------------------");
            x=in.nextInt();
            while(x>6){
                System.out.println("Chose Again:");
                x=in.nextInt();

            }
            switch (x){
                case 0:break;
                case 1:
                    manager.addStudentList(student);break;
                case 2:
                    manager.editStudentById();break;

                case 3:
                    manager.deleteStudentById();break;

                case 4:
                    manager.sortStudentByName();break;


                case 5:
                    manager.sortStudentbyGpa();break;


                case 6:
                    manager.Display();break;


            }
        }while (x!=0);

    }
}
