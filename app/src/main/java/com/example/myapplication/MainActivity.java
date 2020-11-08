package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=(Button)findViewById(R.id.button1);
    }

    public void click(View view) {
        CheckBox checkBox1=(CheckBox)findViewById(R.id.checkbox1);
        CheckBox checkBox2=(CheckBox)findViewById(R.id.checkbox2);
        CheckBox checkBox3=(CheckBox)findViewById(R.id.checkbox3);
        int totalamount=0;

        StringBuilder result=new StringBuilder();
        result.append("Selected Items");
        if(checkBox1.isChecked())
        {
            result.append("\n Chicken 100 Rs");
            totalamount+=100;
        }
        if(checkBox2.isChecked())
        {
            result.append("\n Mutton 100 Rs");
            totalamount+=100;
        }
        if(checkBox3.isChecked())
        {
            result.append("\n Fish 100 Rs");
            totalamount+=100;
        }
        result.append("\nTotal: "+totalamount+"Rs");
        //Displaying the message on the toast
        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();

    }
}