package com.dk.Junits;

import com.dk.Entity.Manager;
import com.dk.Repository.ManagerRepository;
import com.dk.Service.ManagerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ManagerMock {

    @Test
    public void sampleTest(){
        assertEquals(2,1+1);
    }


    @Test
    public void testStringEquality(){
        assertEquals("Hello","Hel"+"lo");
    }

    @Test
    public void testBooleanCondition(){
        assertTrue(5 > 3);
    }

    @Mock
    private ManagerRepository managerRepository;
    
    @InjectMocks
    private ManagerService managerService;

    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindById(){
        Manager manager = new Manager(1,"Alan","HR",234534l,"ZOHO");
        when(managerRepository.findById(1)).thenReturn(Optional.of(manager));
        
        Optional<Manager> foundManager = managerService.getManagerById(1);
        assertNotNull(foundManager);
        assertEquals("Alan",foundManager.get());
    }

}
