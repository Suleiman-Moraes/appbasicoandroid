package br.com.senaigo.exemplo1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class layout extends AppCompatActivity {

    private String pegaVisor;
    private TextView visor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        visor = findViewById(R.id.textVisor);
    }

    private void inserirNumero(String numero){
        pegaVisor = visor.getText().toString();
        this.visor.setText(pegaVisor + numero);
    }

    public void funcao9(View view) {
        inserirNumero("9");
    }

    public void funcao8(View view) {
        inserirNumero("8");
    }

    public void funcao7(View view) {
        inserirNumero("7");
    }

    public void funcao6(View view) {
        inserirNumero("6");
    }

    public void funcao5(View view) {
        inserirNumero("5");
    }

    public void funcao4(View view) {
        inserirNumero("4");
    }

    public void funcao3(View view) {
        inserirNumero("3");
    }

    public void funcao2(View view) {
        inserirNumero("2");
    }

    public void funcao1(View view) {
        inserirNumero("1");
    }

    public void funcao0(View view) {
        inserirNumero("0");
    }

    public void funcaoAdicao(View view) {
        inserirNumero("+");
    }

    public void funcaoSubtracao(View view) {
        inserirNumero("-");
    }

    public void funcaoDivisao(View view) {
        inserirNumero("/");
    }

    public void funcaoMultiplicacao(View view) {
        inserirNumero("*");
    }

    public void funcaoIgual(View view) {
        try {
            pegaVisor = visor.getText().toString();
            Expression e = new ExpressionBuilder(pegaVisor).build();
            double result = e.evaluate();
            String exibeResult = String.valueOf(result);
            this.visor.setText(exibeResult);
        }catch (Exception e){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Erro!");
            alertDialog.setMessage("Vamo parar de bugar meu app ae fera!");
            alertDialog.show();
        }
    }

    public void funcaoCE(View view) {
        this.visor.setText("");
    }
}
