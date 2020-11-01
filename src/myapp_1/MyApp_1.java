/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp_1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 *
 * @author Miftahul Asror Regowo
 */
public class MyApp_1 extends Application {
    
@Override            
  
public void start(Stage stage) {

Text t1 = new Text("Nama     :");
Text t2 = new Text("Telepon  :");
Text t3 = new Text("Alamat   :");
Text t4 = new Text();
Text t5 = new Text();
Text t6 = new Text();
Text t7 = new Text();
TextField tField1 = new TextField();
TextField tField2 = new TextField();
TextArea tArea1 = new TextArea();

Button btn1 = new Button("Kirim");
Button btn2 = new Button("Hapus");
        
GridPane gridPane = new GridPane();
gridPane.setMinSize(400, 300);
gridPane.setPadding(new Insets(100,100,100,100));
gridPane.setVgap(10);
gridPane.setHgap(10);
gridPane.setAlignment(Pos.CENTER);

gridPane.add(t1, 0, 0);
gridPane.add(tField1, 1, 0);
gridPane.add(t2, 0, 1);
gridPane.add(tField2, 1, 1);
gridPane.add(t3, 0, 2);
gridPane.add(tArea1, 1, 2);
gridPane.add(btn1, 0, 3);
gridPane.add(btn2, 1, 3);
gridPane.add(t4, 1, 4);
gridPane.add(t5, 1, 5);
gridPane.add(t6, 1, 6);
gridPane.add(t7, 1, 7);

btn1.setOnAction(value -> {
    t4.setText("SELAMAT BERGABUNG DENGAN KAMI");
    t5.setText(t1.getText() + "   " + tField1.getText());
    t6.setText(t2.getText() + "   " + tField2.getText());
    t7.setText(t3.getText() + "   " + tArea1.getText());
});

btn2.setOnAction(value -> {
    tField1.setText("");
    tField2.setText("");
    tArea1.setText("");
    t4.setText("");
    t5.setText("");
    t6.setText("");
    t7.setText("");
});

Scene scene1 = new Scene(gridPane);

stage.setTitle("Les Bimbel PrimaTika");
    stage.setScene(scene1);
        stage.show();
}
public static void main(String args[]){
launch(args);
    }
}
