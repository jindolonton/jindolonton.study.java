package Assignment7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SaveNews sv = new SaveNews();
        News news=new News();
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("/n/t/t-----------------------------------------------------------------");
            System.out.println("/t/t|0. Exit/t/t/t/t |");
            System.out.println("/t/t|1. Insert News/t/t/t/t |");
            System.out.println("/t/t|2. View List News/t/t/t/t |");
            System.out.println("/t/t|3. AverageRate News/t/t/t/t |");
            System.out.println("/t/t-------------------------------------------------------------------");
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
