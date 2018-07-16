package com.kirodinstudios.adventurerspack_ddinventorymanagementtool.viewmodel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.annotation.NonNull;

import com.kirodinstudios.adventurerspack_ddinventorymanagementtool.BasicApp;
import com.kirodinstudios.adventurerspack_ddinventorymanagementtool.model.EquipmentStack;

import java.util.List;


public class EquipmentStackListViewModel extends AndroidViewModel {

    private final MediatorLiveData<List<EquipmentStack>> mObservableEquipmentStacks;

    public EquipmentStackListViewModel(@NonNull Application application) {
        super(application);

        mObservableEquipmentStacks = new MediatorLiveData<>();
        mObservableEquipmentStacks.setValue(null);

        LiveData<List<EquipmentStack>> equipmentStacks = ((BasicApp) application).getRepository()
                .getEquipmentStacks();

        mObservableEquipmentStacks.addSource(equipmentStacks, mObservableEquipmentStacks::setValue);
    }

    public LiveData<List<EquipmentStack>> getEquipmentStacks() {
        return mObservableEquipmentStacks;
    }
}
