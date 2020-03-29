package skin;

public class Textbox extends Interaction {

    public Textbox(Color color) {
        super(color);
    }

    @Override
    public void display() {
        System.out.println(super.getStyleName()+"的"+super.color.getColorName()+"边框的文本框");
    }
}
