package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate(){
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaHelpForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        ForumUser ivoneEscobar = new ForumUser("Iwone Escobar");
        javaHelpForum.registerObserve(johnSmith);
        javaToolsForum.registerObserve(ivoneEscobar);
        javaHelpForum.registerObserve(jessiePinkman);
        javaToolsForum.registerObserve(jessiePinkman);
        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Better try to use while loop in this case");
        javaToolsForum.addPost("Help pls, my MySQL db doesnt want to work");
        javaHelpForum.addPost("Why while? is it better?");
        javaToolsForum.addPost("When I try..");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());

    }
}
