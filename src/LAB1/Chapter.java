package LAB1;

import java.util.ArrayList;
import java.util.List;

public class Chapter {

    String Name;
    List<SubChapter> Sc = new ArrayList<SubChapter>();
    public Chapter(String name) {
        Name = name;
    }

    public int createSubChapter(String s) {
        SubChapter sc =new SubChapter(s);
        Sc.add(sc);
        return Sc.indexOf(sc);
    }
    public SubChapter getSubChapter(int indexSubChapterOneOne) {

               return Sc.get(indexSubChapterOneOne);


    }
    public void print() {


        System.out.print("Nume: "+ Name );


    }



}
