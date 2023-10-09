
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class project2 extends Application {
    public void start(Stage primaryStage){
       Button btn1=new Button ("Pause");
        Button btn2=new Button ("Resume");
         Button btn3=new Button ("Increase");
          Button btn4=new Button ("Decrease");
          Label lab=new Label("صويلح-جامعة");
          lab.setTextFill(Color.ORANGE);
          lab.setLayoutX(30);
          lab.setLayoutY(52);
          lab.setPrefSize(45, 90);
          Font f=new Font(6.5);
          lab.setFont(f);
        HBox box=new HBox (30) ;
        box.getChildren().addAll(btn1,btn2,btn3,btn4);
        box.setAlignment(Pos.CENTER);
        StackPane bus=new StackPane();
        Rectangle rec =new Rectangle(300,200,300,137);
        Circle c1 =new Circle(98,120,1);
        Circle c2 =new Circle(240,120,1);
        Color color=new Color(1,1,1,0);
        rec.setFill(color);
        Image icon = new Image ("bus.png");
        primaryStage.getIcons().add(icon);
        BorderPane pane =new BorderPane();
        Image bus1 = new Image ("bus1.png");
        ImageView Bus=new ImageView(bus1);
        Image cir = new Image ("circle.png");
        ImageView ci1=new ImageView(cir);
        ImageView ci2=new ImageView(cir);
        ci1.setTranslateX(78);
        ci1.setTranslateY(105);
        ci2.setTranslateX(221);
        ci2.setTranslateY(105);
        Line line=new Line(0,200,750,200);
        Line line2=new Line(0,268,800,268);
        line.setStrokeWidth(8);
        line.setStroke(Color.BLACK);
        Pane root=new Pane();
        Pane pane1=new Pane();
        bus.getChildren().addAll(rec,Bus);
        bus.setAlignment(Pos.CENTER);
        root.getChildren().addAll(bus,lab,c1,ci1,c2,ci2);
        pane1.getChildren().addAll(root,line2);
        pane.setCenter(pane1);
        pane.setBottom(box);
       PathTransition p =new PathTransition(Duration.seconds(1),line,root);
       c1.setRotate(45);
       c2.setRotate(45);
        p.setCycleCount(Timeline.INDEFINITE);
        p.play();
        PathTransition p1 =new PathTransition(Duration.seconds(.9),c1,ci1);
        p1.setCycleCount(Timeline.INDEFINITE);
        p1.play();
        PathTransition p2 =new PathTransition(Duration.seconds(.9),c2,ci2);
        p2.setCycleCount(Timeline.INDEFINITE);
        p2.play();  
        btn1.setOnAction(e->{
            p.pause();
            p1.pause();
            p2.pause();
       });
        btn2.setOnAction(e->{
            p.play();
            p1.play();
            p2.play();
                });
        btn3.setOnAction(e->{
            p.setRate(p.getRate()*1.5);
            p1.setRate(p1.getRate()*1.5);
            p2.setRate(p2.getRate()*1.5);
       });
        btn4.setOnAction(e->  {
            p.setRate(p.getRate()*.5);
            p1.setRate(p1.getRate()*.5);
            p2.setRate(p2.getRate()*.5);
       }
        );
        Scene scene =new Scene(pane,800,500);
        primaryStage.setTitle("كوستر صويلح");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main (String []args){
        Application.launch(args);
       
              
    }
    
}
