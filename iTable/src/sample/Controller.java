package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class Controller {
    @FXML private  TableView<Persona> tableView;

//    @FXML private TableColumn tableColumnTelefono;
//    @FXML private TableColumn tableColumnNombre;
    @FXML private Label label;
    @FXML   ObservableList<Persona> personas = FXCollections.observableArrayList(
            new Persona("pepe","849"),
            new Persona("Antonia","849"),
            new Persona("María","849")
    );
    @FXML private TextField nombre;
    @FXML private TextField telefono;

    public  void initialize(){
        System.out.println("initialize ejecutando");
        label.setText("Agenda");
//        tableView.getItems().add(new Persona("Pepe","666904339"));
        tableView.setItems(personas);
    }

    @FXML private void addPersona(ActionEvent actionEvent){
        personas.add(new Persona(nombre.getText(),telefono.getText()));
    }

    public static class Persona{
        private String nombre;
        private String telefono;

        public Persona(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }


}
