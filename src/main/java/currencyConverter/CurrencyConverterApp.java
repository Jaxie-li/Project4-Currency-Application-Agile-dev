package currencyConverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class CurrencyConverterApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/currencyConverter/Main.fxml"));
        Parent root = loader.load();
        MainController mainController = loader.getController();

        Scene scene = new Scene(root);
        String css = this.getClass().getResource("Main.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Currency Converter");
        stage.setResizable(false);
        stage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}