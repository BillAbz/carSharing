package com.spring.carsharing.repositories;

import com.spring.carsharing.models.Account;
import com.spring.carsharing.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    List<Person> findAll();

    public abstract List<Person> findByNameIgnoringCase(String name);

    public abstract Person findByIdNumber(String idNumber);
    public abstract Person findByName(String name);
    public abstract Person findByAccount(Account account);
    public abstract Person getLoggedInPersonByAccount(Account account);

    @Modifying
    @Query("update Person p set p.name = ?1, p.idNumber = ?2, p.phoneNumber =?3, p.email = ?4, p.address.country = ?5, p.address.street = ?6, p.address.city = ?7, p.address.state = ?8, p.address.postCode = ?9 ,p.account.accountId =?10  where personId =?11")
    public abstract void setPersonByPersonId(String name, String idNumber, String phoneNumber, String email, String country, String street, String city, String state, String zip, Integer accountId, Integer personId);



    Person getLoggedInPersonByName(String name);
}
