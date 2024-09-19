package com.jtfc.app.controller;


import com.jtfc.app.entity.Person;
import com.jtfc.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(value = "/save")
    public String savePerson(@RequestBody Person person) {
        boolean res = personService.savePerson(person);
        return res ? "Data successfully saved" : "Failed to save data";
    }

    @GetMapping(value = "/get-all")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @PutMapping(value = "/update")
    public String updatePerson(@RequestBody Person person) {
        boolean res = personService.updatePerson(person);
        return res ? "Data successfully updated" : "Failed to update data";
    }

    @DeleteMapping(value = "/delete/{nid}")
    public String deletePerson(@PathVariable("nid") String nid) {
        boolean res = personService.deletePerson(nid);
        return res ? "Data successfully deleted" : "Failed to delete data";
    }

    @GetMapping(value = "/find/{nid}")
    public Person findPersonById(@PathVariable("nid") String nid) {
        return personService.findPersonById(nid);
    }
}