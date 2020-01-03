package br.com.blimas.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.blimas.fragments.R;
import br.com.blimas.fragments.fragments.ContatosFragment;
import br.com.blimas.fragments.fragments.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnConversa, btnContato;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConversa = findViewById(R.id.button_conversas);
        btnContato = findViewById(R.id.button_contatos);

        //remove sombra da actionbar
        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();

        //configura objeto para receber o fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_conteudo, conversasFragment);
        transaction.commit();

        btnContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contatoFragment = new ContatosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_conteudo, contatoFragment);
                transaction.commit();

            }
        });

        btnConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                conversasFragment = new ConversasFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_conteudo, conversasFragment);
                transaction.commit();

            }
        });

    }
}
