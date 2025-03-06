package com.toki.hatchsimulator.controller;

import com.toki.hatchsimulator.domain.ChickenCoop;
import com.toki.hatchsimulator.domain.ChickenFamily;
import com.toki.hatchsimulator.service.ChickenCoopService;

public class ChickenCoopController {
    private final ChickenCoopService chickenCoopService;

    public ChickenCoopController(ChickenCoopService chickenCoopService) {
        this.chickenCoopService = chickenCoopService;
    }

    // 닭장 생성
    public ChickenCoop createChickenCoop(){
        return chickenCoopService.createChickenCoop();
    }

    //TODO 1. 다음 날로 이동
    public void nextDay(ChickenCoop chickenCoop){
        chickenCoopService.nextDay(chickenCoop);
    }

    // TODO 5. 판매
    public void sell(ChickenFamily target){

    }

    public void sortChickenCoop(ChickenCoop chickenCoop) {
        chickenCoopService.sortChickenCoop(chickenCoop);
    }
}
