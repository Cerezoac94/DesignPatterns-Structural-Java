package org.midominio.structural.composite;

public class CuentaAhorro implements ICuentaComponent{
    private Double amount;
    private String name;

    public CuentaAhorro(Double amount, String name){
        this.amount = amount;
        this.name = name;
    }
    @Override
    public void showAccountName() {
        System.out.println("Cuenta Ahorro: " + this.name);
    }

    @Override
    public Double getAmmount() {
        return this.amount;
    }
}
