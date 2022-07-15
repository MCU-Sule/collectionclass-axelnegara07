package com.example.pt02_2072029;

import com.example.pt02_2072029.Model.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    @FXML
    private TableView<Student> table1;
    @FXML
    private TableColumn<Integer, Student> colNrp;
    @FXML
    private TableColumn<String, Student> colNama;
    @FXML
    private TextField txtNrp;
    @FXML
    private TextField txtNama;
    @FXML
    private TextField txtNrp2;

    public ObservableList<Student> sList;

    public void initialize() {
        sList = FXCollections.observableArrayList(
                new Student(2072029, "Axel"),
                new Student(3200193, "Madara"),
                new Student(5290488, "Anya"),
                new Student(8060090, "Kagura"),
                new Student(3467007, "Son"),
                new Student(9404077, "Hades"),
                new Student(5603033, "Pikachu"),
                new Student(1021083, "Patrick")
        );
        table1.setItems(sList);
        colNrp.setCellValueFactory(new PropertyValueFactory<>("nrp"));
        colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
    }

    @FXML
    public void OnAdd() {
        int nrp = Integer.parseInt(txtNrp.getText());
        String sName = txtNama.getText();
        sList.add(new Student(nrp, sName));
        txtNrp.clear();
        txtNama.clear();
    }

    @FXML
    protected void OnDel() {
        int nrp = Integer.parseInt(txtNrp2.getText());
        for (Student student: sList) {
            if (nrp == student.getNrp()) {
                sList.remove(student);
                break;
            }
        }
        txtNrp2.clear();
    }
}