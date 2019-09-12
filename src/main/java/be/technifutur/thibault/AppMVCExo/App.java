package be.technifutur.thibault.AppMVCExo;

import be.technifutur.applicationMVC.MVCFramework;

public class App {
    public static void main( String[] args ) {
    	Factory myFactory = new Factory();
    	MVCFramework framework = new MVCFramework();
    	framework.start(myFactory);
    }
}
