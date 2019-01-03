package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User paul = new YGeneration("Paul Paul");
        User john = new ZGeneration("John John");
        User smith = new Millenials("Smith Smith");
        //When
        String paulPublisher = paul.sharePost();
        String johnPublisher = john.sharePost();
        String smithPublisher = smith.sharePost();
        //Then
        Assert.assertEquals("Twitter", paulPublisher);
        Assert.assertEquals("Facebook", johnPublisher);
        Assert.assertEquals("Snapchat", smithPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User paul = new YGeneration("Paul Paul");
        //When
        paul.setSocialPublisher(new TwitterPublisher());
        paul.setSocialPublisher(new FacebookPublisher());
        String paulPublisher = paul.sharePost();
        //Then
        Assert.assertEquals("Facebook", paulPublisher);
    }
}
