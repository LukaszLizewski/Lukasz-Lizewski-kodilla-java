package com.kodilla.testing.forum.statistics;

public class Calculate {
    Statistics statistics;
    private double noOfUsers;
    private double noOfPosts;
    private double noOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;
    public void calculateAdvStatistics (Statistics statistics){
        this.statistics = statistics;
        this.noOfUsers = statistics.usersNames().size();
        this.noOfPosts =  statistics.postsCount();
        this.noOfComments =  statistics.commentsCount();
        averagePostsPerUser =  noOfPosts/noOfUsers;
        averageCommentsPerUser =  noOfComments/noOfUsers;
        averageCommentsPerPost =  noOfComments/noOfPosts;
    }
    public double getAveragePostsPerUser(){
        if (averagePostsPerUser==Double.POSITIVE_INFINITY){
            averagePostsPerUser=0;
        }
        return averagePostsPerUser;
    }
    public double getAverageCommentsPerUser(){
        if (averageCommentsPerUser==Double.POSITIVE_INFINITY){
            averageCommentsPerUser=0;
        }
        return averageCommentsPerUser;
    }
    public double getAverageCommentsPerPost(){
        if (averageCommentsPerPost==Double.POSITIVE_INFINITY){
            averageCommentsPerPost=0;
        }
        return averageCommentsPerPost;
    }
    public void showStatistics(){
        System.out.println("Number of users: "+ noOfUsers);
        System.out.println("Number of posts: "+ noOfPosts);
        System.out.println("Number of comments: "+ noOfComments);
        System.out.println("Average number of posts per user: "+ getAveragePostsPerUser());
        System.out.println("Average number of comments per user: "+ getAverageCommentsPerUser());
        System.out.println("Average number of comments per post: "+ getAverageCommentsPerPost());
    }
}

