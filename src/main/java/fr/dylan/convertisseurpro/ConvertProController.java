package fr.dylan.convertisseurpro;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ConvertProController implements Initializable {

    @FXML
    private TextField tfInput;

    @FXML
    private Label lblMoney, lblResult;

    @FXML
    private ComboBox<Currency> cbLeft, cbRight;

    @FXML
    private Button btnConvert;

    @FXML
    private Button btnClear;

    @FXML
    void onComboAction(){
        lblMoney.setText(cbLeft.getValue().getSymbol());
    }

    @FXML
    void onClearAction() {
tfInput.setText("");
lblResult.setText("");
    }

    @FXML
    void onConvertAction() {
Currency inputLeft = cbLeft.getValue();
        Currency inputRight = cbRight.getValue();
         if (!tfInput.getText().isEmpty()){
             double input = Double.parseDouble(tfInput.getText().replace(",", "."));
             double res = (input * inputLeft.getEuroConversionRate()) / inputRight.getEuroConversionRate();
             lblResult.setText(String.format("%.2f",res) + " " + cbRight.getValue().getSymbol());

         }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
cbLeft.getItems().setAll(Currency.values());
cbLeft.getSelectionModel().selectFirst();
cbRight.getItems().setAll(Currency.values());
        cbRight.getSelectionModel().selectFirst();
        onClearAction();

    }
}
