public class Comment {
    
    //Comment with fields: id, text

    private Integer id;
    private String text;
    private Integer postId; //foreign key that points to post.id primary key
    private Integer userId; //foreign key that points to user.id primary key, tells us who commented

    public Comment() {
        //NO ARGS CONSTRUCTOR
        //difference between no args and all args: no args returns an empty object for you to fill
        //every property is null until you set the fields
    }

    public Comment(Integer id, String text, Integer postId, Integer userId) {
        //ALL ARGS CONSTRUCTOR
        this.id = id;
        this.text = text;
        this.postId = postId;
        this.userId = userId;
    }

    // TODO: getters and setters, toString

    //id getting and setting
    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    //text getting and setting
    public String getText() {
        return this.text;
    }
    public void setText(String text) {
        this.text = text;
    }

    //postId getting and setting
    public Integer getPostId() {
        return this.postId;
    }
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

}
