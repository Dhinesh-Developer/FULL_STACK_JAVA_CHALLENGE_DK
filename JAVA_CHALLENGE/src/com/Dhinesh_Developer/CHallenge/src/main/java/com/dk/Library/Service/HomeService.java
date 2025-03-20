package com.dk.Library.Service;

import com.dk.Library.Model.Lib;
import com.dk.Library.Repo.HomeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    private HomeRepo homeRepo;

    public List<Lib> getAllBooks() {
        return homeRepo.findAll();
    }

    public Lib addBook(Lib lib) {
        return homeRepo.save(lib);
    }

    public void deleteBook(Long id) {
        homeRepo.deleteById(id);
    }
}
