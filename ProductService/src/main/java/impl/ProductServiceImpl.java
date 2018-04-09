package impl;

import Service.ProductService;
import dao.ProductDao;

public class ProductServiceImpl implements ProductService {

    private ProductDao dao;

    public ProductServiceImpl() {
        this.dao = new ProductDao();
    }

    public void addProduct() {
        System.out.println("[Проверка существования продукта.]");
        System.out.println("[Отправка данных в базу.]");
        dao.addProduct();
    }

    public void editProduct() {
        System.out.println("[Проверка существования продукта.]");
        System.out.println("[Сборка изменений.]");
        System.out.println("[Отправка данных в базу.]");
        dao.editProduct();
    }

    public void removeProduct() {
        System.out.println("[Отправка данных в базу.]");
        dao.removeProduct();
    }
}