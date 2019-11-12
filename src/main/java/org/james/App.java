package org.james;

import org.james.server.MpServer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        new Thread(new MpServer(10001), "MP_SERVER").start();
        System.out.println("Hello World!");
    }
}
