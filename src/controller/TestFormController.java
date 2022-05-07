package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TestFormController {


    public TextField txtTypeSomething;
    public Label lblSample;
    public Button btnHide;
    public Button btnShow;
    public Button btnClick;
    public AnchorPane root2;

    public void initialize() {
        btnHide.setVisible(false);
        btnShow.setVisible(false);
//        txtTypeSomething.setDisable(true);
//        btnClick.setDisable(true);
        setVisibility(true);
    }

    public void btnHelloJavaOnAction(ActionEvent actionEvent) {
        System.out.println("Hello Java");
//        txtTypeSomething.setDisable(false);
//        btnClick.setDisable(false);
        setVisibility(false);
    }

    public void btnClickOnAction(ActionEvent actionEvent) {
        String text = txtTypeSomething.getText();
        lblSample.setText(text);
        txtTypeSomething.clear();
        txtTypeSomething.requestFocus();
        btnShow.setVisible(true);
       btnHide.setVisible(true); //BolierPlate Coding


    }

    public void btnClcearOnAction(ActionEvent actionEvent) {
        lblSample.setText(" ");
    }

    public void setVisibility(boolean visibility) {
        txtTypeSomething.setDisable(visibility);
        btnClick.setDisable(visibility);
    }

    public void txtSomethingOnAction(ActionEvent actionEvent) {
        String text = txtTypeSomething.getText();
        lblSample.setText(text);
        txtTypeSomething.clear();
        txtTypeSomething.requestFocus();
        btnShow.setVisible(true);
        btnHide.setVisible(true);
    }

    public void btnHideOnAction(ActionEvent actionEvent) {
        btnShow.setDisable(false);
        btnHide.setDisable(true);
        lblSample.setVisible(false);
    }

    public void btnShowOnAction(ActionEvent actionEvent) {
        btnHide.setDisable(false);
        btnShow.setDisable(true);
        lblSample.setVisible(true);
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../view/DashboardForm.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage = (Stage)root2.getScene().getWindow();
        primaryStage.setScene(scene);

    }
}