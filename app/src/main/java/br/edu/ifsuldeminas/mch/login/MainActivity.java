 package br.edu.ifsuldeminas.mch.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonLogin;
    private Button buttonRegister;
    private Button buttonForgotPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = findViewById(R.id.buttonLoginId);
        buttonRegister = findViewById(R.id.buttonRegisterId);
        buttonForgotPW = findViewById(R.id.buttonForgotPWId);

        // Classe interna
        buttonLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getBaseContext(), "Botão Login Clicado!", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        // Classe externa
        buttonRegister.setOnClickListener(new RegisterClickListener());

        // Lambdas com interface SAM
        buttonForgotPW.setOnClickListener((View view) -> {
            Toast.makeText(view.getContext(), R.string.button_forgot_pw_clicked, Toast.LENGTH_SHORT).show();
        });
    }
}
