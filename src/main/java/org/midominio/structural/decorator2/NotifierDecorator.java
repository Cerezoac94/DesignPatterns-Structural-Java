package org.midominio.structural.decorator2;

//BaseDecorator
public class NotifierDecorator implements INotifier {
    private INotifier wrappee;

    public NotifierDecorator(INotifier wrappee){
        this.wrappee = wrappee;
    }
    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}
