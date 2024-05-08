package com.mycompany.labtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup shapePicker =findViewById(R.id.shapePicker);
        RadioGroup colorPicker =findViewById(R.id.colorPicker);
        TextView textView= findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        findViewById(R.id.red).setActivated(true);
        findViewById(R.id.square).setActivated(true);
        button.setOnClickListener(v -> {
            int selectedShapeId = shapePicker.getCheckedRadioButtonId();
            int selectedColorId = colorPicker.getCheckedRadioButtonId();
            RadioButton selectedShape = findViewById(selectedShapeId);
            RadioButton selectedColor = findViewById(selectedColorId);
            ColorShapeFactory factory = new ColorShapeFactory();
            Shape colorShape = factory.getShape(selectedShape.getText().toString(), selectedColor.getText().toString());
            String text = "Selected a" + selectedColor.getText().toString() + " " + selectedShape.getText().toString();
            textView.setText(text);
        });



    }
}