package com.kodilla.testing.forum.statistics;

public class Calculate {
    Statistics statistics;
    public double noOfUsers;
    public double noOfPosts;
    public double noOfComments;
    public double averagePostsPerUser;
    public double averageCommentsPerUser;
    public double averageCommentsPerPost;
    public void calculateAdvStatistics (Statistics statistics){
        this.statistics = statistics;
        this.noOfUsers = (double) statistics.usersNames().size();
        this.noOfPosts = (double) statistics.postsCount();
        this.noOfComments = (double) statistics.commentsCount();
        this.averagePostsPerUser = (double) noOfPosts/noOfUsers;
        this.averageCommentsPerUser = (double) noOfComments/noOfUsers;
        this.averageCommentsPerPost = (double) noOfComments/noOfPosts;
    }
    public void showStatistics(){
        System.out.println("Number of users: "+ noOfUsers);
        System.out.println("Number of posts: "+ noOfPosts);
        System.out.println("Number of comments: "+ noOfComments);
        System.out.println("Average number of posts per user: "+ averagePostsPerUser);
        System.out.println("Average number of comments per user: "+ averageCommentsPerUser);
        System.out.println("Average number of comments per post: "+ averageCommentsPerPost);
    }
}

