package LAB1;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {

    String Name;
    List<Paragraph> P = new ArrayList<Paragraph>();
    List<Image> I = new ArrayList<Image>();
    List<Table> T = new ArrayList<Table>();

    public SubChapter(String name) {
        Name = name;
    }

    public void createNewParagraph(String s) {

        Paragraph p = new Paragraph(s);
        P.add(p);


    }

    public void createNewImage(String s) {
        Image i = new Image(s);
        I.add(i);
    }

    public void createNewTable(String s) {
        Table t = new Table(s);
        T.add(t);
    }
    public void print() {


        System.out.print(" Nume: "+ Name );
        System.out.print(" \nParagrafe: ");
        for (Paragraph paragraph: P) {
            paragraph.print();
        }
        System.out.print(" \nImagini: ");
        for (Image image: I) {
            image.print();
        }
        System.out.print(" \nTabele: ");
        for (Table table: T) {
            table.print();
        }

    }


}
