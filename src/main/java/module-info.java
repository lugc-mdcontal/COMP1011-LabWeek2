module com.java.comp1011labweek2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.java.comp1011labweek2 to javafx.fxml;
    exports com.java.comp1011labweek2;
}