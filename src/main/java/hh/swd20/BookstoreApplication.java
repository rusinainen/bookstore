package hh.swd20;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.swd20.domain.Book;
import hh.swd20.domain.BookRepository;
import hh.swd20.domain.Category;
import hh.swd20.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository brepository, CategoryRepository crepository) {
	return (args) -> {
		
	Book b1 = new Book("Heidi Köngäs", "9789511314035", "Sandra", 2017, 3.00);
	Book b2 = new Book("Robert Lacey", "9789511321910", "Crown - Todellinen tarina", 2017, 5.00);
	Book b3 = new Book("Riikka Pulkkinen", "9789511326090", "Lasten planeetta", 2018, 5.00);
	Book b4 = new Book("Anna-Leena Härkönen", "9789511313717","Valomerkki", 2017, 3.00);
	Book b5 = new Book("Liza Marklund", "9789511330233", "Helmifarmi", 2018, 10.0);
	
	brepository.save(b1);
	brepository.save(b2);
	brepository.save(b3);
	brepository.save(b4);
	brepository.save(b5);
	
	Category c1 = new Category("Scifi");
	Category c2 = new Category("Modern");
	Category c3 = new Category("Novel");
	Category c4 = new Category("Kids");
	Category c5 = new Category("Memoir");
	
	crepository.save(c1);
	crepository.save(c2);
	crepository.save(c3);
	crepository.save(c4);
	crepository.save(c5);
			};
		}
	}

