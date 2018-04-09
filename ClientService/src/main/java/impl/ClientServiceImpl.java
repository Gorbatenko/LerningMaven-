package impl;

import Service.ClientService;
import dao.ClientDao;

public class ClientServiceImpl implements ClientService {

    private ClientDao dao;

    public ClientServiceImpl(){
        this.dao = new ClientDao();
    }

    public void addClient() {
        System.out.println("[Проверка существования клиента.]");
        System.out.println("[Отправка данных в базу.]");
        dao.addClient();
    }

    public void editClient() {
        System.out.println("[Проверка существования клиента.]");
        System.out.println("[Сборка изменений.]");
        System.out.println("[Отправка данных в базу.]");
        dao.editClient();
    }

    public void removeClient() {
        System.out.println("[Отправка данных в базу.]");
        dao.removeClient();
    }
}