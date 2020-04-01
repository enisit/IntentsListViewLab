package ibu.edu.ba.intentslistviewlab;

public class News {
    private int imageResId;
    private String title;
    private String description;

    public News(int imageResId, String title, String description) {
        this.imageResId = imageResId;
        this.title = title;
        this.description = description;
    }

    public News() {
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
