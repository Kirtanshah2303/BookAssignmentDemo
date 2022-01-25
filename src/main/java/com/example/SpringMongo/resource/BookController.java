package com.example.SpringMongo.resource;

import com.example.SpringMongo.model.Book;
import com.example.SpringMongo.repository.BookRepository;
import com.example.SpringMongo.repository.CourseRepo;
import com.example.SpringMongo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    BookService bookService;

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostMapping("/addBook/{courseName}")
    public String saveBook(@RequestBody Book book,@PathVariable("courseName") String name){
        book.setCourse(courseRepo.findByCourseName(name));
        return bookService.createBook(book);
//        return  "Added Book with id : " + book.getId();
    }

    @GetMapping("/showAllBook")
    public List<Book> allBook(){
       return bookRepository.findAll();
    }

    @GetMapping("/findBook/{name}")
    public List<Book> getBook(@PathVariable("name")String name){
//       return bookRepository.findById(id);
        return bookService.getBookByCourse(courseRepo.findByCourseName(name));
    }

    @GetMapping("/getCountofBook/{name}")
    public Integer getCount(@PathVariable("name") String name){
        return bookService.getCountofAssignment(courseRepo.findByCourseName(name));
    }

    @PostMapping("/setComplete/{courseName}/{BookName}")
    public String setComplete(@PathVariable("courseName") String course, @PathVariable("BookName")String book){
        return bookService.setComplete(bookRepository.findByName(book),courseRepo.findByCourseName(course));
    }

//    @GetMapping("/findByBookName/{name}")
//    public List<Book> getBookByName(@PathVariable String name){
//        System.out.println("Demo Demo..--> "+name);
//        Query query = new Query();
//        query.addCriteria(Criteria.where("demo").is("demo").and("data.Subject").is(name));
////        query.fields().include("data.$");
////        Book a1 = mongoTemplate.findOne(query, Book.class);
//        List<Book> b1 = mongoTemplate.find(query,Book.class);
//        System.out.println("HAHAHAHAHAH");
//        System.out.println(b1);
//        return  b1;
//    }

//    @GetMapping("/findBookByCourseName/{name}")
//    public List<Book> getBooks(@PathVariable String name){
//        return bookRepository.findBookByCourseName(name);
//    }

}
