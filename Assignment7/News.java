package Assignment7;

import java.util.Scanner;

public class News implements INews{
    @Override
    public void Display(){
        System.out.println(+this.getID() +"----"+ this.getTitle()+"----"+ this.getPublishDate()+ "----"+this.getAuthor()+ "----"+this.getContent()+ "----"+this.getAverageRate());

    }

    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    private int RateList[]=new int[3];

    public News(){

    }
    public News(int ID, String Title, String PublishDate, String Author, String Content){
        this.ID=ID;
        this.Title=Title;
        this.PublishDate=PublishDate;
        this.Author=Author;
        this.Content=Content;

    }
    public News(int ID, String Title, String PublishDate, String Author, String Content,float a){
        this.ID=ID;
        this.Title=Title;
        this.PublishDate=PublishDate;
        this.Author=Author;
        this.Content=Content;
        this.AverageRate=a;

    }


        public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitle() {
        return Title;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getContent() {
        return Content;
    }

    public float getAverageRate() {
        return AverageRate;
    }


    public void Nhap(){
        Scanner in=new Scanner(System.in);

        System.out.println("ID:");
        ID=in.nextInt();
        System.out.println("Title:");
        Title=in.nextLine();
        System.out.println("PublishDate");
        PublishDate=in.nextLine();
        System.out.println("Author:");
        Author=in.nextLine();
        System.out.println("Content");
        Content=in.nextLine();

    }
    public void Rate(){
        Scanner in=new Scanner(System.in);


        for (int i=1;i<4;i++) {
            System.out.println("Nhap danh gia ve bai viet lan "+i+":");
            RateList[i-1]=in.nextInt();
        }

    }
    public void Caculate(){
        int TC=0;
        for(int i=0;i<3;i++){
            TC += RateList[i];
        }
        this.AverageRate=TC/3;

    }

}
