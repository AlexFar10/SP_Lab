package LAB1;

public class Book {

    String Name;
    String Paragraph;
    String Image;
    String Table;

    public Book(String name) {
        Name = name;

    }

    public String getName() {
        return Name;
    }


    public void createNewParagraph(String paragraph) {
        Paragraph = paragraph;

    }

    public void createNewImage(String image) {
         Image = image;
    }

    public void createNewTable(String table) {
         Table = table;
    }

    public String getP() {
        return Paragraph;
    }
    public String getI() {
        return Image;
    }
    public String getT() {
        return Table;
    }


    public void print() {


           System.out.print("Nume: "+ getName() + ", Paragraf: " + getP() +", Imagine: " +getI() +", Tabel: "+ getT());


    }
}


