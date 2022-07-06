package com.example.demo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class HelloApplication extends Application {
    double x,y;
    Label lb1 = new Label("Input your x : ");
    Label lb2 = new Label("Input your y : ");

    Label lb3 = new Label("Your x = ");
    Label lb4 = new Label("Your y = ");

    TextField tf1 = new TextField();
    TextField tf2 = new TextField();

    TextField tf3 = new TextField();
    TextField tf4 = new TextField();

    GridPane gP1=new GridPane();
    GridPane gP2=new GridPane();

    HBox hbox1 =new HBox();

    Button bt1=new Button("Submit") ;
    Button bt2=new Button("Check") ;
    VBox paan=new VBox();

    VBox vbox1=new VBox();

    Label lb5= new Label("Input the operation (+,-,/,*) ");

    TextField tf6=new TextField();
    TextField tf5=new TextField();
    Button bt3=new Button("Submit");

    @Override
    public void start(Stage stage) throws IOException {
        x = 0;
        y = 0;


        gP1.setHgap(10);
        gP1.setVgap(12);

        gP1.add(lb1,0,0);
        gP1.add(lb2,0,1);
        gP1.add(tf1,1,0);
        gP1.add(tf2,1,1);

        gP1.setAlignment(Pos.CENTER);

        gP2.setHgap(10);
        gP2.setVgap(12);

        gP2.add(lb3,0,0);
        gP2.add(lb4,0,1);
        gP2.add(tf3,1,0);
        gP2.add(tf4,1,1);

        gP2.setAlignment(Pos.CENTER);

        hbox1.setSpacing(10);

        hbox1.getChildren().addAll(bt1,bt2);
        hbox1.setAlignment(Pos.CENTER);

        vbox1.setSpacing(10);

        //vbox1.setAlignment(Pos.CENTER);

        bt3.setOnAction(e->getOperation(tf5,tf6));

        vbox1.getChildren().addAll(lb5,tf5,bt3,tf6);

        paan.setSpacing(10);
        paan.getChildren().addAll(gP1,hbox1,gP2,vbox1);

        bt1.setOnAction(e->{
            x=getValue(tf1);
            y=getValue(tf2);
        });

        bt2.setOnAction(e->{
            checker(tf3,tf4);

        });

        Scene scene = new Scene(paan, 400, 400);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();



        //FXMLLoader fxmlLoader = new FXMLLoader());



    }

    private double getOperation(TextField tf, TextField tf2) {
        double result;

            String st = tf.getText();
            //System.out.println("\nYour value is = "+st+"\n");

            switch(st) {
                case ("+") :{result= plus(x,y);tf2.setText(String.valueOf(result));return result;}
                case ("-") :{result= minus(x,y);tf2.setText(String.valueOf(result));return result;}
                case ("*") :{result= mult(x,y);tf2.setText(String.valueOf(result));return result;}
                case ("/") :{result= div(x,y);tf2.setText(String.valueOf(result));return result;}
                default: {tf2.setText("Your data is incorrect!");return 1;}
            }

    }

    private double minus(double a, double b) {
        return a-b;
    }
    private double plus(double a, double b) {
        return a+b;
    }
    private double mult(double a, double b) {
        return a*b;
    }
    private double div(double a, double b) {

       if(b==0) {
           System.out.println("Division by NULL");return 1;
       }else return a/b;

    }


    private void checker(TextField lb3,TextField lb4) {
        lb3.setText(String.valueOf(x));
        lb4.setText(String.valueOf(y));
    }

    public static int getValue(TextField lb) {
        try {
            int i = Integer.parseInt(lb.getText());
            //System.out.println("\nYour value is = "+i+"\n");
            return i;

        }catch(NumberFormatException e){lb.setText("Incorrect input!");return 1;}

    }
    public static void main(String[] args) {
        launch();
    }
}