/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
public class JavaFX1 extends Application {
    public void start (Stage primaryStage){
        Button btn1=new Button ("ok");
        Button btn2=new Button("hi");
        StackPane pane=new StackPane();
        pane.getChildren().addAll(btn1,btn2);
        Scene scene1=new Scene (pane,500,250);
        primaryStage.setTitle("lujain");
        primaryStage.setScene(scene1);
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
