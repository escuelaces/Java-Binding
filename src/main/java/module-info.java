module com.salva.hello {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens com.salva.hello to javafx.fxml;
    exports com.salva.hello;
}