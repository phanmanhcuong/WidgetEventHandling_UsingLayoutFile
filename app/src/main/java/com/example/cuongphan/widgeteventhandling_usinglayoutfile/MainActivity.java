package com.example.cuongphan.widgeteventhandling_usinglayoutfile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnHelloMessage(View v){
        Button btn_hello = (Button)findViewById(R.id.btn_hello);
        Toast.makeText(this, btn_hello.getText().toString(), Toast.LENGTH_SHORT).show();
    }
    public void btnGoodbyeMessage(View v){
        Button btn_goodbye = (Button)findViewById(R.id.btn_goodbye);
        Toast.makeText(this, btn_goodbye.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
