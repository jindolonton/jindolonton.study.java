package Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class SaveNews {
    private ArrayList<News> NewsList;
    private News news=new News();
    public SaveNews(){
        this.NewsList=new ArrayList<News>();
    }
    public void AddNewsList(News news){
        news.Nhap();
        this.NewsList.add(new News(news.getID(),news.getTitle(),news.getPublishDate(),news.getAuthor(),news.getContent(),news.getAverageRate()));

    }
    public void RateNewsList(){
        Scanner in=new Scanner(System.in);
        int x=0;
        do{
            System.out.println("Ban muon danh gia bai viet nao ID=?");
            int id=in.nextInt();

            for(int i=0;i<this.NewsList.size();i++) {
                if(this.NewsList.get(i).getID()==id){
                    System.out.println("Ban tin co ID= "+id+"la:" );
                    DisplayNewsList();
                    this.NewsList.get(i).Rate();
                    this.NewsList.get(i).Caculate();
                    this.NewsList.get(i).Display();
                    break;

                }

            }
            System.out.println("Ban co muon tiep tuc? Yes=1, No=0");
            x=in.nextInt();

        }while (x==1);


    }
    public void DisplayNewsList(){
        for (int i=0;i<this.NewsList.size();i++){

            this.NewsList.get(i).Display();
        }

    }


}
