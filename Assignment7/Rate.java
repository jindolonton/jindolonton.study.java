package Assignment7;

import java.util.Scanner;

class Rate{
    private int RateList[]=new int[3];
    private int cout=0;

////    public Rate(){
////        for (int i=0;i<3;i++){
////            RateList[i]=new int();
////        }
//
//    }
    public void AddRateList(){
        Scanner in=new Scanner(System.in);


        for (int i=1;i<4;i++) {
            System.out.println("Nhap danh gia ve bai viet lan "+i+":");
            RateList[i-1]=in.nextInt();
        }

    }

    public float Caculate(){
        int TC=0;
        for(int i=0;i<3;i++){
             TC += RateList[i];
        }
        return TC/3;

    }

}
