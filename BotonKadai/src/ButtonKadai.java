
import java.awt.*;

public class ButtonKadai extends Frame {
    public static void main(String [] args) {
        new ButtonKadai();
    }
    ButtonKadai() {
        super("�J�}�L���A�v��!!!!!");
        setSize(400, 200);
        setLayout(new BorderLayout());
        Label l1 = new Label("�J�}�L��RPG");
        Button b2 = new Button("���ֈړ�����");
        Label l3 = new Label("JAVA�A�v��������");
        Button b4 = new Button("���ֈړ�����");
        Button b5 = new Button("�X�e�[�^�X");

        add("North", l1);
        add("East", b2);
        add("South", l3);
        add("West", b4);
        add("Center", b5);

        show();
    }
}
