package com.toki.hatchsimulator.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChickenCoop {
    private List<ChickenFamily> familyList;// 유저 PK
    private int day = 1;
    private final static int HACHING_DAY = 3;
    private final static int RAISING_DAY = 3;
    private final static int DIEING_DAY = 15;

    public ChickenCoop(List<ChickenFamily> familyList) {
        this.familyList = familyList;
    }

    public List<ChickenFamily> getChickenFamily() {
        return familyList;
    }

    public void sortChickenCoop() {
        familyList.sort((a, b) -> {
            if (a.getName().compareTo(b.getName()) == 0) {
                return b.getLived() - a.getLived();
            }
            return a.getName().compareTo(b.getName());
        });
    }

    public void changeForm() {
        List<ChickenFamily> newFamilyList = new ArrayList<>();
        int hatchCount = 0;
        int raiseCount = 0;
        int dieCount = 0;
        int layCount = 0;
        Iterator<ChickenFamily> iterator = familyList.iterator();
        while (iterator.hasNext()) {
            ChickenFamily cf = iterator.next();
            if (cf.isEgg() && cf.getLived() >= HACHING_DAY) {
                hatchCount++;
                iterator.remove();
                newFamilyList.add(new Chick());
            } else if (cf.isChick() && cf.getLived() >= RAISING_DAY) {
                raiseCount++;
                iterator.remove();
                newFamilyList.add(new Chicken());
            } else if (cf.isChicken()) {
                if (cf.getLived() >= DIEING_DAY) {
                    dieCount++;
                    iterator.remove();
                } else if (cf.getLived() % 3 == 0) {
                    layCount++;
                    newFamilyList.add(new Egg());
                }
            }
        }
        familyList.addAll(newFamilyList);
        if(hatchCount > 0 ) System.out.println(hatchCount + "개의 알이 부화하였습니다!");
        if(raiseCount > 0 ) System.out.println(raiseCount + "마리의 병아리가 닭이 되었습니다!");
        if(dieCount > 0 ) System.out.println(dieCount + "마리의 닭이 죽었습니다..");
        if(layCount > 0 ) System.out.println("닭이 " + layCount + "개의 알을 낳았습니다!");
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

}
