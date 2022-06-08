import java.util.List;

public class Post2 {
    
    //Post with fields: id, text **add userID to help group and organize

    private Integer id; //HAS to be unique, primary id/key
    private String text;
    private List<Comment2> comments;

    public Post2() {
        //NO ARGS CONSTRUCTOR
        //difference between no args and all args: no args returns an empty object for you to fill
        //every property is null until you set the fields
    }

    public Post2(Integer id, String text, List<Comment2> comments) {
        //ALL ARGS CONSTRUCTOR
        this.id = id;
        this.text = text;
        this.comments = comments;
    }

    // TODO: getters and setters, toString

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

    //comments getting and setting
    public List<Comment2> getComments() {
        return this.comments;
    }
    public void setComments(List<Comment2> comments) {
        this.comments = comments;
    }
    

    
}
