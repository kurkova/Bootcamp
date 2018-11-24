package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    Statistics statistics;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    private double getaAerageNumberOfPostsPerUser() {
        if (statistics.usersNames().size() == 0) {
            averageNumberOfPostsPerUser = 0;
        } else {
            averageNumberOfPostsPerUser = statistics.postsCount() / (double) statistics.usersNames().size();
        }
        return averageNumberOfPostsPerUser;
    }

    private double getAverageNumberOfCommentsPerUser() {
        if (statistics.usersNames().size() == 0) {
            averageNumberOfCommentsPerUser = 0;
        } else {
            averageNumberOfCommentsPerUser = statistics.postsCount() / (double) statistics.usersNames().size();
        }
        return averageNumberOfCommentsPerUser;
    }

    private double getAverageNumberOfCommentsPerPost() {
        averageNumberOfCommentsPerPost = (statistics.commentsCount() / (double) statistics.postsCount());
        return averageNumberOfCommentsPerPost;
    }


}
