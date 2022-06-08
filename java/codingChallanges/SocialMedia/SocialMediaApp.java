import java.util.List;

public class SocialMediaApp {
    public static void main(String[] args) {

        System.out.println("--------------CREATE LIST OF 3 USERS--------------------");
        //one to many relationship; one user can make many posts
        //one to one; one user to one post

        User user1 = new User(1, "Bucky", "Barnes", "BucktownFunk@gmail.com"); //instanciating new object with datatype User, passing into all args constructor on User.java
        User user2 = new User(2, "Rocky", "Balboa", "CatzRule@gmail.com");
        User user3 = new User(3, "Hank", "Noodle", "HankTheTank@gmail.com");

        List<User> users = List.of(user1, user2, user3); //list of users
        System.out.println("These are our uses: " + users);

        System.out.println("--------------CREATE POSTS--------------------");

        // TODO: don't hardcode foreign keys
        // Post post1 = new Post(1, "Who wants peanutbutter", 1); //instanciating new object with datatype Post, passing into all args constructor on Post.java
        // Post post2 = new Post(2, "I deserve 500 girlfriends", 2); //user2.getId
        // Post post3 = new Post(3, "The dogs are stinking up the house", 2);
        // Post post4 = new Post(4, "pull up bro", 3);
        // Post post5 = new Post(5, "I'm mom's favorite", 3);
        // Post post6 = new Post(6, "who wants to fight", 3);

        Post post1 = new Post(1, "Who wants peanutbutter", user1.getId()); //replacing hardcoded 1 with calling the getId from user1
        Post post2 = new Post(2, "I deserve 500 girlfriends", user2.getId());
        Post post3 = new Post(3, "The dogs are stinking up the house", user2.getId());
        Post post4 = new Post(4, "pull up bro", user3.getId());
        Post post5 = new Post(5, "I'm mom's favorite", user3.getId());
        Post post6 = new Post(6, "who wants to fight", user3.getId());

        List<Post> posts = List.of(post1, post2, post3, post4, post5, post6); //list of posts
        System.out.println("These are our posts: " + posts);

        System.out.println("--------------CREATE COMMENTS--------------------");

        Comment comment1 = new Comment(1, "you're still hungry?", post1.getId(), user2.getId()); //comment id 1, with text, left on post1 (1), and left by Rocky (2)
        Comment comment2 = new Comment(2, "I already ate the whole thing", post1.getId(), user3.getId()); //post1, by Hank
        Comment comment3 = new Comment(3, "you must treat them like queens", post2.getId(), user1.getId()); //post2 by Bucky
        Comment comment4 = new Comment(4, "you're the stinky one", post3.getId(), user3.getId()); //post3 by Hank
        Comment comment5 = new Comment(5, "violence is't the awnser!", post4.getId(), user1.getId()); //post4 by Bucky
        Comment comment6 = new Comment(6, "i'll rock your shet!", post4.getId(), user2.getId()); //post4 by Hank
        Comment comment7 = new Comment(7, "i'm literally outside fite me", post5.getId(), user2.getId()); //post5 by Rocky
        Comment comment8 = new Comment(8, "that's not nice to say!", post5.getId(), user1.getId()); //post5 by Bucky
        Comment comment9 = new Comment(9, "I'll bury you bro", post6.getId(), user2.getId()); //post6 by Rocky
        Comment comment10 = new Comment(10, "lets just hug it out!", post6.getId(), user1.getId()); //post6 by Bucky

        List<Comment> comments = List.of(comment1, comment2, comment3, comment4, comment5, comment6, comment7, comment8, comment9, comment10); //list of comments
        System.out.println("These are our comments: " + comments);
        
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