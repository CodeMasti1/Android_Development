package com.example.multiplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, title;
    EditText num;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);
        button = findViewById(R.id.button);
        num = findViewById(R.id.num);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
        t9 = findViewById(R.id.t9);
        t10 = findViewById(R.id.t10);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = num.getText().toString();
                if (input.isEmpty()) {
                    // If the input is empty, show an error message
                    num.setError("Please enter a number.");
                } else {
                    int number = Integer.parseInt(input);
                    displayMultiplicationTable(number);
                }
            }
        });
    }

    private void displayMultiplicationTable(int number) {
        t1.setText(number + " x 1 = " + (number * 1));
        t2.setText(number + " x 2 = " + (number * 2));
        t3.setText(number + " x 3 = " + (number * 3));
        t4.setText(number + " x 4 = " + (number * 4));
        t5.setText(number + " x 5 = " + (number * 5));
        t6.setText(number + " x 6 = " + (number * 6));
        t7.setText(number + " x 7 = " + (number * 7));
        t8.setText(number + " x 8 = " + (number * 8));
        t9.setText(number + " x 9 = " + (number * 9));
        t10.setText(number + " x 10 = " + (number * 10));
    }
}
