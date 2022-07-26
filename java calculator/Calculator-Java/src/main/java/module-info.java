module com.example.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens my.calc.lang to javafx.fxml;
    exports my.calc.lang;
    exports my.calc.lang.controller;
    opens my.calc.lang.controller to javafx.fxml;
}