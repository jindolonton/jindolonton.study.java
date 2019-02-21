package Assignment8;

import javax.naming.Name;
import java.util.*;

public class Manager {
    ArrayList<Student >StudentList;
    Student student=new Student();
    public Manager(){
        this.StudentList=new ArrayList<Student>();
    }

    public void addStudentList(Student student){
        student.addStudent();
        this.StudentList.add(new Student(student.getID(),student.getName(),student.getAge(),student.getAddress(),student.getGpa()));
    }

    public void editStudentById(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap Id");
        int Id=Integer.valueOf(scanner.nextLine());
        for (int i=0;i<this.StudentList.size();i++){
            if(Id==this.StudentList.get(i).ID){
                this.luachonEdit();
                int x=Integer.valueOf(scanner.nextLine());
                switch (x){
                    case 0:
                        break;
                    case 1:
                        System.out.println("Ten ban muon sua:");
                        this.StudentList.get(i).Name=scanner.nextLine();
                        this.StudentList.get(i).Display();
                        break;

                    case 2:
                        System.out.println("tuoi ban muon sua:");
                        this.StudentList.get(i).Age=Integer.valueOf(scanner.nextLine());
                        this.StudentList.get(i).Display();
                        break;


                    case 3:
                        System.out.println("dia chi ban muon sua:");
                        this.StudentList.get(i).Address=scanner.nextLine();
                        this.StudentList.get(i).Display();
                        break;

                    case 4:
                        System.out.println("diem ban muon sua:");
                        this.StudentList.get(i).gpa=Float.valueOf(scanner.nextLine());
                        this.StudentList.get(i).Display();
                        break;

                }
            }
        }

    }

    public void deleteStudentById(){
        Scanner in=new Scanner(System.in);
        System.out.println("Nhap Id sinh vien muon xoa");
        int id=in.nextInt();
        for(int i=0;i<this.StudentList.size();i++){
            if(id==this.StudentList.get(i).ID){
                this.StudentList.remove(this.StudentList.get(i));
                break;
            }
        }


    }

    public void sortStudentbyGpa(){
        Collections.sort(StudentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if ((o1.getGpa() - o2.getGpa()) < 0) {
                    return -1;
                }
                else{

                return 1;
                }
            }
        });
        for(int i=0;i<this.StudentList.size();i++){
            this.StudentList.get(i).Display();
        }
    }

    public void sortStudentByName(){
        Collections.sort(StudentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(int i=0;i<this.StudentList.size();i++){
            this.StudentList.get(i).Display();
        }
    }







    public void luachonEdit(){
        System.out.println("0.Exit");
        System.out.println("1.Edit Name");
        System.out.println("2.Edit Age");
        System.out.println("3.Edit Address");
        System.out.println("4.Edit Gpa");
    }

    public void Display(){
        for(int i=0;i<this.StudentList.size();i++){
            this.StudentList.get(i).Display();
        }
    }




}
