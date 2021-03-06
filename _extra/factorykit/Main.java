package com.github.diegopacheco.design.patterns._extra.factorykit;

public class Main {
    public static void main(String[] args) {
        WeaponFactory factory = WeaponFactory.factory(builder -> {
            builder.add(WeaponType.SWORD, Sword::new);
            builder.add(WeaponType.AXE, Axe::new);
            builder.add(WeaponType.SPEAR, Spear::new);
            builder.add(WeaponType.BOW, Bow::new);
        });
        Weapon axe = factory.create(WeaponType.AXE);
        System.out.println(axe.toString());
    }
}
