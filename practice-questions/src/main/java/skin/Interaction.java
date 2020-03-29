package skin;

public abstract class Interaction implements Skin {

    private String styleName;

    protected Color color;

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }


    public Interaction(Color color) {
        this.color = color;
    }
}
