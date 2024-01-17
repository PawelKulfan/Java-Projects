package libraryCatalog;
//
public class Author extends Person {
    private String pseudonim;

    public Author(int id, String firstName, String lastName, String pseudonim) {
        super(id, firstName, lastName);
        this.pseudonim = pseudonim;
    }
    public String getAuthorInfo () {
        String authorInfo = String.format("%1$s vel. %2$s", getPersonInfo(), this.pseudonim);
        return authorInfo;
    }
}
