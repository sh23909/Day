import com.sun.javafx.runtime.SystemProperties;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class DayDriver extends Application {
    public static void main(String [] args) {
  
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        String []array= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        ObservableList<String> days = FXCollections.observableArrayList(array);
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(days);
        comboBox.setOnAction(e->display(days,comboBox));
        Pane pane = new Pane(comboBox);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void display(ObservableList<String> days, ComboBox<String> comboBox) {
       Day day = new Day(days.indexOf(comboBox.getValue()));
       System.out.println("next day: " + day.nextDay());
       System.out.println("current day: " + day.getDay());
       System.out.println("previous day: " + day.previousday());
       System.out.println("-10 day: " +day.calculateDay(-10));
       
    }
}