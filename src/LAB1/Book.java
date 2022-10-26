package LAB1;

import java.util.ArrayList;
import java.util.List;

public class Book {

    String Title;
    Author A;
    List<Chapter> C = new ArrayList<Chapter>();
    public Book(String title) {
        Title = title;

    }

    public String getTitle() {
        return Title;
    }

    public void addAuthor(Author rpGheo) {
        A = rpGheo;
    }


    public void print() {


           System.out.print("Titlu: "+ getTitle() +" Autor: ");
           A.print();


    }


    public int createChapter(String s) {
        Chapter c =new Chapter(s);
        C.add(c);
        return C.indexOf(c);
    }

    public Chapter getChapter(int indexChapterOne) {

        return C.get(indexChapterOne);
    }
}


