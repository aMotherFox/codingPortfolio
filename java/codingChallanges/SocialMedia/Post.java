public class Post {
    
    //Post with fields: id, text **add userID to help group and organize

    private Integer id;
    private String text;
    private String userId;

    public Post() {
        //NO ARGS CONSTRUCTOR
        //difference between no args and all args: no args returns an empty object for you to fill
        //every property is null until you set the fields
    }

    public Post(Integer id, String text, String userId) {
        //ALL ARGS CONSTRUCTOR
        this.id = id;
        this.text = text;
        this.userId = userId;
    }
}
