package com.learnerLab.BeansLearnerLab;

public interface Teacher {
    void teach(Learner learner, Double numberOfHours);
    void lecture(Iterable<? extends Learner> learners, Double numberOfHours);
}
