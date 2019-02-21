package Assignment8;

import java.security.PublicKey;
import java.util.Scanner;

public class Student {
    int ID;
    String Name;
    int Age;
    String Address;
    float gpa;
    Scanner in=new Scanner(System.in);

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Student(){

    }
    public Student(int ID, String Name, int Age, String Address, float gpa){
        this.ID=ID;
        this.Name=Name;
        this.Age=Age;
        this.Address=Address;
        this.gpa=gpa;
    }


    public void addStudent(){
        System.out.println("ID:");
        ID=Integer.valueOf(in.nextLine());
        System.out.println("Name:");
        Name=in.nextLine();
        System.out.println("Age:");
        Age=Integer.valueOf(in.nextLine());
        System.out.println("Address:");
        Address=in.nextLine();
        System.out.println("gpa:");
        gpa=Float.valueOf(in.nextLine());


    }
    public void Display(){
        System.out.println("  "+this.getID()+"--"+this.getName()+"--"+this.getAge()+"--"+this.getAddress()+"--"+this.getGpa());

    }


    }



