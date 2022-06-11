public class Post {
    
    //Post with fields: id, text **add userID to help group and organize

    private Integer id; //HAS to be unique, primary id/key
    private String text;
    private Integer userId; //foreign key, reusable, FILTER to get correct posts 

    public Post() {
        //NO ARGS CONSTRUCTOR
        //difference between no args and all args: no args returns an empty object for you to fill
        //every property is null until you set the fields
    }

    public Post(Integer id, String text, Integer userId) {
        //ALL ARGS CONSTRUCTOR
        this.id = id;
        this.text = text;
        this.userId = userId;
    }



    //id getting and setting
    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    //firstName getting and setting
    public String getText() {
        return this.text;
    }
    public void setText(String text) {
        this.text = text;
    }

    //lastName getting and setting
    public Integer getUserId() {
        return this.userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String toString() {
        return "Post: {id: " + id
        + ", text: " + text
        + ", userId: " + userId + "}";
    }
}
