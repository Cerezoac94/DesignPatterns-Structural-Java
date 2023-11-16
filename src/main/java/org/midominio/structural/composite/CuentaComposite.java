package org.midominio.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CuentaComposite implements ICuentaComponent{
    private List<ICuentaComponent> childCuentas;

    public CuentaComposite(){
        this.childCuentas = new ArrayList<>();
    }
    @Override
    public void showAccountName() {
        for(ICuentaComponent cuenta : childCuentas){
            cuenta.showAccountName();
        }
    }

    @Override
    public Double getAmmount() {
        Double totalAmount = 0.0;
        for(ICuentaComponent cuenta : childCuentas){
            totalAmount += cuenta.getAmmount();
        }
        System.out.println("La cantidad de dinero es de: " + totalAmount);
        return totalAmount;
    }

    public void addCuenta(ICuentaComponent cuenta){
        childCuentas.add(cuenta);
    }

    public void removeCuenta(ICuentaComponent cuenta){
        childCuentas.remove(cuenta);
    }
}
