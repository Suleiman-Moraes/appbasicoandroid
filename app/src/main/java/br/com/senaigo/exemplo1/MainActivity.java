package br.com.senaigo.exemplo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView mensagemText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editText = findViewById(R.id.editText);
        this.mensagemText = findViewById(R.id.mensagemText);
    }

    public void exibirMensagem(View view) {
        Editable texto = this.editText.getText();
        this.mensagemText.setText(texto);
    }
}
