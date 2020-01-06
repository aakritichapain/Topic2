package com.aakriti.topic2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GridLayoutActivity extends AppCompatActivity {
    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDiv ,
            buttonMul , buttonClear , buttonEqual;
    EditText editO;

    int valueOne , valueTwo;
    boolean Add , Sub ,Mul ,Div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        //Binding

        button1 = findViewById(R.id.button1);
        button2 =  findViewById(R.id.button2);
        button3 =  findViewById(R.id.button3);
        button4 =  findViewById(R.id.button4);
        button5 =  findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 =  findViewById(R.id.button7);
        button8 =  findViewById(R.id.button8);
        button9 =  findViewById(R.id.button9);
        button0 =  findViewById(R.id.button0);
        buttonAdd =  findViewById(R.id.buttonAdd);
        buttonSub =  findViewById(R.id.buttonSub);
        buttonMul =  findViewById(R.id.buttonMul);
        buttonDiv =  findViewById(R.id.buttonDiv);
        buttonClear =  findViewById(R.id.buttonClear);
        buttonEqual =  findViewById(R.id.buttonEqual);
        editO =  findViewById(R.id.editO);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editO.setText(editO.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editO.setText(editO.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editO.setText(editO.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editO.setText(editO.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editO.setText(editO.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editO.setText(editO.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editO.setText(editO.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editO.setText(editO.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editO.setText(editO.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editO.setText(editO.getText()+"0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if (editO == null){
                    editO.setText(null);
                }else {
                    valueOne = Integer.parseInt(editO.getText() + "");

                    Add = true;
                    editO.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Integer.parseInt(editO.getText() + "");
                Sub = true ;
                editO.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Integer.parseInt(editO.getText() + "");
                Mul = true ;
                editO.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Integer.parseInt(editO.getText()+"");
                Div = true ;
                editO.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Integer.parseInt(editO.getText() + "");

                if (Add == true){

                    editO.setText(valueOne + valueTwo +"");
                    Add=false;
                }


                if (Sub == true){
                    editO.setText(valueOne - valueTwo+"");
                    Sub=false;
                }

                if (Mul == true){
                    editO.setText(valueOne * valueTwo+"");
                    Mul=false;
                }

                if (Div == true){


                   editO.setText(valueOne / valueTwo+"");
                    Div=false;
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editO.setText(null);
            }
        });

    }
}
