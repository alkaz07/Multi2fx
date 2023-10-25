package com.example.multi2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static java.lang.Thread.sleep;

public class HelloController {

    @FXML
    private Button btnStart1;

    @FXML
    private Button btnStart2;

    @FXML
    private TextField txtVal1;

    @FXML
    private TextField txtVal2;

    @FXML
    void startOne() {
        Thread tr1 = new Thread(()->{
            try {
                for (int i = 0; i < 7; i++) {
                    sleep(500);
                    txtVal1.setText( String.valueOf(Integer.parseInt(txtVal1.getText())+1));
                    double x = txtVal1.getLayoutX();
                    x+=15;
                    txtVal1.setLayoutX(x);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        tr1.start();
    }

    @FXML
    void startTwo() {
        Thread tr2 = new Thread(()->{
            try {
                for (int i = 0; i < 10; i++) {
                    sleep(450);
                    txtVal2.setText( String.valueOf(Integer.parseInt(txtVal2.getText())+1));
                    double x = txtVal2.getLayoutX();
                    x+=14;
                    txtVal2.setLayoutX(x);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        tr2.start();
    }

}
