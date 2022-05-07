package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class DashBoardController {
    public AnchorPane root;

    public void TestFormOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../view/TestForm.fxml"));
        Scene scene = new Scene(parent);
       Stage primaryStage = (Stage)root.getScene().getWindow();
       primaryStage.setScene(scene);
       primaryStage.setTitle("Test Form");
       primaryStage.centerOnScreen();
    }

    public void TableFormOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../view/TableForm.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage = (Stage)root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Table Form");
        primaryStage.centerOnScreen();
    }
}
