package org.midominio.structural.decorator2;

//Clase opcional para control o configuración de la aplicación - AppController
public class Application {
    private INotifier notifier;

    private boolean facebook, sms = false;

    public void enableDisableFacebook() {
        this.facebook = !this.facebook;
    }

    public boolean isFacebook(){
        return this.facebook;
    }

    public void enableDisableSms() {
        this.sms = !this.sms;
    }

    public boolean isSms(){
        return this.sms;
    }

    public void notifier(String email, String message) {
        notifier = new EmailNotifier(email);
        if(isFacebook()){
            notifier = new FacebookDecorator(notifier);
        }
        if (isSms()){
            notifier = new SMSDecorator(notifier);
        }
        System.out.println("Enviando notificaciones...");
        notifier.send(message);
    }
}
