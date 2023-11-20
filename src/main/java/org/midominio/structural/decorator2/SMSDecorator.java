package org.midominio.structural.decorator2;

//ConcreteDecorator
public class SMSDecorator extends NotifierDecorator{
    //recibiría en constructor un número a donde enviar sms, u obtener números de alguna BBDD
    //E iterar los números enviando msjs a ellos.
    public SMSDecorator(INotifier wrappee) {
        super(wrappee);
    }
    @Override
    public void send(String message){
        if(checkBalance()){
            super.send(message);
            System.out.println("¡Notificación SMS enviada con éxito!");
            System.out.println("Mensaje: " + message);
        }
    }
    private boolean checkBalance(){
        //lógica de verificación de saldo
        return true;
    }
}
