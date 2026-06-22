package semester2.blatt08;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;

public class ProgAufgabe02 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Essenmarken-Automat");

        Button essen1 = new Button("Essen 1");
        Button essen2 = new Button("Essen 2");
        Button ct10 = new Button("10 Cent");
        Button ct50 = new Button("50 Cent");

        Separator separator1 = new Separator();
        Separator separator2 = new Separator();

        HBox hbox1 = new HBox();
        hbox1.setPadding(new Insets(10, 10, 10, 10));
        hbox1.getChildren().addAll(essen1, ct10);
        hbox1.setSpacing(10);

        HBox hbox2 = new HBox();
        hbox2.setPadding(new Insets(10, 10, 10, 10));
        hbox2.getChildren().addAll(essen2, ct50);
        hbox2.setSpacing(10);

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.getChildren().addAll(label, separator1, hbox1, separator2, hbox2);
        vbox.setSpacing(0);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("ProgAufgabe02");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    static void main(String[] args) {
        launch(args);
    }

}