
import java.awt.*;

public class ButtonKadai extends Frame {
    public static void main(String [] args) {
        new ButtonKadai();
    }
    ButtonKadai() {
        super("カマキリアプリ");
        setSize(400, 200);
        setLayout(new BorderLayout());
        Label l1 = new Label("カマキリRPG");
        Button b2 = new Button("東へ移動する");
        Label l3 = new Label("JAVAアプリ研究会");
        Button b4 = new Button("西へ移動する");
        Button b5 = new Button("ステータス");

        add("North", l1);
        add("East", b2);
        add("South", l3);
        add("West", b4);
        add("Center", b5);

        show();
    }
}
