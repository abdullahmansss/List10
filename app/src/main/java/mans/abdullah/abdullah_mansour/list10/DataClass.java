package mans.abdullah.abdullah_mansour.list10;

public class DataClass
{
    private int image_url;
    private String name,number;

    public DataClass(int image_url, String name, String number) {
        this.image_url = image_url;
        this.name = name;
        this.number = number;
    }

    public int getImage_url() {
        return image_url;
    }

    public void setImage_url(int image_url) {
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
