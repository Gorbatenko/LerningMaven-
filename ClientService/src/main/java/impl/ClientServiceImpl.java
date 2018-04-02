package impl;

import Service.ClientService;

public class ClientServiceImpl implements ClientService {

    public void addClient() {
        System.out.println("Клиент успешно добавлен!\n");
    }

    public void showClientsList() {
        System.out.println("Список всех клиентов\n");
    }

    public void editClient() {
        System.out.println("Клиент отредактирован.\n");
    }

    public void removeClient() {
        System.out.println("Клиент удалён.\n");
    }
}