/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author daw
 */
public class FXMLDocumentController implements Initializable {
    ObservableList<String> listaAlumnos = FXCollections.observableArrayList("Rasul", "Sergio", "Borja", "David", "Joselu");
    ObservableList<String> listaProfes = FXCollections.observableArrayList("Maria Angeles", "Raquel", "Alicia", "Lorenzo");
    ObservableList<String> listaCiclos = FXCollections.observableArrayList("DAM", "DAW", "ASIR");
    
    @FXML
    private ComboBox<String> CBAlumnos;
    @FXML
    private Label labelAlumnos;
    @FXML
    private ComboBox<?> CBprofesores;
    @FXML
    private ComboBox<?> CBciclos;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CBAlumnos.setValue("Seleccione alumno...");
        CBAlumnos.setItems(listaAlumnos);
        labelAlumnos.setText(CBAlumnos.getValue());
    }
    

    @FXML
    private void seleccionarAlumnos(ActionEvent event) {              
        
        
        labelAlumnos.setText(CBAlumnos.getValue());
    }

    @FXML
    private void seleccionarProfesor(ActionEvent event) {
    }

    @FXML
    private void seleccionarCiclo(ActionEvent event) {
    }


    
}
