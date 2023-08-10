package me.shin;

import me.di.ContainerService;

public class App {

    public static void main(String[] args) {

        AccountServise accountServise = ContainerService.getObject(AccountServise.class);
        accountServise.join();

    }

}
