package Service;

import impl.ClientServiceImpl;
import impl.MenuServiceImpl;
import impl.ProductServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdLineService {

    private MenuService menuService;
    private ClientService clientService;
    private ProductService productService;
    private BufferedReader reader;

    private boolean isWork = true;

    public CmdLineService(ClientServiceImpl clientService, ProductServiceImpl productService, MenuServiceImpl menuService) {
        this.menuService = menuService;
        this.clientService = clientService;
        this.productService = productService;
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void goMainMenu() throws IOException {
        do {
            menuService.showMainMenu();
            String s = reader.readLine();
            switch (s) {
                case "1":
                    goClientMenu();
                    break;
                case "2":
                    goProductMenu();
                    break;
                case "0":
                    isWork = false;
                    break;
                default:
                    System.out.println("Неправильный ввод. \nПожалуйста, выберите один из пунктов меню.\n");
                    break;
            }
        } while (isWork);
    }

    private void goClientMenu() throws IOException {
        do {
            menuService.showClientMenu();
            String s = reader.readLine();
            switch (s) {
                case "1":
                    clientService.addClient();
                    break;
                case "2":
                    clientService.editClient();
                    break;
                case "3":
                    clientService.removeClient();
                    break;
                case "9":
                    goMainMenu();
                    break;
                case "0":
                    isWork = false;
                    break;
                default:
                    System.out.println("Неправильный ввод. \nПожалуйста, выберите один из пунктов меню.\n");
                    break;
            }
        } while (isWork);
    }

    private void goProductMenu() throws IOException {
        do {
            menuService.showProductMenu();
            String s = reader.readLine();
            switch (s) {
                case "1":
                    productService.addProduct();
                    break;
                case "2":
                    productService.editProduct();
                    break;
                case "3":
                    productService.removeProduct();
                    break;
                case "9":
                    goMainMenu();
                    break;
                case "0":
                    isWork = false;
                    break;
                default:
                    System.out.println("Неправильный ввод. \nПожалуйста, выберите один из пунктов меню.\n");
                    break;
            }
        } while (isWork);
    }
}