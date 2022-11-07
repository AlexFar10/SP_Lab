package LAB1;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element {
    String Text;
    List<Element> L = new ArrayList();

    public Paragraph(String text) {
        Text = text;
    }

    @Override
    public void add(Element e) {

        L.add(e);
    }

    @Override
    public Element get(int n) {
        Element e = null;
        for (int i = 0; i < L.size(); i++) {
            if (i == n)
                e = L.get(i);
            break;
        }
        return e;
    }

    @Override
    public void remove(Element e) {
        for (int i = 0; i < L.size(); i++) {
            if (L.get(i) == e)
                L.remove(e);
        }

    }

    @Override
    public void print() {
        System.out.println(Text);
    }
}
