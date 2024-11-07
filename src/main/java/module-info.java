module automation.auto {
    requires javafx.controls;
    requires javafx.fxml;


    opens automation.auto to javafx.fxml;
    exports automation.auto;
}