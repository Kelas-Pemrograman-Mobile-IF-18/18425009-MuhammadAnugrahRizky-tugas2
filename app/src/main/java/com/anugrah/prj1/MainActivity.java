package com.anugrah.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtnpmdannama;
    EditText edtnpm, edtnama,edtjk,edtnt;
    Button btnsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnpmdannama = (TextView) findViewById(R.id.txtnpmdannama);
        edtnpm =  (EditText) findViewById(R.id.edtnpm);
        edtnama = (EditText) findViewById(R.id.edtnama);
        edtjk = (EditText) findViewById(R.id.edtjk);
        edtnt = (EditText) findViewById(R.id.edtnt);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnpm = edtnpm.getText().toString();
                String strnama = edtnama.getText().toString();
                String strjk = edtjk.getText().toString();
                String strnt = edtnt.getText().toString();

                txtnpmdannama.setText(strnpm +"\n"+ strnama+"\n"+strjk+"\n"+strnt);

            }
        });
    }
}