package fun.johntaylor.sven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SvenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvenApplication.class, args);
	}

}
