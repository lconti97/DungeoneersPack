package com.kirodinstudios.adventurerspack_ddinventorymanagementtool.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kirodinstudios.adventurerspack_ddinventorymanagementtool.R;

import androidx.fragment.app.Fragment;

public class EquipmentStackAddFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.equipment_stack_add_fragment, container, false);
    }
}