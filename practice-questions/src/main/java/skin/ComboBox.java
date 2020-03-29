package skin;

public class ComboBox extends Interaction {


    public ComboBox(Color color) {
        super(color);
    }

    @Override
    public void display() {
        System.out.println(super.getStyleName()+"的"+super.color.getColorName()+"边框的组合框");
    }
}
