package com.jtfc.app.service;

import com.jtfc.app.entity.*;
import com.jtfc.app.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public boolean savePerson(Person person) {
        personRepository.save(person);
        return true;
    }

    @Override
    public boolean updatePerson(Person person) {
        personRepository.save(person);
        return true;
    }

    @Override
    public boolean deletePerson(String nid) {
        personRepository.deleteById(nid);
        return true;
    }

    @Override
    public Person findPersonById(String nid) {
        Optional<Person> person = personRepository.findById(nid);
        return person.orElse(null);
    }

    @Override
    public List<Person> getAllPersons() {
        return (List<Person>) personRepository.findAll();
    }



  /*  @Override
    public List<String> getNamesByAddress(String address) {
        return personRepository.findNamesByAddress();
    }

    @Override
    public List<Object[]> getNamesAndAddressesByCarModel(String model) {
        return personRepository.findNameAndAddressByCarModel();
    }*/


 /*   @Autowired
    private OwnsRepository ownsRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private LogRepository logRepository;

    @Autowired
    private AccidentRepository accidentRepository;*/

/*
    @Override
    public void insertInitialData() {
        // Insert data into jn_person table
        personRepository.save(new Person("123451", "Arif", "Rajshahi"));
        personRepository.save(new Person("123452", "Sumon", "Maynamati"));
        personRepository.save(new Person("123453", "Sagor", "Sirajgang"));
        personRepository.save(new Person("123454", "Abdul", "Rajshahi"));
        personRepository.save(new Person("123455", "Himesh", "Dhaka"));
        personRepository.save(new Person("123456", "Amirul", "Sylhet"));
        personRepository.save(new Person("123457", "Sajib", "Chittagong"));

        // Insert data into jn_owns table
        ownsRepository.save(new Owns("123451", "11-3000"));
        ownsRepository.save(new Owns("123452", "12-4000"));
        ownsRepository.save(new Owns("123453", "12-5000"));
        ownsRepository.save(new Owns("123454", "11-5000"));
        ownsRepository.save(new Owns("123455", "11-6000"));
        ownsRepository.save(new Owns("123456", "12-6000"));
        ownsRepository.save(new Owns("123457", "12-3000"));

        // Insert data into jn_car table
        carRepository.save(new Car("12-3000", 2012, "Axio"));
        carRepository.save(new Car("11-3000", 2008, "Corolla"));
        carRepository.save(new Car("12-4000", 2013, "Axio"));
        carRepository.save(new Car("12-5000", 2013, "Premio"));
        carRepository.save(new Car("11-5000", 2010, "Nano"));
        carRepository.save(new Car("11-6000", 2011, "Alto"));
        carRepository.save(new Car("12-6000", 2015, "Nano Twist"));

        // Insert data into jn_log table
        logRepository.save(new Log("11-3000", LocalDate.of(2013, 1, 12), "Arif"));
        logRepository.save(new Log("12-4000", LocalDate.of(2015, 9, 25), "Komol"));
        logRepository.save(new Log("11-6000", LocalDate.of(2014, 6, 20), "Bahadur"));
        logRepository.save(new Log("11-5000", LocalDate.of(2011, 12, 20), "Abdul"));
        logRepository.save(new Log("12-6000", LocalDate.of(2015, 9, 19), "Akter"));

        // Insert data into jn_accident table
        accidentRepository.save(new Accident(LocalDate.of(2013, 1, 12), "Arif", 10000));
        accidentRepository.save(new Accident(LocalDate.of(2015, 9, 25), "Komol", 12000));
        accidentRepository.save(new Accident(LocalDate.of(2014, 6, 20), "Bahadur", 11000));
        accidentRepository.save(new Accident(LocalDate.of(2011, 12, 20), "Abdul", 8000));
        accidentRepository.save(new Accident(LocalDate.of(2015, 9, 19), "Akter", 70000));
    }
*/

}