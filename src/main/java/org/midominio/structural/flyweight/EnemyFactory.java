package org.midominio.structural.flyweight;

import java.util.HashMap;

public class EnemyFactory {
    private static HashMap<String, IEnemy> enemies = new HashMap<>();
    public static IEnemy getEnemy(String type){
        IEnemy enemy = null;
        if(enemies.containsKey(type)){
            enemy = enemies.get(type);
        }else {
            switch (type){
                case "Soldier":
                    System.out.println("Soldado ha sido creado");
                    enemy = new Soldier();
                    break;
                case "Detective":
                    System.out.println("Detective ha sido creado");
                    enemy = new Detective();
                    break;
                default:
                    System.out.println("No se ha creado ningún enemigo");
            }
//            if(enemy != null){
//                enemies.put(type, enemy);
//            }
            enemies.put(type, enemy);
        }
            return enemy;
    }
}
