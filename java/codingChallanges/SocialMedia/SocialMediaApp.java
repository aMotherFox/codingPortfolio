import java.util.List;

public class SocialMediaApp {
    public static void main(String[] args) {

        System.out.println("--------------CREATE LIST OF 3 USERS--------------------");

        User user1 = new User(1, "Bucky", "Barnes", "BucktownFunk@gmail.com"); //instanciating new object with datatype User, passing into all args constructor on User.java
        User user2 = new User(2, "Rocky", "Balboa", "CatzRule@gmail.com");
        User user3 = new User(2, "Hank", "Noodle", "HankTheTank@gmail.com");

        List<User> users = List.of(user1, user2, user3);
        System.out.println("These are our uses: " + users);
        
    }
}


/* 
 * Learning about object relantionships:
 * 
 * * Step 1: Model creations * *
 * 
 * Create 3 models
 * User with fields: id, firstName, lastName, email
 * Post with fields: id, text
 * Comment with fields: id, text
 * 
 * * Step 2: Set up data * * 
 * 
 * Create a list of 3 users. 
 * Each user must have at least 1+ posts. 
 *  (User 1 has 1 post, User 2 has 2 posts, User 3 has 3 posts)
 * Each post must have at least 1 comment from the other 2 users
 * 
 * Hint: you will probably need to create some type of 'relantionship' between these models
 * 
 * * Step 3: Gather individual data **
 * 
 * 1. sysout how many posts each user had
 *  ex: user 1 has 1 post
 *      user 2 has 2 posts
 *      user 3 has 3 posts
 * 2. sysout all the comments by individual post. 
 *  ex: post 1 has 2 comments
 *          comment1
 *          comment2
 *      post 2 has 2 comments
 *          comment1
 *          comment2
 *      post 3 has 3 comments
 *          ...
 *      post 4 has 2 comments
 *          ..
 *      ...
 *
 * 3. sysout all the comments that a user made on ANY post
 *  ex: user GIVEN comments:
 *      comment1
 *      comment2
 *      comment3
 *      ...
 * 
 * 4. sysout all the comments a user has received on ANY of their posts
 *  ex: user RECEIVED comments:
 *      comment1
 *      comment2
 *      comment3
 *      ...
 * 
 * 5. sysout all the posts that each individual user commented on
 *  ex: User 1 commented on:
 *          post 1
 *          post 3
 *      User 2 commented on:
 *          post 2
 *          post 4
 *      User 3 commented on:
 *          post 1
 *          post 3
 * 
 */