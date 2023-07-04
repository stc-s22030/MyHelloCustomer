package com.example.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);

        Button btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(listener);

        Button btLiveclear = findViewById(R.id.btLiveClear);
        btLiveclear.setOnClickListener(listener);

    }

    private class HelloListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            EditText input = findViewById(R.id.etName);
            EditText inputl = findViewById(R.id.etLive);
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();
            if (id == R.id.btClick) {
                String inputStr = input.getText().toString();
                String inputLi = inputl.getText().toString();
                output.setText(inputLi + "にお住いの" + inputStr + "さん、こんにちは！");
            } else if (id == R.id.btClear) {
                input.setText("");
                output.setText("");
            } else if (id == R.id.btLiveClear) {
                inputl.setText("");
                output.setText("");
            }
        }
    }
}
