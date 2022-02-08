package com.spring.carsharing.services;

import com.spring.carsharing.models.Account;
import com.spring.carsharing.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonService personService;

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

	/*public Person personByPersonId(Integer PersonId) {
		return this.personDAO.findByPersonId(PersonId);
	}*/

    public void addPerson(Person person){
        personService.addPerson(person);
    }

    public List<Person> getAll(){
        return personService.getAll();
    }
    public Person findByIdentificationNumber(String identificationNumber){
        return personService.findByIdentificationNumber(identificationNumber);
    }

    public Person find(Integer personId){
        return personService.find(personId);
    }

    public List<Person> find(String name){
        return personService.find(name);
    }
    public Person findByName(String name){
        return personService.findByName(name);
    }
    public void deletePerson(Person person) {
        personService.deletePerson(person);

    }

    public void updatePerson(Person person, Integer accountId) {
        personService.setPersonByPersonId(person.getName(), person.getIdNumber(), person.getPhoneNumber(), person.getEmail(), person.getAddress().getCountry(), person.getAddress().getStreet(), person.getAddress().getCity(),person.getAddress().getState(), person.getAddress().getPostCode(), accountId, person.getPersonId());

    }

    private void setPersonByPersonId(String name, String idNumber, String phoneNumber, String email, String country, String street, String city, String state, String postCode, Integer accountId, Integer personId) {
    }


    public Person getLoggedInPersonByAccount(Account account) {


        Person person = personService.getLoggedInPersonByAccount(account);
        System.out.println(account);
        System.out.println("pppppppppppppp"+person);
		/*if(person==null){
			 Person user = personDAO.findByAccount(account);
			 System.out.println("uuuuuuu"+user);
			return user;
		}*/
        return person;
    }
}
