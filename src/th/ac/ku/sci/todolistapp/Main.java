package th.ac.ku.sci.todolistapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        primaryStage.setTitle("Todo List");
        primaryStage.setScene(new Scene(root, 80+150*4+20, 600));
        primaryStage.show();
    }
}
