
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controllVeterinaria {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button butAgregar;

    @FXML
    private Button butBorrar;

    @FXML
    private Button butRescribir;

    @FXML
    private Label lblNombre;

    @FXML
    private Label lblNombreDueño;

    @FXML
    private Label lblRaza;

    @FXML
    private Label lblRgistrarMascota;

    @FXML
    private Label lblVeterinaria;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNombreDueño;

    @FXML
    private TextField txtRaza;

    @FXML
    void borrarDtosrecienEscritos(ActionEvent event) {

    }

    @FXML
    void escribirEdad(ActionEvent event) {

    }

    @FXML
    void escribirNombre(ActionEvent event) {

    }

    @FXML
    void escribirNombreDueño(ActionEvent event) {

    }

    @FXML
    void escribirRaza(ActionEvent event) {

    }

    @FXML
    void seAgregaMascota(ActionEvent event) {

    }

    @FXML
    void seVuelveReescribir(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert butAgregar != null : "fx:id=\"butAgregar\" was not injected: check your FXML file 'vistaVeterinaria.fxml'.";
        assert butBorrar != null : "fx:id=\"butBorrar\" was not injected: check your FXML file 'vistaVeterinaria.fxml'.";
        assert butRescribir != null : "fx:id=\"butRescribir\" was not injected: check your FXML file 'vistaVeterinaria.fxml'.";
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'vistaVeterinaria.fxml'.";
        assert lblNombreDueño != null : "fx:id=\"lblNombreDueño\" was not injected: check your FXML file 'vistaVeterinaria.fxml'.";
        assert lblRaza != null : "fx:id=\"lblRaza\" was not injected: check your FXML file 'vistaVeterinaria.fxml'.";
        assert lblRgistrarMascota != null : "fx:id=\"lblRgistrarMascota\" was not injected: check your FXML file 'vistaVeterinaria.fxml'.";
        assert lblVeterinaria != null : "fx:id=\"lblVeterinaria\" was not injected: check your FXML file 'vistaVeterinaria.fxml'.";
        assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'vistaVeterinaria.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'vistaVeterinaria.fxml'.";
        assert txtNombreDueño != null : "fx:id=\"txtNombreDueño\" was not injected: check your FXML file 'vistaVeterinaria.fxml'.";
        assert txtRaza != null : "fx:id=\"txtRaza\" was not injected: check your FXML file 'vistaVeterinaria.fxml'.";

    }

}

