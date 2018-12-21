package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("Christmas shopping");
        board.getInProgressList().addTask("Java course");
        board.getDoneList().addTask("Morning exercise");
        //When
        Assert.assertEquals("Christmas shopping", board.getToDoList().getTask(0));
        Assert.assertEquals("Java course", board.getInProgressList().getTask(0));
        Assert.assertEquals("Morning exercise", board.getDoneList().getTask(0));
    }
}
