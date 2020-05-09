package org.nedervold.mvncipkgspike;

public class App {
  public void service() {
    System.out.println("Howdy, universe, from" + System.getProperty("os.name") + "!");
  }

  public static void main(String[] args) {
    new App().service();
  }
}
