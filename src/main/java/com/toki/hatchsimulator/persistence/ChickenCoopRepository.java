package com.toki.hatchsimulator.persistence;

import com.toki.hatchsimulator.domain.ChickenCoop;
import com.toki.hatchsimulator.domain.ChickenFamily;
import com.toki.hatchsimulator.domain.Egg;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChickenCoopRepository {

    public int sell(ChickenFamily[] chickenFamilies) {


        return 0;
    }

    public void nextDay(ChickenCoop chickenCoop) {
        chickenCoop.setDay(chickenCoop.getDay() + 1);

        chickenCoop.getChickenFamily().forEach(cf -> {
            cf.setLived(cf.getLived() + 1);
            if (cf.isChicken()) {
                cf.setPrice(Math.max(0, cf.getPrice() - 1));
            }
        });

        chickenCoop.changeForm();
    }

    public ChickenCoop createChickenCoop() {
        List<ChickenFamily> FamilyList = new ArrayList<>(Arrays.asList(new Egg(), new Egg(), new Egg()));
        ChickenCoop chickenCoop = new ChickenCoop(FamilyList);
        return chickenCoop;
    }

    public void sortChickenCoop(ChickenCoop chickenCoop) {
        chickenCoop.sortChickenCoop();
    }
}
