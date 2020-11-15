package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate () {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(ivoneEscobar);
        //When
        javaHelpForum.addPost("post one");
        javaHelpForum.addPost("post two");
        javaToolsForum.addPost("post three");
        javaHelpForum.addPost("post four");
        javaToolsForum.addPost("post five");
        //Then
        assertEquals(3,johnSmith.getUpdateCount());
        assertEquals(2,ivoneEscobar.getUpdateCount());
        assertEquals(5,jessiePinkman.getUpdateCount());
    }
}
