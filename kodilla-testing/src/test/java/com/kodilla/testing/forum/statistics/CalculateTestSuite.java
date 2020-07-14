package com.kodilla.testing.forum.statistics;
import org.junit.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;

public class CalculateTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Start of all tests.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("End of all tests.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test no: " + testCounter);
    }
    @Test
    public void testNoOfPosts0(){
        //Given
        Statistics statisticsMock =mock(Statistics.class);
        List<String>listOfUsers=new ArrayList<>();
        for (int i=0; i<300; i++){
            listOfUsers.add("name"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(450);
        Calculate one = new Calculate();
        one.calculateAdvStatistics(statisticsMock);
        one.showStatistics();
        //When
        double averagePostsPerUser = one.averagePostsPerUser;
        double averageCommentsPerUser = one.averageCommentsPerUser;
        double averageCommentsPerPost = one.averageCommentsPerPost;
        //Then
        Assert.assertEquals(0.0, averagePostsPerUser,0.1);
        Assert.assertEquals(1.5, averageCommentsPerUser,0.1);
        Assert.assertEquals(Double.POSITIVE_INFINITY, averageCommentsPerPost,0.1);
    }
    @Test
    public void testNoOfPosts1000(){
        //Given
        Statistics statisticsMock =mock(Statistics.class);
        List<String>listOfUsers=new ArrayList<>();
        for (int i=0; i<300; i++){
            listOfUsers.add("name"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(450);
        Calculate one = new Calculate();
        one.calculateAdvStatistics(statisticsMock);
        one.showStatistics();
        //When
        double averagePostsPerUser = one.averagePostsPerUser;
        double averageCommentsPerUser = one.averageCommentsPerUser;
        double averageCommentsPerPost = one.averageCommentsPerPost;
        //Then
        Assert.assertEquals(3.33, averagePostsPerUser,0.1);
        Assert.assertEquals(1.5, averageCommentsPerUser,0.1);
        Assert.assertEquals(0.45, averageCommentsPerPost,0.1);
    }
    @Test
    public void testNoOfComments0(){
        //Given
        Statistics statisticsMock =mock(Statistics.class);
        List<String>listOfUsers=new ArrayList<>();
        for (int i=0; i<300; i++){
            listOfUsers.add("name"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(450);
        when(statisticsMock.commentsCount()).thenReturn(0);
        Calculate one = new Calculate();
        one.calculateAdvStatistics(statisticsMock);
        one.showStatistics();
        //When
        double averagePostsPerUser = one.averagePostsPerUser;
        double averageCommentsPerUser = one.averageCommentsPerUser;
        double averageCommentsPerPost = one.averageCommentsPerPost;
        //Then
        Assert.assertEquals(1.5, averagePostsPerUser,0.1);
        Assert.assertEquals(0.0, averageCommentsPerUser,0.1);
        Assert.assertEquals(0.0, averageCommentsPerPost,0.1);
    }
    @Test
    public void testNoOfCommentsSmallerThanNoOfPosts(){
        //Given
        Statistics statisticsMock =mock(Statistics.class);
        List<String>listOfUsers=new ArrayList<>();
        for (int i=0; i<300; i++){
            listOfUsers.add("name"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(450);
        when(statisticsMock.commentsCount()).thenReturn(320);
        Calculate one = new Calculate();
        one.calculateAdvStatistics(statisticsMock);
        one.showStatistics();
        //When
        double averagePostsPerUser = one.averagePostsPerUser;
        double averageCommentsPerUser = one.averageCommentsPerUser;
        double averageCommentsPerPost = one.averageCommentsPerPost;
        //Then
        Assert.assertEquals(1.5, averagePostsPerUser,0.1);
        Assert.assertEquals(1.06, averageCommentsPerUser,0.1);
        Assert.assertEquals(0.71, averageCommentsPerPost,0.1);
    }
    @Test
    public void testNoOfCommentsBiggerThanNoOfPosts(){
        //Given
        Statistics statisticsMock =mock(Statistics.class);
        List<String>listOfUsers=new ArrayList<>();
        for (int i=0; i<300; i++){
            listOfUsers.add("name"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(320);
        when(statisticsMock.commentsCount()).thenReturn(450);
        Calculate one = new Calculate();
        one.calculateAdvStatistics(statisticsMock);
        one.showStatistics();
        //When
        double averagePostsPerUser = one.averagePostsPerUser;
        double averageCommentsPerUser = one.averageCommentsPerUser;
        double averageCommentsPerPost = one.averageCommentsPerPost;
        //Then
        Assert.assertEquals(1.06, averagePostsPerUser,0.1);
        Assert.assertEquals(1.5, averageCommentsPerUser,0.1);
        Assert.assertEquals(1.41, averageCommentsPerPost,0.1);
    }
    @Test
    public void testNoOfUsers0(){
        //Given
        Statistics statisticsMock =mock(Statistics.class);
        List<String>listOfUsers=new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(320);
        when(statisticsMock.commentsCount()).thenReturn(450);
        Calculate one = new Calculate();
        one.calculateAdvStatistics(statisticsMock);
        one.showStatistics();
        //When
        double averagePostsPerUser = one.averagePostsPerUser;
        double averageCommentsPerUser = one.averageCommentsPerUser;
        double averageCommentsPerPost = one.averageCommentsPerPost;
        //Then
        Assert.assertEquals(Double.POSITIVE_INFINITY, averagePostsPerUser,0.1);
        Assert.assertEquals(Double.POSITIVE_INFINITY, averageCommentsPerUser,0.1);
        Assert.assertEquals(1.41, averageCommentsPerPost,0.1);
    }
    @Test
    public void testNoOfUsers100(){
        //Given
        Statistics statisticsMock =mock(Statistics.class);
        List<String>listOfUsers=new ArrayList<>();
        for (int i=0; i<100; i++){
            listOfUsers.add("name"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(320);
        when(statisticsMock.commentsCount()).thenReturn(450);
        Calculate one = new Calculate();
        one.calculateAdvStatistics(statisticsMock);
        one.showStatistics();
        //When
        double averagePostsPerUser = one.averagePostsPerUser;
        double averageCommentsPerUser = one.averageCommentsPerUser;
        double averageCommentsPerPost = one.averageCommentsPerPost;
        //Then
        Assert.assertEquals(3.2, averagePostsPerUser,0.1);
        Assert.assertEquals(4.5, averageCommentsPerUser,0.1);
        Assert.assertEquals(1.41, averageCommentsPerPost,0.1);
    }
}

