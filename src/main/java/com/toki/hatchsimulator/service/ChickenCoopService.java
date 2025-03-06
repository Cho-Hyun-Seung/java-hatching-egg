package com.toki.hatchsimulator.service;

import com.toki.hatchsimulator.domain.ChickenCoop;
import com.toki.hatchsimulator.domain.ChickenFamily;
import com.toki.hatchsimulator.persistence.ChickenCoopRepository;

public class ChickenCoopService {
    private final ChickenCoopRepository chickenCoopRepository;

    public ChickenCoopService(ChickenCoopRepository chickenCoopRepository) {
        this.chickenCoopRepository = chickenCoopRepository;
    }

    public void nextDay(ChickenCoop chickenCoop) {
        chickenCoopRepository.nextDay(chickenCoop);
    }


    // TODO 5. 판매
    public int sell(ChickenFamily[] chickenFamilies){
        return chickenCoopRepository.sell(chickenFamilies);
    }

    // 닭장 생성
    public ChickenCoop createChickenCoop() {
        return chickenCoopRepository.createChickenCoop();
    }

    public void sortChickenCoop(ChickenCoop chickenCoop) {
        chickenCoopRepository.sortChickenCoop(chickenCoop);
    }
}
