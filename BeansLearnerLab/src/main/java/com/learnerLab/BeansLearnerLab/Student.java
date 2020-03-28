package com.learnerLab.BeansLearnerLab;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(long id, String name,double totalStudyTime) {
        super(id, name);
        this.totalStudyTime= totalStudyTime;
    }

    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }

    @Override
    public void learn(Double numberOfHours) {

        totalStudyTime += numberOfHours;
    }
}
