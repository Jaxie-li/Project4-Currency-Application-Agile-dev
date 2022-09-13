package currencyConverter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class AddNewCurrencyTypeController {

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    private Stage stage;

    private Scene scene;

    private Parent root;

    public void setCsv(Csv csv) {
        this.csv = csv;
        int length = this.csv.records.size();
        for (int i = 1; i < length; i++) {
            TargetType.getItems().add(this.csv.records.get(i).get(0));

        }
    }
    public Csv csv;

    @FXML
    private ChoiceBox<String> TargetType;

    @FXML
    private void initialize (){
    }

    public void returnAdminPage(javafx.event.ActionEvent actionEvent) throws IOException {
        //In the exchange rate page can return the previous page(admin page)
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/currencyConverter/AdminUser.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
