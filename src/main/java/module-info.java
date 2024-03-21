module com.heliumsoft.minicompose {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.heliumsoft.minicompose to javafx.fxml;
    exports com.heliumsoft.minicompose;
}