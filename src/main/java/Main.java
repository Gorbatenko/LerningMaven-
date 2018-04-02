import Service.CmdLineService;
import impl.ClientServiceImpl;
import impl.MenuServiceImpl;
import impl.ProductServiceImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CmdLineService cmdLineService = new CmdLineService(new ClientServiceImpl(), new ProductServiceImpl(), new MenuServiceImpl());
        cmdLineService.goMainMenu();
    }
}