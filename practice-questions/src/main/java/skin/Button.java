package skin;

public class Button extends Interaction {


    public Button(Color color) {
        super(color);
    }

    @Override
    public void display() {
        System.out.println(super.getStyleName()+"的"+super.color.getColorName()+"的按钮");
    }
}
