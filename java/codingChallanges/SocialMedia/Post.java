import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;

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

    // TODO: getters and setters, toString
}
