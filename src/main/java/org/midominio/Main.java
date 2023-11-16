package org.midominio;


//import org.midominio.structural.composite.CuentaAhorro;
//import org.midominio.structural.composite.CuentaComposite;
//import org.midominio.structural.composite.CuentaCorriente;
//import org.midominio.structural.composite.ICuentaComponent;

import org.midominio.structural.composite2.paqueteria.Caja;
import org.midominio.structural.composite2.paqueteria.IComponent;
import org.midominio.structural.composite2.paqueteria.Product;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }

    private static void testPattern(){
        //Composite 1
//        ICuentaComponent cuentaCoriente = new CuentaCorriente(1000.0,"Alberto");
//        ICuentaComponent cuentaAhorro = new CuentaAhorro(20000.0, "Alberto");
//
//        CuentaComposite cuentaComposite = new CuentaComposite();
//        cuentaComposite.addCuenta(cuentaCoriente);
//        cuentaComposite.addCuenta(cuentaAhorro);
//
//        cuentaComposite.showAccountName();
//        cuentaComposite.getAmmount();

        //Composite 2
        IComponent product1 = new Product("Monitor 27 inch",7000.0);
        IComponent product2 = new Product("Gabinete Corsair",3500.0);

        IComponent product3 = new Product("Mouse Logitech",1400.0);
        IComponent product4 = new Product("Teclado Logitech",800.0);
        Caja caja1 = new Caja();
        caja1.addProduct(product3);
        caja1.addProduct(product4);

        Caja cajaContenedora = new Caja(product1,product2,caja1);
        System.out.println("El precio total del paquete es: " + cajaContenedora.getPriceProduct());

    }
}