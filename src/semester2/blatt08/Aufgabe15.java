package semester2.blatt08;

import javafx.application.Application;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

public class Aufgabe15 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button cancel = new Button("Cancel");
        Button ok = new Button("OK");
        Button ja = new Button("Ja");
        Button nein = new Button("Nein");

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(20, 10, 10, 10));
        vbox.getChildren().addAll(cancel, ok);
        vbox.setSpacing(10);

        VBox vbox2 = new VBox();
        vbox2.setPadding(new Insets(20, 10, 10, 10));
        vbox2.getChildren().addAll(ja, nein);
        vbox2.setSpacing(10);

        HBox root = new HBox();
        root.setSpacing(10);
        root.getChildren().addAll(vbox, vbox2);

        Scene scene = new Scene(root, 400, 250);

        primaryStage.setTitle("Aufgabe 15 und 16");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static void main(String[] args) {
        launch(args);
    }

}

