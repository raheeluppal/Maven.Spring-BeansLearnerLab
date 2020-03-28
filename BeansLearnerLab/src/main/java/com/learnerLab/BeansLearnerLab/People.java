package com.learnerLab.BeansLearnerLab;

import com.sun.javafx.binding.StringFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType> {

    private List<PersonType> personList;


    public People(PersonType... person) {
        personList = new ArrayList<>();
        personList.addAll(Arrays.asList(person));
    }

    public void add(PersonType personType){
        personList.add(personType);
    }

    public void remove(PersonType personType){
        personList.remove(personType);
    }

    public Integer size(){
       return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> persons) {
        int size = 0;
        for (PersonType p : persons) {
            personList.add(p);
        }
    }

    public PersonType findById(Long id){
        PersonType result = null;
        for (PersonType personType : personList) {
            if (personType.getId() == id) {
                result = personType;
            }
        }
        return result;
    }

    public List<PersonType> findAll(){
        return personList;
    }
}
