package com.atguigu.ioc01;

public class ClientService {
    private static ClientService clientService = new ClientService();

    private ClientService() {
    }

    public static ClientService createInstance() {

        return clientService;
    }
}