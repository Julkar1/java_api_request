package com.jtfc.app.service;


import com.jtfc.app.entity.Person;

import java.util.List;

public interface PersonService {
    boolean savePerson(Person person);
    boolean updatePerson(Person person);
    boolean deletePerson(String nid);
    Person findPersonById(String nid);
    List<Person> getAllPersons();

/*    List<String> getNamesByAddress(String address);

    List<Object[]> getNamesAndAddressesByCarModel(String model);*/

    /*void insertInitialData();*/
}
