package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User joe = new Millenials("Joe Tribiani");
        User chandler = new YGeneration("Chandler Bing");
        User ross = new ZGeneration("Ross Galer");
        //When
        String joeIsSaying = joe.sharePost();
        String chandlerIsSaying = chandler.sharePost();
        String rossIsSaying = ross.sharePost();
        System.out.println(joe.getName() + " will say: " + joeIsSaying);
        System.out.println(chandler.getName() + " will say: " + chandlerIsSaying);
        System.out.println(ross.getName() + " will say: " + rossIsSaying);
        //Then
        Assert.assertEquals("This is The Facebook dude", joeIsSaying);
        Assert.assertEquals("Snapchat rules", chandlerIsSaying);
        Assert.assertEquals("Tweet...", rossIsSaying);

    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User joe = new User("Joe Tribiani");
        joe.setSocialPublisher(new TwitterPublisher());
        //When
        String joeNowSaying = joe.sharePost();
        //Then
        Assert.assertEquals("Tweet...", joeNowSaying);
    }
}
