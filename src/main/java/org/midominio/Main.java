package org.midominio;


import org.midominio.structural.proxy.Internet;
import org.midominio.structural.proxy.ProxyInternet;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }

    private static void testPattern(){
        Internet internet = new ProxyInternet();
        try{
            internet.connectTo("udemy.com");
            internet.connectTo("facebook.com");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}