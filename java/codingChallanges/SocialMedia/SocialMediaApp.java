import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class SocialMediaApp {
    public static void main(String[] args) {

        //one to many relationship; one user can make many posts
        //one to one; one user to one post

        User user1 = new User(1, "Bucky", "Barnes", "BucktownFunk@gmail.com"); //instanciating new object with datatype User, passing into all args constructor on UserObject.java
        User user2 = new User(2, "Rocky", "Balboa", "CatzRule@gmail.com");
        User user3 = new User(3, "Hank", "Noodle", "HankTheTank@gmail.com");

        List<User> users = List.of(user1, user2, user3); 

        //System.out.println("--------------CREATE POSTS--------------------");

        Post post1 = new Post(1, "Who wants peanutbutter", user1.getId()); //replacing hardcoded 1 with calling the getId from user1
        Post post2 = new Post(2, "I deserve 500 girlfriends", user2.getId());
        Post post3 = new Post(3, "The dogs are stinking up the house", user2.getId());
        Post post4 = new Post(4, "pull up bro", user3.getId());
        Post post5 = new Post(5, "I'm mom's favorite", user3.getId());
        Post post6 = new Post(6, "who wants to fight", user3.getId());

        List<Post> posts = List.of(post1, post2, post3, post4, post5, post6); 

        //System.out.println("--------------CREATE COMMENTS--------------------");

        Comment comment1 = new Comment(1, "you're still hungry?", post1.getId(), user2.getId()); //comment id 1, with text, left on post1 (1), and left by Rocky (2)
        Comment comment2 = new Comment(2, "I already ate the whole thing", post1.getId(), user3.getId()); //post1, by Hank
        Comment comment3 = new Comment(3, "you must treat them like queens", post2.getId(), user1.getId()); //post2 by Bucky
        Comment comment4 = new Comment(4, "you're the stinky one", post3.getId(), user3.getId()); //post3 by Hank
        Comment comment5 = new Comment(5, "violence is't the awnser!", post4.getId(), user1.getId()); //post4 by Bucky
        Comment comment6 = new Comment(6, "i'll rock your shet!", post4.getId(), user2.getId()); //post4 by Rocky
        Comment comment7 = new Comment(7, "i'm literally outside fite me", post5.getId(), user2.getId()); //post5 by Rocky
        Comment comment8 = new Comment(8, "that's not nice to say!", post5.getId(), user1.getId()); //post5 by Bucky
        Comment comment9 = new Comment(9, "I'll bury you bro", post6.getId(), user2.getId()); //post6 by Rocky
        Comment comment10 = new Comment(10, "lets just hug it out!", post6.getId(), user1.getId()); //post6 by Bucky

        List<Comment> comments = List.of(comment1, comment2, comment3, comment4, comment5, comment6, comment7, comment8, comment9, comment10); 

        System.out.println("-----------------how many posts each user has-----------------");
        //pass in userId
        //convert amount of posts into integer
        //.size can get the number of elements in a list

        List<Post> postsFrom1 = gettingUserPosts(posts, user1.getId()); //calling gettingUserPosts and passing in the id for user1
        Integer totalPosts1 = postsFrom1.size(); //size method, returns number of elements in a listarray; sizing postsFrom1
        System.out.println("user1 total posts: " + totalPosts1);
        
        List<Post> postsFrom2 = gettingUserPosts(posts, user2.getId()); //calling gettingUserPosts and passing in the id for user2
        Integer totalPosts2 = postsFrom2.size(); //size method, returns number of elements in a listarray; sizing postsFrom2
        System.out.println("user2 total posts: " + totalPosts2);

        List<Post> postsFrom3 = gettingUserPosts(posts, user3.getId()); //calling gettingUserPosts and passing in the id for user3
        Integer totalPosts3 = postsFrom3.size(); //size method, returns number of elements in a listarray; sizing postsFrom3
        System.out.println("user3 total posts: " + totalPosts3);

        System.out.println("-----------------how many comments each post has-----------------");
        //iterate through posts
        //pass in postId to make lists
        //convert amount of comments into integer
        //display those comments

        posts.forEach(post -> { //iterating through posts
            List<Comment> commentsFromPosts = gettingPostComments(comments, post.getId());
            Integer totalCommentsOnPosts = commentsFromPosts.size(); //size method, returns number of elements in a listarray; sizing commentsFromPosts
            System.out.println("post id: " + post.getId() + ", the comments: " + commentsFromPosts + ", total comments: " + totalCommentsOnPosts);
        });


        System.out.println("-----------------show what comments each user made-----------------");

        List<Comment> commentsFrom1 = gettingUsersComments(comments, user1.getId());
        Integer totalComments1 = commentsFrom1.size();
        System.out.println("user1 total comments given: " + totalComments1 + ", the comments: " + commentsFrom1);

        List<Comment> commentsFrom2 = gettingUsersComments(comments, user2.getId());
        Integer totalComments2 = commentsFrom2.size();
        System.out.println("user2 total comments given: " + totalComments2 + ", the comments: " + commentsFrom2);
        
        
        List<Comment> commentsFrom3 = gettingUsersComments(comments, user3.getId());
        Integer totalComments3 = commentsFrom3.size();
        System.out.println("user3 total comments given: " + totalComments3 + ", the comments: " + commentsFrom3);

        // TODO: make into forEach loop

        System.out.println("-----------------show what comments each user recieved-----------------");
        //check each user's posts and shwo what comments were recieved
        //must group user's posts together- iterate each user's posts?

        //----------------------------------USER 1 RECIEVED COMMENTS--------------------------------------
       postsFrom1.forEach(post -> { //iterating through list made earlier, already is only user 1's posts
            List<Comment> postsFrom1Comments = gettingPostComments(comments, post.getId()); //reusing the gettingPostComments method
            System.out.println("Every comment recieved by user1: " + postsFrom1Comments); //this is sysouting every loop, works because only 1 post
       });


       //new list first
       //----------------------------------USER 2 RECIEVED COMMENTS--------------------------------------
       List<Comment> commentsRecieved2 = new ArrayList<>();
       postsFrom2.forEach(post -> {
        List<Comment> postsFrom2Comments = gettingPostComments(comments, post.getId());
        commentsRecieved2.addAll(postsFrom2Comments);
        //System.out.println("Every comment recieved by user2: " + postsFrom2Comments); 
        //need to sysout postsFrom2Comments but not in loop
        //addAll can take all elements from one list and add it to another list - listDest.addAll(listSource);
        //make new list of all comments and sysout that list? List<String> listA = new ArrayList<>();

        });
        System.out.println("All the comments user 2 recieved: " + commentsRecieved2);


        //----------------------------------USER 3 RECIEVED COMMENTS--------------------------------------
        //FLATTENING!!!!!!!!!!!!!!!!
        //easier to read, only going through posts ONCE
        List<Comment> commentsRecieved3 = postsFrom3.stream()
            .flatMap(post -> gettingPostComments(comments, post.getId()).stream())
            .collect(Collectors.toList());
        System.out.println("All the comments user 3 recieved: " + commentsRecieved3);



        System.out.println("-----------------show what posts each user commented on-----------------");

        // commentsFrom1.stream().forEach(comment -> {
        //     if (comment.postId == user1.id) {

        //     }
        // });
       
        //pass in more than 2 properties into the method??
        
        //look at models and think of how they relate to eachother
        //how do you know that a user recieved a comment? - the comment's postId tells us which post was commented on, and the post's userId tells us the user who created the post
        //comment postId(on comment) -> userId(on post) -> user(on user)
        //any comment that has the postId depending on the user, you can find all the comments a user recieved
        //how do you know what post was commented on by a specific user? BECAUSE OF THE COMMENT'S USERID
        //i.e. user1 recieved a comment on post1 from user2 - user1.getId(), post1.getId(), user2.getId()

        //new list of posts
        //iterate through comments

        // List<Post> postsCommentedOnBy1 = new ArrayList<>(); //creating new arraylist and assigning the result of our iteration to it; assign posts here
        // commentsFrom1.forEach(comment -> { 
        //     //the comment's postID tells us what post it is on; the post's userId tells us who commented; the user's id tells us the user who posted
        //     //comments ONLY made by user 1 = postsCommentedOnBy1
        //     //method gettingUserPosts takes in all the posts, then an Id set to a specific user, AKA parameters all posts, and id of user1
        // });

        // posts.forEach(post -> { //iterating through posts
        //     List<Comment> commentsFromPosts = gettingPostComments(comments, post.getId());
        //     //List<Comment> commentsFromPosts = comments.stream().filter(comment -> comment.getUserId() == userId).collect(Collectors.toList());
        //     //List<Post> totalPostsUserCommentedOn = new ArrayList(commentsFromPosts);
        //     //System.out.println("totalPostsUserCommentedOn: " + commentsFromPosts);
        //     //Integer totalCommentsOnPosts = commentsFromPosts.size(); //size method, returns number of elements in a listarray; sizing commentsFromPosts
        //     //System.out.println("post id: " + post.getId() + ", the comments: " + commentsFromPosts + ", total comments: " + totalCommentsOnPosts);
        // });

        //---------------------
        //trying to find all the posts each user commented on
        //find all the POSTS- end results, for each user; users.ForEach or .something, for each user we need to figure out each post
        //if comment.id = userid
        //look for any comments created by userId1
        //
        //EXAMPLE:
            //for each user, FIND all comments they made (list of comments), filter out commments so you have all their comments that they commented, filter all the post ids
            //.map for post id
            //post.foreach and FIND the post with the IDs that you have

        
        //we want to find all the posts each user commented on
        //first thing to do; LOOP through the users
        //FIND all the comments they created
        //we have all the comments the users created! each comment has a postId- can find post from postId
        //LOOP through the comments and FIND the posts for each comment.postId

        users.forEach(user -> { //anytime you do a list method, you are ITERATING through each thing
            List<Comment> eachUsersComments = comments.stream().filter(comment -> comment.getUserId() == user.getId()).collect(Collectors.toList()); //list of comments each USER made
            //filter means going from a certain size to a smaller size- only picking out CERTAIN things via requirements
            List<Integer> allThePostIds = eachUsersComments.stream().map(comment -> comment.getPostId()).collect(Collectors.toList()); //postID are the NUMBER field
            //.map returns a list the same size of what you began with
            List<Post> finalCommentedPosts = allThePostIds.stream().map(postId -> 
                posts.stream().filter(post -> post.getId() == postId).findFirst().orElse(null)
            ).collect(Collectors.toList());
            //for each POST, find the POST whose id MATCHES the id we found above
            System.out.println("user " + user.getId() + " commented on: " + finalCommentedPosts);
        });

        System.out.println("-----------NUMBER 5 DIFFERENT WAY; CALLING METHODS--------------");
        getPostsThatUsersCommentedOn(users, comments, posts);


 


    }

    private static void getPostsThatUsersCommentedOn(List<User> users, List<Comment> comments, List<Post> posts) {
        users.forEach(user -> { //anytime you do a list method, you are ITERATING through each thing
            List<Comment> eachUsersComments = gettingUsersComments(comments, user.getId()); //list of comments each USER made
            //filter means going from a certain size to a smaller size- only picking out CERTAIN things via requirements
            List<Integer> allThePostIds = eachUsersComments.stream().map(comment -> comment.getPostId()).collect(Collectors.toList()); //postID are the NUMBER field
            //.map returns a list the same size of what you began with
            List<Post> finalCommentedPosts = allThePostIds.stream().map(postId -> 
                posts.stream().filter(post -> post.getId() == postId).findFirst().orElse(null)
            ).collect(Collectors.toList());
            //for each POST, find the POST whose id MATCHES the id we found above
            System.out.println("user " + user.getId() + " commented on: " + finalCommentedPosts);
        });
        
    }


    //create method to filter out a user's posts
    private static List<Post> gettingUserPosts(List<Post> posts, Integer userId) { //passing in the list of posts and the post's userIds
        //filter through posts and pick out correct posts via userId - userId tells us WHO wrote the post
        List<Post> eachUsersPosts = posts.stream().filter(post -> post.getUserId() == userId).collect(Collectors.toList()); //putting posts into a list
        return eachUsersPosts; //returning posts that == the id of what we passed in

    }

    //create method to filter out the comments on each post
    private static List<Comment> gettingPostComments(List<Comment> comments, Integer postId) { //passing in list of comments and the comment's postIds
        //filter through comments and pick out correlated comments via postIds
        List<Comment> eachPostsComments = comments.stream().filter(comment -> comment.getPostId() == postId).collect(Collectors.toList()); 
        //iterating through list of comments, only keep comments whos post ID who matches post ID that I passed in
        //filtering passed in comment with list of comments
        return eachPostsComments; //if the postID matches the comment we pass in, it will be returned in a list

    }

    //create method to filter out all the comments a user made on any post
    private static List<Comment> gettingUsersComments(List<Comment> comments, Integer userId) {
        //filter through ALL comments and assign to list depending on who made the comments (userId)
        List<Comment> eachUsersSentComments = comments.stream().filter(comment -> comment.getUserId() == userId).collect(Collectors.toList());
        return eachUsersSentComments; //if userId matches the userId of the comment we pass in, it will be returned in a list
    }

    // private static List<User> gettingAllPostsUserCommentedOn(List<User> users) {

    // }

    


    //create method to filter out all the posts each user commented on

     
    // private static List<Post> gettingAllPostsUserCommentedOn(List<Post> posts, List<Comment> comments, Integer postId) {
    //     //filter through comments and assign to list depending on which post was commented on
    //     //we are taking each comment a user makes- target the post ID
    //     List<Post> eachPostAUserCommentedOn = posts.stream().filter(post -> post.getId() == postId).collect(Collectors.toList());
    //     return eachPostAUserCommentedOn;
    // }

}


/* 

!!!!! ANYTIME YOU HAVE A PROMPT AND NEED TO USE A METHOD/FUNCTION, MAKE IT  SEPARATE METHOD


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