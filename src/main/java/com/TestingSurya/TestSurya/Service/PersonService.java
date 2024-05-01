package com.TestingSurya.TestSurya.Service;

import com.TestingSurya.TestSurya.Entity.Address;
import com.TestingSurya.TestSurya.Entity.Person;
import com.TestingSurya.TestSurya.Repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private  PersonRepo personRepository;

    public Optional<Person> getPersonById(int id) {
        return personRepository.findById(id);
    }
    public Person updatePerson(int id, Person updatedPerson) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        if (optionalPerson.isPresent()) {
            Person existingPerson = optionalPerson.get();
            existingPerson.setName(updatedPerson.getName());
            existingPerson.setCity(updatedPerson.getCity());
            existingPerson.setMobile(updatedPerson.getMobile());
            existingPerson.setAddress(updatedPerson.getAddress());
            return personRepository.save(existingPerson);
        }
        return null; // Or throw an exception if person with the given ID is not found
    }

    public void deletePersonById(int id) {
        personRepository.deleteById(id);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }
}
