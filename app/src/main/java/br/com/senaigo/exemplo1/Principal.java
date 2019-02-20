package br.com.senaigo.exemplo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private TextView usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        this.usuario = findViewById(R.id.textUsuarioLogado);

        Bundle bundle = getIntent().getExtras();
        String recebido = bundle.getString("EXTRA");
        usuario.setText(recebido);
    }
}
