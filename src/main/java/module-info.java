module me.loule.celsiustofahrenheit {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens me.loule.celsiustofahrenheit to javafx.fxml;
    exports me.loule.celsiustofahrenheit;
    opens me.loule.celsiustofahrenheit.controller to javafx.fxml;
    exports me.loule.celsiustofahrenheit.controller;
}