import java.util.List;

public class SocialMediaApp2 {
    public static void main(String[] args) {


        Comment2 comment1 = new Comment2(1, "you're still hungry?"); 
        List<Comment2> post1Comments = List.of(comment1);


        Post2 post1 = new Post2(1, "Who wants peanutbutter", post1Comments); //instanciating new object with datatype Post, passing into all args constructor on Post.java
        Post2 post2 = new Post2(2, "I deserve 500 girlfriends", post1Comments); //user2.getId
        Post2 post3 = new Post2(3, "The dogs are stinking up the house", post1Comments);
        Post2 post4 = new Post2(4, "pull up bro", post1Comments);
        Post2 post5 = new Post2(5, "I'm mom's favorite", post1Comments);
        Post2 post6 = new Post2(6, "who wants to fight", post1Comments);

        List<Post2> user1Posts = List.of(post1);
        List<Post2> user2Posts = List.of(post2, post3);
        List<Post2> user3Posts = List.of(post4, post5, post6);

    

        System.out.println("--------------CREATE LIST OF 3 USERS--------------------");
        //one to many relationship; one user can make many posts
        //one to one; one user to one post

        User2 user1 = new User2(1, "Bucky", "Barnes", "BucktownFunk@gmail.com", user1Posts); //instanciating new object with datatype User, passing into all args constructor on UserObject.java
        User2 user2 = new User2(2, "Rocky", "Balboa", "CatzRule@gmail.com", user2Posts);
        User2 user3 = new User2(3, "Hank", "Noodle", "HankTheTank@gmail.com", user3Posts);

        List<User2> users = List.of(user1, user2, user3); //list of users
        System.out.println("These are our uses: " + users);

        System.out.println("--------------CREATE POSTS--------------------");

        // TODO: don't hardcode foreign keys
        // Post2 post1 = new Post2(1, "Who wants peanutbutter", 1); //instanciating new object with datatype Post, passing into all args constructor on Post.java
        // Post2 post2 = new Post2(2, "I deserve 500 girlfriends", 2); //user2.getId
        // Post2 post3 = new Post2(3, "The dogs are stinking up the house", 2);
        // Post2 post4 = new Post2(4, "pull up bro", 3);
        // Post2 post5 = new Post2(5, "I'm mom's favorite", 3);
        // Post2 post6 = new Post2(6, "who wants to fight", 3);

        List<Post2> posts = List.of(post1, post2, post3, post4, post5, post6); //list of posts
        System.out.println("These are our posts: " + posts);

        System.out.println("--------------CREATE COMMENTS--------------------");

        //Comment2 comment1 = new Comment2(1, "you're still hungry?"); 
        
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