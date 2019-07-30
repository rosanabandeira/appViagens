package android.studio.viagens.ui.activity;

import android.os.Bundle;
import android.studio.viagens.R;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.math.BigDecimal;

import model.Pacote;
import utils.MoedaUtil;

public class PagamentoActivity extends AppCompatActivity {

    public static final String TITULO_APP_BAR = "Pagamento";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);

        setTitle(TITULO_APP_BAR);

        Pacote pacoteSaoPaulo = new Pacote("São Paulo", "sao_paulo_sp", 2, new BigDecimal("249.00"));

        mostraPreco(pacoteSaoPaulo);




    }

    private void mostraPreco(Pacote pacote) {
        TextView preco = findViewById(R.id.pagamento_preco_pacote);
        String moedaBrasileira = MoedaUtil.formataMoedaParaBrasileiro(pacote.getPreco());
        preco.setText(moedaBrasileira);
    }

}
