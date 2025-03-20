package com.dk.Library.Controller;

import com.dk.Library.Model.Lib;
import com.dk.Library.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping
    public List<Lib> getAllBooks(){
        return homeService.getAllBooks();
    }

    @PostMapping
    public Lib addBook(@RequestBody Lib lib){
        return homeService.addBook(lib);
    }

    @DeleteMapping
    public void deleteBook(@PathVariable Long id){
        homeService.deleteBook(id);
    }
}
