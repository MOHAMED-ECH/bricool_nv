package ma.ac.emi.bricool;

import ma.ac.emi.bricool.entities.Client;
import ma.ac.emi.bricool.repositories.ClientRepository;
import ma.ac.emi.bricool.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BricoolApplication  implements CommandLineRunner {


   @Autowired
    ClientRepository clientRepository;

   @Autowired
    SellerRepository sellerRepository;

    public static void main(String[] args) {
        SpringApplication.run(BricoolApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        clientRepository.save(new Client("ahmed",
                "echarfaouy", "mohamed@gmail.com",
                "98364962936",
                "mohamed"));

    }
}