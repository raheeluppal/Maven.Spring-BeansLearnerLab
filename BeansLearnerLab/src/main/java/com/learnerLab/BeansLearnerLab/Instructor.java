package com.learnerLab.BeansLearnerLab;

public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(id, name);
    }


    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        int size = 0;
        for(Learner l : learners){
            size ++;
        }
        double numberOfHoursPerLearner = numberOfHours / size;


        for(Learner learner : learners){
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
