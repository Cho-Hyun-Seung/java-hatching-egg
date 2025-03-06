package com.toki.hatchsimulator.service;

import com.toki.hatchsimulator.domain.ChickenCoop;
import com.toki.hatchsimulator.domain.ChickenFamily;
import com.toki.hatchsimulator.domain.User;
import com.toki.hatchsimulator.persistence.ChickenCoopRepository;

import java.util.List;
import java.util.Scanner;

public class ChickenCoopService {
    Scanner scanner = new Scanner(System.in);
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
    public ChickenCoop createChickenCoop(ChickenCoop chickenCoop) {
        return chickenCoopRepository.createChickenCoop(chickenCoop);
    }
}
