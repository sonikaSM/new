package com.example.demo4;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApp2 extends Application {
    @FXML
    private Label lb;



    String a;
    double c,b;
    int indicator;
    double res;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("calc-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 482, 655);

        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


    public void SetText(String str) {
        String str2=lb.getText();
        lb.setText(str2+str);
    }
    public void OnClick1(MouseEvent event){
        SetText("1");
    }

    public void OnClick2(MouseEvent event){

        SetText("2");
    }
    public void OnClick3(MouseEvent event){

        SetText("3");
    }
    public void OnClick4(MouseEvent event){

        SetText("4");
    }
    public void OnClick5(MouseEvent event){

        SetText("5");
    }
    public void OnClick6(MouseEvent event){

        SetText("6");
    }
    public void OnClick7(MouseEvent event){

        SetText("7");
    }
    public void OnClick8(MouseEvent event){

        SetText("8");
    }
    public void OnClick9(MouseEvent event){

        SetText("9");
    }
    public void OnClick0(MouseEvent event){

        SetText("0");
    }

    private double getValue(){
        double g;
        g=Double.parseDouble(lb.getText());
        lb.setText("");
        return g;
    }

    public void OnClick_plus(MouseEvent event) {
        c=getValue();
        indicator=1;
    }
    public void OnClick_minus(MouseEvent event) {
        c=getValue();
        SetText("-");
        indicator=1;
    }
    public void OnClick_div(MouseEvent event) {
        c=getValue();
        indicator=2;
    }
    public void OnClick_mult(MouseEvent event) {
        c=getValue();
        indicator=3;
    }
    public void OnClick_pt(MouseEvent event) {
        SetText(".");
    }
    public void OnClick_eq(MouseEvent event) {
        b=getValue();
        double result=0;

        switch (indicator){
            case 1: {
                result=plus(c,b);
                lb.setText(String.valueOf(result));break;}
            case (2): {result=div(c,b);lb.setText(String.valueOf(result));break;}
            case (3): {result=mult(c,b);lb.setText(String.valueOf(result));break;}
            default: lb.setText("Something wrong!");
        }
        res=result;
    }

    private double plus(double x,double y) {
        //System.out.println(x+y);
        return x+y;
    }
    private double div(double x,double y) {
        //System.out.println(x/y);
        if(y!=0) return x/y;
        else {lb.setText("Division by NULL");return 1;}
    }
    private double mult(double x,double y) {
        //System.out.println(x*y);
        return x*y;
    }
    public void onClickClear(MouseEvent event){
        lb.setText("");
    }


}