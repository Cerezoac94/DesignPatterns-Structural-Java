package org.midominio.structural.decorator;

//ConcreteDecorator
public class InternationalPaymentDecorator extends CreditDecorator{
    public InternationalPaymentDecorator(ICredit decoratedCredit) {
        super(decoratedCredit);
    }
    @Override
    public void showCredit(){
        //Se ejecuta ahora este método desde el SecureDecorator
        decoratedCredit.showCredit(); //En este ejemplo y este momento de ejecución, el decoratedCredit de este
        //Objeto de tipo InternationalPayment, tiene como valor una referencia de tipo Gold, por lo que se llama
        //Al metodo showCredit del objeto de tipo Gold, antes del salto a la siguiente línea
        configInternationalPayment(); //Este método se ejecuta después de que se ejecuto el showCredit de la línea
        //anterior
    }
    private void configInternationalPayment(){
        System.out.println("La tarjeta ha sido configurada para hacer pagos internacionales");
    }
}
