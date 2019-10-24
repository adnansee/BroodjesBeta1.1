package com.example.broodjesbeta;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class BroodjesbetaApplicationTests {

    @Autowired
    private Brepository brepository;

    @Test
    void contextLoads() {
        Broodjes b = new Broodjes("cheese");
        brepository.save(b);


        List<Broodjes> sands = brepository.findAll();


        assertEquals(1, sands.size());
        assertEquals("cheese", sands.get(0).getName());

    }

}
