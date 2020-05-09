package org.nedervold.mvncipkgspike;

public class App {
    public void service(){
	System.out.println("Howdy, universe!");
    }

    public static void main(String[] args){
	new App().service();
    }
}