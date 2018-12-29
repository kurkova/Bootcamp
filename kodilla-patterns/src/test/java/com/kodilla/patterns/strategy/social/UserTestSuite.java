package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User paul = new YGeneration("Paul Paul");
        User john = new ZGeneration("John John");
        User smith = new Millenials("Smith Smith");
        //When
        String paulPublisher = paul.sharePost();
        System.out.println(paulPublisher);
        String johnPublisher = john.sharePost();
        System.out.println(johnPublisher);
        String smithPublisher = smith.sharePost();
        System.out.println(smithPublisher);
       //Then
        Assert.assertEquals("Twitter", paulPublisher);
        Assert.assertEquals("Facebook", johnPublisher);
        Assert.assertEquals("Snapchat", smithPublisher);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User paul = new YGeneration("Paul Paul");
        //When
        String paulPublisher = paul.sharePost();
        System.out.println("Yesterday Paul added post on: " + paulPublisher);
        paul.setSocialPublisher(new FacebookPublisher());
        paulPublisher = paul.sharePost();
        System.out.println("Today Paul is using: " + paulPublisher);
        //Then
        Assert.assertEquals("Facebook", paulPublisher);
    }
}
