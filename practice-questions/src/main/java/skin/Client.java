package skin;

import java.util.Arrays;

public class Client {


    public static void main(String[] args) {
        //叶子节点
        Color color1 = new Color("浅绿色");
        Color color2 = new Color("绿色");
        Color color3 = new Color("浅蓝色");
        Color color4 = new Color("蓝色");

        Interaction button1 = new Button(color1);
        Interaction button2 = new Button(color3);

        Interaction comboBox1 = new ComboBox(color2);
        Interaction comboBox2 = new ComboBox(color4);

        Interaction textbox1 = new Textbox(color2);
        Interaction textbox2 = new Textbox(color4);

        //进行组合
        Skin style1 = new Style("spring", Arrays.asList(button1,comboBox1,textbox1));
        Skin style2 = new Style("Summer", Arrays.asList(button2,comboBox2,textbox2));

        style1.display();
        style2.display();

    }
}
