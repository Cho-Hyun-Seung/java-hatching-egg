package com.toki.hatchsimulator.persistence;

import com.toki.hatchsimulator.domain.Chick;
import com.toki.hatchsimulator.domain.ChickenCoop;
import com.toki.hatchsimulator.domain.ChickenFamily;
import com.toki.hatchsimulator.domain.Egg;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChickenCoopRepository {

    public int sell(ChickenFamily[] chickenFamilies) {
        return 0;
    }

    public void nextDay(ChickenCoop chickenCoop) {
        // 1. 날짜 증가 시키기
        chickenCoop.setDay(chickenCoop.getDay() + 1);
        List<ChickenFamily> chickenFamilyList = chickenCoop.getChickenFamily();
        // 2. 배열 내 요소들 돌면서 증가 시키기
        for(ChickenFamily cf: chickenFamilyList){
            cf.setLived(cf.getLived() + 1);
        }
        chickenCoop.changeForm();
    }

    public ChickenCoop createChickenCoop(ChickenCoop chickenCoop) {
        List<ChickenFamily> FamilyList = new ArrayList<>(Arrays.asList(new Egg(), new Egg(), new Egg()));
        chickenCoop = new ChickenCoop(FamilyList);
        return chickenCoop;
    }
}
