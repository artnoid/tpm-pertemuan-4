package com.example.praktikum;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HeroesFragment extends Fragment {

    private RecyclerView rvHero;

    public HeroesFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_heroes, container, false);
        rvHero = view.findViewById(R.id.fragmenthero_rv);
        rvHero.setHasFixedSize(true);
        rvHero.setLayoutManager(new LinearLayoutManager(view.getContext()));
        HeroesAdapter heroesAdapter = new HeroesAdapter(view.getContext());
        heroesAdapter.setHeroes(HeroesData.getHeroesList());
        return view;
    }
}
