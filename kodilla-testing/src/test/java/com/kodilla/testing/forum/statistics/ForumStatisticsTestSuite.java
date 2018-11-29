package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatisticsZeroPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics calculate = new CalculateStatistics();
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(4);
        List<String> usersList = new ArrayList<>();
        usersList.add("a");
        usersList.add("a");
        when(statistics.usersNames()).thenReturn(usersList);
        //When
        calculate.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(2, calculate.getQuantityOfUsers(), 0.001);
        Assert.assertEquals(0, calculate.getQuantityOfPosts(), 0.001);
        Assert.assertEquals(4, calculate.getQuantityOfComments(),0.001);
        Assert.assertEquals(0, calculate.getAveragePostsPerUser(),0.001);
        Assert.assertEquals(2, calculate.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(0, calculate.getAverageCommentsPerPost(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsThousandPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics calculate = new CalculateStatistics();
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(500);
        List<String> usersList = new ArrayList<>();
        usersList.add("a");
        usersList.add("a");
        when(statistics.usersNames()).thenReturn(usersList);
        //When
        calculate.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(2, calculate.getQuantityOfUsers(), 0.001);
        Assert.assertEquals(1000, calculate.getQuantityOfPosts(), 0.001);
        Assert.assertEquals(500, calculate.getQuantityOfComments(),0.001);
        Assert.assertEquals(500, calculate.getAveragePostsPerUser(),0.001);
        Assert.assertEquals(250, calculate.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(2, calculate.getAverageCommentsPerPost(),0.001);
    }

    @Test
    public void testCalculateAdvStatisticsZeroComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics calculate = new CalculateStatistics();
        when(statistics.postsCount()).thenReturn(4);
        when(statistics.commentsCount()).thenReturn(0);
        List<String> usersList = new ArrayList<>();
        usersList.add("a");
        usersList.add("a");
        when(statistics.usersNames()).thenReturn(usersList);
        //When
        calculate.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(2, calculate.getQuantityOfUsers(), 0.001);
        Assert.assertEquals(4, calculate.getQuantityOfPosts(), 0.001);
        Assert.assertEquals(0, calculate.getQuantityOfComments(),0.001);
        Assert.assertEquals(2, calculate.getAveragePostsPerUser(),0.001);
        Assert.assertEquals(0, calculate.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(0, calculate.getAverageCommentsPerPost(),0.001);
    }

    @Test
    public void testCalculateAdvStatisticsMorePostsThanComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics calculate = new CalculateStatistics();
        when(statistics.postsCount()).thenReturn(8);
        when(statistics.commentsCount()).thenReturn(6);
        List<String> usersList = new ArrayList<>();
        usersList.add("a");
        usersList.add("a");
        when(statistics.usersNames()).thenReturn(usersList);
        //When
        calculate.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(2, calculate.getQuantityOfUsers(), 0.001);
        Assert.assertEquals(8, calculate.getQuantityOfPosts(), 0.001);
        Assert.assertEquals(6, calculate.getQuantityOfComments(),0.001);
        Assert.assertEquals(4, calculate.getAveragePostsPerUser(),0.001);
        Assert.assertEquals(3, calculate.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(1.333, calculate.getAverageCommentsPerPost(),0.001);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics calculate = new CalculateStatistics();
        when(statistics.postsCount()).thenReturn(6);
        when(statistics.commentsCount()).thenReturn(8);
        List<String> usersList = new ArrayList<>();
        usersList.add("a");
        usersList.add("a");
        when(statistics.usersNames()).thenReturn(usersList);
        //When
        calculate.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(2, calculate.getQuantityOfUsers(), 0.001);
        Assert.assertEquals(6, calculate.getQuantityOfPosts(), 0.001);
        Assert.assertEquals(8, calculate.getQuantityOfComments(),0.001);
        Assert.assertEquals(3, calculate.getAveragePostsPerUser(),0.001);
        Assert.assertEquals(4, calculate.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(0.75, calculate.getAverageCommentsPerPost(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsZeroUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics calculate = new CalculateStatistics();
        when(statistics.postsCount()).thenReturn(6);
        when(statistics.commentsCount()).thenReturn(8);
        List<String> usersList = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(usersList);
        //When
        calculate.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, calculate.getQuantityOfUsers(), 0.001);
        Assert.assertEquals(6, calculate.getQuantityOfPosts(), 0.001);
        Assert.assertEquals(8, calculate.getQuantityOfComments(),0.001);
        Assert.assertEquals(0, calculate.getAveragePostsPerUser(),0.001);
        Assert.assertEquals(0, calculate.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(0.75, calculate.getAverageCommentsPerPost(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsThousandUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        CalculateStatistics calculate = new CalculateStatistics();
        when(statistics.postsCount()).thenReturn(5000);
        when(statistics.commentsCount()).thenReturn(2000);
        List<String> usersList = new ArrayList<>();
        for (int i =0; i <1000; i++){
            usersList.add("a");
        }
        when(statistics.usersNames()).thenReturn(usersList);
        //When
        calculate.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(1000, calculate.getQuantityOfUsers(), 0.001);
        Assert.assertEquals(5000, calculate.getQuantityOfPosts(), 0.001);
        Assert.assertEquals(2000, calculate.getQuantityOfComments(),0.001);
        Assert.assertEquals(5, calculate.getAveragePostsPerUser(),0.001);
        Assert.assertEquals(2, calculate.getAverageCommentsPerUser(),0.001);
        Assert.assertEquals(2.5, calculate.getAverageCommentsPerPost(),0.001);
    }

}


