module org.example.rentalps {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.rentalps to javafx.fxml;
    exports org.example.rentalps;
}