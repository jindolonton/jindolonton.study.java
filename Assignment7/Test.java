package Assignment7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SaveNews sv = new SaveNews();
        News news=new News();
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("|----------------------------|");
            System.out.println("|0. Exit                     |");
            System.out.println("|1. Insert News              |");
            System.out.println("|2. View List News           |");
            System.out.println("|3. AverageRate News         |");
            System.out.println("|----------------------------|");
            x=in.nextInt();
            while(x>3){
                System.out.println("Chose Again:");
                x=in.nextInt();

            }
            switch (x){
                case 1:
                    news.Nhap();
                    sv.AddNewsList(news);
                    break;
                case 2:
                    sv.DisplayNewsList();
                    break;
                case 3:
                    sv.RateNewsList();

                    break;
            }

        } while (x != 0);

    }
}
