package hh.swd20;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.swd20.domain.Book;
import hh.swd20.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {
	return (args) -> {
	Book b1 = new Book("Heidi Köngäs", "9789511314035", "Sandra", 2017, 3.00);
	Book b2 = new Book("Robert Lacey", "9789511321910", "Crown - Todellinen tarina", 2017, 5.00);
	Book b3 = new Book("Riikka Pulkkinen", "9789511326090", "Lasten planeetta", 2018, 5.00);
	Book b4 = new Book("Anna-Leena Härkönen", "9789511313717","Valomerkki", 2017, 3.00);
	Book b5 = new Book("Liza Marklund", "9789511330233", "Helmifarmi", 2018, 10.0);
	
	repository.save(b1);
	repository.save(b2);
	repository.save(b3);
	repository.save(b4);
	repository.save(b5);
		};
	}
}
