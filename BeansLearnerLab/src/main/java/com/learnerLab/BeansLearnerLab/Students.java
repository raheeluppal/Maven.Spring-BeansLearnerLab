package com.learnerLab.BeansLearnerLab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Students extends People<Student> {

    public Students(Student... person) {
        super(person);
    }

}
