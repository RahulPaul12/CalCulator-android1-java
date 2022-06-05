package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String oldtext="";
    String operator ="+";
    boolean newtext = true;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
        if(newtext){
            editText.setText("");
            newtext=false;
        }
       String number = editText.getText().toString();
       switch (view.getId()){
           case R.id.buttonOne:
               number+="1";
               break;
           case R.id.buttonTwo:
               number+="2";
               break;
           case R.id.buttonThree:
               number+="3";
               break;
           case R.id.buttonFour:
               number+="4";
               break;
           case R.id.buttonFive:
               number+="5";
               break;
           case R.id.buttonSix:
               number+="6";
               break;
           case R.id.buttonSeven:
               number+="7";
               break;
           case R.id.buttonEight:
               number+="8";
               break;
           case R.id.buttonNine:
               number+="9";
               break;
           case R.id.buttonZero:
               number+="0";
               break;


       }
       editText.setText(number);
    }

    public void operatorEvent(View view) {
        newtext=true;
        oldtext=editText.getText().toString();
        switch (view.getId()){
            case R.id.buttonDiv:
                operator="/";
                break;
            case R.id.buttonMulti:
                operator="x";
                break;
            case R.id.buttonMinus:
                operator="-";
                break;
            case R.id.buttonPlus:
                operator="+";
                break;
        }

        editText.setText(oldtext+operator);
    }

    public void equalEvent(View view) {
        int result=0;
        double dores=0.0;
        String newNumber = editText.getText().toString();
        switch(operator){
            case "+":
                result =Integer.parseInt(oldtext)+Integer.parseInt(newNumber);
                editText.setText(result+"");
                break;

            case "-":
                result =Integer.parseInt(oldtext)-Integer.parseInt(newNumber);
                editText.setText(result+"");
                break;
            case "x":
                result =Integer.parseInt(oldtext)*Integer.parseInt(newNumber);
                editText.setText(result+"");
                break;
            case "/":
               dores =Double.parseDouble(oldtext)/Double.parseDouble(newNumber);
                editText.setText(dores+"");
                break;
        }

    }

    public void acEvent(View view) {
        editText.setText("0");
        newtext=true;
    }
}