import br.com.lucas.desafiocep.models.Address;
import br.com.lucas.desafiocep.models.FileGenerator;
import br.com.lucas.desafiocep.models.Request;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Request request = new Request();
        FileGenerator fileGenerator = new FileGenerator();

        System.out.print("Digite um cep: ");
        String cep = sc.next();
        sc.close();

        try {
            Address address = request.returnRequest(cep);
            System.out.println(address);
            fileGenerator.GenerateJsonFile(address);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação.");
        }

    }

}
