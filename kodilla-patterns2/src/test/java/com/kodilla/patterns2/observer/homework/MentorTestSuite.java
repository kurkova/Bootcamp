package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate(){
        //Given
        StudentTask patterns2 = new Patterns2();
        StudentTask hibernate = new Hibernate();
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        patterns2.registerObserve(mentor1);
        hibernate.registerObserve(mentor2);
        //When
        patterns2.addTask("Adapter");
        patterns2.addTask("Observator");
        patterns2.addTask("Observator");
        hibernate.addTask("Facade");
        hibernate.addTask("HQL query");
        //Then
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}
