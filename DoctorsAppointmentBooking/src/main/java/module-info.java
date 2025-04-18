module com.example.doctorsappointmentbooking {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.doctorsappointmentbooking to javafx.fxml;
    exports com.example.doctorsappointmentbooking;
}