package org.midominio;


import org.midominio.structural.flyweight.EnemyFactory;
import org.midominio.structural.flyweight.IEnemy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }

    private static void testPattern(){
        for (int i = 0; i<15; i++){
            IEnemy enemy = EnemyFactory.getEnemy(getRandomEnemyType());
            enemy.setWeapon(getRandomWeapon());
            enemy.lifePoints();
        }
    }
    private static String getRandomEnemyType(){
        Random r = new Random();
        int randInt = r.nextInt(enemyType.length);
        return enemyType[randInt];
    }

    private static String getRandomWeapon(){
        Random r = new Random();
        int randInt = r.nextInt(weapon.length);
        return weapon[randInt];
    }
    private static String[] enemyType = {"Soldier", "Detective"};
    private static String[] weapon = {"Fusil", "Revolver", "Cuchillo", "Lanza granadas", "Bazooka"};

}