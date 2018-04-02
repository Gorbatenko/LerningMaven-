package impl;

import Service.ClientService;
import Service.ProductService;
import dao.ClientDao;

public class ClientServiceImpl implements ClientService {

    private ClientDao dao;
    private ProductService productService;

    public ClientServiceImpl(){
        this.dao = new ClientDao();
    }

    public void addClient() {
        System.out.println("[Проверка существования клиента.]\n");
        System.out.println("[Отправка данных в базу.]\n");
        dao.addClient();
    }

    public void editClient() {
        System.out.println("[Проверка существования клиента.]\n");
        System.out.println("[Сборка изменений.]\n");
        System.out.println("[Отправка данных в базу.]\n");
        dao.editClient();
    }

    public void removeClient() {
        System.out.println("[Отправка данных в базу.]\n");
        dao.removeClient();
    }
}