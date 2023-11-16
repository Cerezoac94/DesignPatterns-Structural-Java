package org.midominio.structural.composite;

public class CuentaCorriente implements ICuentaComponent{
    private Double amount;
    private String name;

    public CuentaCorriente(Double amount, String name){
        this.amount = amount;
        this.name = name;
    }
    @Override
    public void showAccountName() {
        System.out.println("Cuenta corriente: " + this.name);
    }

    @Override
    public Double getAmmount() {
        return this.amount;
    }
}
