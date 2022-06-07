public class Comment {
    
    //Comment with fields: id, text

    private Integer id;
    private String text;

    public Comment() {
        //NO ARGS CONSTRUCTOR
        //difference between no args and all args: no args returns an empty object for you to fill
        //every property is null until you set the fields
    }

    public Comment(Integer id, String text) {
        //ALL ARGS CONSTRUCTOR
        this.id = id;
        this.text = text;
    }

}
