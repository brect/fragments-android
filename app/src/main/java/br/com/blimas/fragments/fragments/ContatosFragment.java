package br.com.blimas.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.blimas.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContatosFragment extends Fragment {


    private TextView fragmentContato;

    public ContatosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewFragment = inflater.inflate(R.layout.fragment_contatos, container, false);
        fragmentContato = viewFragment.findViewById(R.id.fragment_contatos);
        fragmentContato.setText("Contatos Alterado");

        return viewFragment;
    }

}
