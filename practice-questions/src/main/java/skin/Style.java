package skin;

import java.util.List;

public class Style implements Skin {

    private String styleName;

    List<Interaction> skinList;

    public Style(String styleName, List<Interaction> skinList) {
        this.styleName = styleName;
        this.skinList = skinList;
        for (Interaction interaction : skinList) {
            interaction.setStyleName(styleName);
        }
    }

    public void display(){
        System.out.println(styleName);
        for (Skin skin : skinList) {
            skin.display();
        }
    }

}
