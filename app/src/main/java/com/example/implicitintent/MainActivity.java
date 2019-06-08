package com.example.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private EditText phone;
    private Button call;
    private String phoneNo;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone  = findViewById(R.id.phone);
        call = findViewById(R.id.call);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                phoneNo = phone.getText().toString().trim();

                if(phoneNo.equals("")){

                    Toast.makeText(MainActivity.this,"input please then call",Toast.LENGTH_SHORT).show();

                }else {


                    Intent intent = new Intent();

                    intent.setAction(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel: " + phoneNo));
                    startActivity(intent);
                }


            }
        });



    }
}
