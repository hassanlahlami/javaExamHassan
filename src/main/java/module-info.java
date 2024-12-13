module org.example.javaExamHassan {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.javaExamHassan.Controller to javafx.fxml;
    exports org.example.javaExamHassan;
}