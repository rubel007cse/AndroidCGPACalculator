package com.mrubel.mycgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText _c1, _m1;
    Button _calculate;
    TextView _output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _c1 = (EditText) findViewById(R.id.credits_one);
        _m1 = (EditText) findViewById(R.id.marks_one);
        _output = (TextView) findViewById(R.id.our_output);

        _calculate = (Button) findViewById(R.id.calculation_button);

        _calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // taking inputs
                String _credit = _c1.getText().toString();
                String _marks = _m1.getText().toString();

                // converting inputs to integer
                int i1 = Integer.parseInt(_credit);
                int i2 = Integer.parseInt(_marks);

                float c = (float)i2/(float) i1;

                // showing pop uptext on screen
                Toast.makeText(getApplicationContext(),"Output is: "+c, Toast.LENGTH_LONG).show();

                // showing on textView
                _output.setText("CGPA is: "+c);

            }
        });

    }
}
