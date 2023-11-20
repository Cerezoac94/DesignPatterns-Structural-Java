package org.midominio.structural.decorator;

//ConcreteComponent
public class Gold implements ICredit{
    @Override
    public void showCredit() {
        //Se ejecuta este método desde la llamada del método showCredit del objeto de Tipo internationalPayment
        System.out.println("Tarjeta de crédito de 50.000");//Una vez ejecutada esta línea, regresamos al método
        //Show credit del objeto de tipo IntenrationalPayment, a ejecutar la línea que quedo pendiente.
    }
}
