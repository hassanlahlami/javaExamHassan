module org.example.inscriptionpage {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.inscriptionpage.Controller to javafx.fxml;
    exports org.example.inscriptionpage;
}