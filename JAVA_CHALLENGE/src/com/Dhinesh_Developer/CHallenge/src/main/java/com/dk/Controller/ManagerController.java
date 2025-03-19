package com.dk.Controller;

import com.dk.Entity.Manager;
import com.dk.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/managers")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @PostMapping
    public Manager insertManager(@RequestBody Manager manager) {
        return managerService.createManager(manager);
    }

    @GetMapping("/{id}")
    public Optional<Manager> getById(@PathVariable int id) {
        return managerService.getManagerById(id);
    }
}
