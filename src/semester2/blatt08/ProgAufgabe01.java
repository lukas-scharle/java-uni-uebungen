package semester2.blatt08;

import javafx.application.Application;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.layout.Region;
import javafx.scene.layout.Priority;

public class ProgAufgabe01 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button neu = new Button("new");
        Button save = new Button("save");
        Button help = new Button("help");

        neu.setPrefWidth(400);
        save.setPrefWidth(400);
        help.setPrefWidth(400);

        Region spacer1 = new Region();
        Region spacer2 = new Region();

        HBox.setHgrow(spacer1, Priority.ALWAYS);
        HBox.setHgrow(spacer2, Priority.ALWAYS);

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.getChildren().addAll(neu, spacer1, save, spacer2, help);




        Scene scene = new Scene(hbox, 1800, 1000);
        primaryStage.setTitle("ProgAufgabe01");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static void main (String[] args){
        launch(args);
    }
}
