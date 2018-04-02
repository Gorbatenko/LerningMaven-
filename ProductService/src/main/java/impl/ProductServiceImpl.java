package impl;

import Service.ProductService;
import dao.ProductDao;

public class ProductServiceImpl implements ProductService {

    private ProductDao dao;

    public ProductServiceImpl() {
        this.dao = new ProductDao();
    }

    public void addProduct() {
        System.out.println("[Проверка существования продукта.]\n");
        System.out.println("[Отправка данных в базу.]\n");
        dao.addProduct();
    }

    public void editProduct() {
        System.out.println("[Проверка существования продукта.]\n");
        System.out.println("[Сборка изменений.]\n");
        System.out.println("[Отправка данных в базу.]\n");
        dao.editProduct();
    }

    public void removeProduct() {
        System.out.println("[Отправка данных в базу.]\n");
        dao.removeProduct();
    }
}