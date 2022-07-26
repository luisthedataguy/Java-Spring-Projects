package my.calc.lang.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class CalculatorController {

    @FXML
    private Label numAns;

    @FXML
    private Label numResult;
    @FXML
    private Label opAns;

    public void insertNum(String number) {
        opAns.setText("");
        numAns.setText(numAns.getText() + number);
        numResult.setText(numResult.getText() + number);
    }

    public void insertOp(String operator) {
        numAns.setText("");
        opAns.setText(operator);
        numResult.setText(numResult.getText() + operator);
    }
    public void insertClear(){
        opAns.setText("");
        numAns.setText("");
        numResult.setText("");
    }

        public Label getNumResult(){

        return numResult;
    }

    public void setNumAns(String evaluation){
        this.numAns.setText(evaluation);
    }

    public void onClick(MouseEvent mouseEvent) {
        Button button = (Button) mouseEvent.getSource();
        String buttonText = button.getText();

        switch (buttonText) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":

                insertNum(buttonText);
                break;
            case "+":
            case "-":
            case "/":
            case "X":
                insertOp(buttonText);
                break;
            case "CE":
                insertClear();
            case "=":
                int result = EvaluateString.evaluate(this.getNumResult().getText());
                setNumAns(String.valueOf(result));
                break;


        }



    }



    }

