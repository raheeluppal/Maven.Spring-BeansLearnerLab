package com.learnerLab.BeansLearnerLab;

public class Classroom {

    private Instructors instructors;
    private Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, Double numberOfHours){
        teacher.lecture(students.findAll(),numberOfHours);
    }
}
