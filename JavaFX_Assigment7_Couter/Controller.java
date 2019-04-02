package sample.JavaFX_Assigment7_Couter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField output;




    static boolean state=true;

    static  double count=0;
    static double number=0;

//    {
//        output.setText("");
//
//    }

    public void start(ActionEvent actionEvent) {
state=true;



        Thread thread1= new Thread(){
            public void run() {


                for (; ; ) {
                    if (state == true) {
                        try {
                            sleep(100);
                            output.setText("" + number);
                            number++;

                        } catch (Exception e) {
                            System.out.println(e.getMessage());

                        }

                    }
                    else {
                         break;

                    }
                }
            }

        };
        thread1.start();

    }

    public void reset(ActionEvent actionEvent) {
        state=false;
        number=0;
        output.setText("");
    }

    public void pause(ActionEvent actionEvent) {

        state=false;
        output.setText(""+number);
        number=Double.parseDouble(output.getText());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}
