package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class ForumUserDirectory {
    private final List<ForumUser> theForumUserList = new ArrayList<>();
    public ForumUserDirectory(){
        theForumUserList.add(new ForumUser(1,"Joe",'M', LocalDate.of(1990,3,19),12));
        theForumUserList.add(new ForumUser(2,"Ros",'M', LocalDate.of(1988,4,29),3));
        theForumUserList.add(new ForumUser(2,"Chandler",'M', LocalDate.of(1987,12,29),56));
        theForumUserList.add(new ForumUser(2,"Monica",'F', LocalDate.of(1990,2,13),223));
        theForumUserList.add(new ForumUser(2,"Rachel",'F', LocalDate.of(1987,7,25),423));
        theForumUserList.add(new ForumUser(2,"Phebe",'F', LocalDate.of(1986,6,14),346));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(theForumUserList);
    }
}
