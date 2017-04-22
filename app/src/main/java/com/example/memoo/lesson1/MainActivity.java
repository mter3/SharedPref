package com.example.memoo.lesson1;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    String _username;
    String _password;
    TextView textView;
    benimicinkaydet benimicinkaydet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        benimicinkaydet=new benimicinkaydet(this);//class icin ilk nesne

        username= (EditText) findViewById(R.id.username);
        password= (EditText) findViewById(R.id.password);

        textView= (TextView) findViewById(R.id.tv);


    }

    public void tikla(View view) {
        if(view.getId()==R.id.save)
        {
            _username= username.getText().toString();
            _password=password.getText().toString();

            benimicinkaydet.kaydet("username",_username);
            benimicinkaydet.kaydet("password",_password);

        }
        if (view.getId()==R.id.load)
        {

            String username=benimicinkaydet.yukle("username");
            String password=benimicinkaydet.yukle("password");
            textView.setText(username+"\n"+password);


        }
    }
}

