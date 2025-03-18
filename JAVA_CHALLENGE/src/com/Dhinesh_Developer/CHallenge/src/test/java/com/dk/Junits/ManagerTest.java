package com.dk.Junits;

import com.dk.Entity.Manager;
import com.dk.Repository.ManagerRepository;
import com.dk.Service.ManagerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

public class ManagerTest {

    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private ManagerService managerService;

    @BeforeEach
    void setup(){
//        managerRepository = new ManagerRepository();
//        managerService = new ManagerService(null);
        managerRepository.deleteAll();
    }

    @Test
    void testCreateManagerSuccess(){
        Manager manager =  new Manager(1,"Alan","Project Manager",450000l,"CTS");
        Manager res = managerService.createManager(manager);

        assertNotNull(res);
        assertEquals("Alan",res.getName());
    }

    @Test
    void testGetManagerById(){
        Optional<Manager> res = managerService.getManagerById(2);
        assertFalse(res.isPresent());
    }
}
