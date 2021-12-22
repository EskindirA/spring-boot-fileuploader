package esk.uploader.file.fileuploader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import esk.uploader.file.fileuploader.services.StorageService;

@SpringBootApplication
public class FileuploaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileuploaderApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}

}
