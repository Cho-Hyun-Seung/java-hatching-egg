package com.toki.hatchsimulator.domain;

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

//    public void setChickenCoop(List<ChickenFamily> familyList) {
//        this.familyList = familyList;
//    }

    // TODO 부화 조건 ChickenCoop에 적어주기!!!!!
    public void changeForm() {
        Iterator<ChickenFamily> iterator = familyList.iterator();
        while (iterator.hasNext()) {
            ChickenFamily cf = iterator.next();
            System.out.println("알인 가요?" + cf.isEgg());
            if (cf.isEgg() && cf.getLived() >= HACHING_DAY) {
                System.out.println("알이 부화하였습니다!");
                iterator.remove();
                ChickenFamily chick = new Chick();
                familyList.add(chick);
            } else if (cf.isChick() && cf.getLived() >= RAISING_DAY) {
                System.out.println("병아리가 닭이 되었습니다!");
                iterator.remove();
                ChickenFamily chicken = new Chicken();
                familyList.add(chicken);
            } else if (cf.isChicken() && cf.getLived() >= DIEING_DAY) {
                System.out.println("닭이 죽었습니다..");
                iterator.remove();
            } else if (cf.isChicken() && cf.getLived() % 3 == 0) {
                System.out.println("닭이 알을 낳았습니다!");
                ChickenFamily egg = new Egg();
                familyList.add(egg);
            }
        }
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

}
