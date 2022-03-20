package com.ycshang.boot.jpa.dao;

import com.ycshang.boot.jpa.entity.People;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class PeopleRepositoryTest {
    @Autowired
    private PeopleRepository peopleRepository;

    @Test
    public void findByAgeIsNull() {
        List<People> peopleList = peopleRepository.findByAgeIsNull();
        assertEquals(0, peopleList.size());
    }

    @Test
    public void findByAgeNotNull() {
        List<People> peopleList = peopleRepository.findByAgeNotNull();
        assertEquals(2, peopleList.size());
    }

    @Test
    public void findByAgeBefore() {
        List<People> peopleList = peopleRepository.findByAgeBefore(21);
        assertEquals(2, peopleList.size());
    }

    @Test
    public void findByFirstNameLike() {
        List<People> peopleList = peopleRepository.findByFirstNameLike("qi");
        assertEquals(5, peopleList.size());
    }

    @Test
    public void findByFirstNameNotLike() {
        List<People> peopleList = peopleRepository.findByFirstNameNotLike("qian");
        assertEquals(2, peopleList.size());
    }

    @Test
    public void findByFirstNameNot() {
        List<People> peopleList = peopleRepository.findByFirstNameNot("qian");
        assertEquals(2, peopleList.size());
    }

    @Test
    public void findByAgeAfter() {
        List<People> peopleList = peopleRepository.findByAgeAfter(20);
        assertEquals(1, peopleList.size());
    }

    @Test
    public void findByFirstNameStartingWith() {
        List<People> peopleList = peopleRepository.findByFirstNameStartingWith("s");
        assertEquals(1, peopleList.size());
    }

    @Test
    public void findByFirstNameEndingWith() {
        List<People> peopleList = peopleRepository.findByFirstNameEndingWith("g");
        assertEquals(1, peopleList.size());
    }

    @Test
    public void findByFirstNameContaining() {
        List<People> peopleList = peopleRepository.findByFirstNameContaining("a");
        assertEquals(0, peopleList.size());
    }

    @Test
    public void findByAgeOrderByFirstName() {
        List<People> peopleList = peopleRepository.findByAgeOrderByFirstName(20);
        for (People people : peopleList) {
            System.out.println("数据结果" + people.toString());
        }
    }

    @Test
    public void findByAgeNot() {
        List<People> peopleList = peopleRepository.findByAgeNot(20);
        assertEquals(2, peopleList.size());
    }

    @Test
    public void findByAgeIn() {
        List<People> peopleList = peopleRepository.findByAgeIn(Arrays.asList(21, 34));
        assertEquals(2, peopleList.size());
    }



    @Test
    public void findByAgeGreaterThanEqual() {
        List<People> peopleList = peopleRepository.findByAgeGreaterThanEqual(20);
        assertEquals(2, peopleList.size());
    }

    @Test
    public void findByAgeGreaterThan() {
        List<People> peopleList = peopleRepository.findByAgeGreaterThan(20);
        assertEquals(1, peopleList.size());
    }

    @Test
    public void findAll() {
        List<People> peopleList = peopleRepository.findAll();
        assertEquals(2, peopleList.size());
    }

    @Test
    public void findByFirstName() {
        List<People> peopleList = peopleRepository.findByFirstName("shang");
        assertEquals(1, peopleList.size());
    }

    @Test
    public void findByFirstNameAndLastName() {
        People people = peopleRepository.findByFirstNameAndLastName("shang", "yuchi");
        assertEquals(people.getLastName(), "yuchi");
    }

    @Test
    public void findByFirstNameOrLastName() {
        People people = peopleRepository.findByLastNameOrFirstName("yuchi", "han");
        assertEquals(people.getLastName(), "yuchi");
    }

    @Test
    public void findByFirstNameIs() {
        People people = peopleRepository.findByFirstNameIs("shang");
        System.out.println(people.toString());
    }

    @Test
    public void findByFirstNameEquals() {
        People people = peopleRepository.findByFirstNameEquals("shang");
        System.out.println(people.toString());
    }

    @Test
    public void findByAgeBetween() {
        List<People> peopleList = peopleRepository.findByAgeBetween(21, 34);
        assertEquals(2, peopleList.size());
    }


    @Test
    public void findByAgeLessThan() {
        List<People> peopleList = peopleRepository.findByAgeLessThan(21);
        assertEquals(1, peopleList.size());
    }

    @Test
    public void findByAgeLessThanEqual() {
        List<People> peopleList = peopleRepository.findByAgeLessThanEqual(21);
        assertEquals(2, peopleList.size());
    }
}