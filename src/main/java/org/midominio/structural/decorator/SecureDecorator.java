package org.midominio.structural.decorator;

//ConcreteDecorator
public class SecureDecorator extends CreditDecorator{

    public SecureDecorator(ICredit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit(){
        decoratedCredit.showCredit(); //En este ejemplo entra la primera vez aquí, y el decoratedCredit
        //tiene en este momento de ejecución, una referencia de objeto de tipo InternationalPayment, por lo
        //tanto, se llama al metodo show credit del objeto InternationalPayment, antes de saltar a la sig linea
        configSecure();//Este método quedaría como el último en ejecutarse, se ejecutaría una vez ejecutados
        //Los demás métodos llamados encadenados.
    }

    public void configSecure(){
        System.out.println("La tarjeta ha sido configurada con seguridad máxima");
    }
}
