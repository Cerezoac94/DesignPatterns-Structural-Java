package org.midominio.structural.decorator2;

//ConcreteDecorator
public class FacebookDecorator extends NotifierDecorator{
    //Recibiría target por parametro o extraería lista de contactos desde un BBDD de
    // los destinararios para las notificaciones
    public FacebookDecorator(INotifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message){
        if (checkLogin()){
            super.send(message);
            System.out.println("¡Notificación de Facebook enviada con éxito!");
            System.out.println("Mensaje: " + message);
        }
    }

    private boolean checkLogin(){
        //Lógica de verificacion de sesion iniciada
        return true;
    }
}
