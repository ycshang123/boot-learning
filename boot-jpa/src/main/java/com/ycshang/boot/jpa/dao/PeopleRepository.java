package com.ycshang.boot.jpa.dao;

import com.ycshang.boot.jpa.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ycshang
 */
public interface PeopleRepository extends JpaRepository<People, Integer> {
    @Override
    List<People> findAll();

    List<People> findByFirstName(String firstName);

    People findByFirstNameAndLastName(String firstname, String lastname);

    People findByLastNameOrFirstName(String firstname, String lastname);

    People findByFirstNameIs(String firstName);

    People findByFirstNameEquals(String firstName);

    List<People> findByAgeBetween(Integer age1, Integer age2);

    List<People> findByAgeLessThan(Integer age);

    List<People> findByAgeLessThanEqual(Integer age);

    List<People> findByAgeGreaterThan(Integer age);

    List<People> findByAgeGreaterThanEqual(Integer age);

    List<People> findByAgeAfter(Integer age);

    List<People> findByAgeBefore(Integer age);

    List<People> findByAgeIsNull();

    List<People> findByAgeNotNull();

    List<People> findByFirstNameLike(String firstName);

    List<People> findByFirstNameNotLike(String firstName);

    List<People> findByFirstNameNot(String firstName);

    List<People> findByFirstNameStartingWith(String firstName);

    List<People> findByFirstNameEndingWith(String firstName);

    List<People> findByFirstNameContaining(String firstName);

    List<People> findByAgeOrderByFirstName(Integer age);

    List<People> findByAgeNot(Integer age);

    List<People> findByAgeIn(List<Integer> age);

    List<People> findByAgeNotIn(List<Integer> age);

    //List<People> findByFirstNameIgnoreCase(String firstName);
    //
    //List<People> findByActiveTrue();
    //
    //List<People> findByActiveFalse();

}
