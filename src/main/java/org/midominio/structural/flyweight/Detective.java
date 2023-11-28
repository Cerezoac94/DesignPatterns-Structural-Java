package org.midominio.structural.flyweight;

public class Detective implements IEnemy{
    private String weapon;
    private final String LIFE;

    public Detective(){
        this.LIFE = "1000";
    }
    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void lifePoints() {
        System.out.println("La vida de un detective es: " + this.LIFE);
    }
}
