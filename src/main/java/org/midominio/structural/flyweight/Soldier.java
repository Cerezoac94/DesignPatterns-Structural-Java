package org.midominio.structural.flyweight;

public class Soldier implements IEnemy{
   private String weapon;
   private final String LIFE;

   public Soldier(){
       this.LIFE = "200";
   }
    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void lifePoints() {
        System.out.println("La vida de un soldado son: " + this.LIFE);
    }
}
