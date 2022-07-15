module com.example.pt02_2072029 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pt02_2072029 to javafx.fxml;
    exports com.example.pt02_2072029;
    exports com.example.pt02_2072029.Model;
}