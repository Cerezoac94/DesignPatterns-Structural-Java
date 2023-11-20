package org.midominio.structural.decorator2;

//ConcreteComponent
public class EmailNotifier implements INotifier{
    //Correo de ejemplo, puede recibirse por param en constructor o con método set o bien desde una BBDD
    private String email;

    public EmailNotifier(String email){
        this.email = email;
    }
    @Override
    public void send(String message) {
        System.out.println("Notificación enviada al correo: " + this.email);
        System.out.println("Mensaje: " + message);
    }
}
