package br.com.senaigo.exemplo1;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private EditText usuario;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.usuario = findViewById(R.id.login);
        this.senha = findViewById(R.id.senha);
    }

    public void verificarLogin(View view) {
        String pegaUsuario = usuario.getText().toString();
        String pegaSenha = senha.getText().toString();

        if (pegaSenha.trim().equals("123") && pegaUsuario.trim().equals("susu")) {
            Intent intent = new Intent(this, Principal.class);
            intent.putExtra("EXTRA", pegaUsuario);
            startActivity(intent);
        } else {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Erro!");
            alertDialog.setMessage("Ta errado o Login!");
            alertDialog.show();
        }
    }
}
