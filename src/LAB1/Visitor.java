package LAB1;

public interface Visitor {

    void visitBook(Book b);
    void visitSection(Section s);
    //void visitTableOfContents(TableOfContents ToC);
    void visitParagraph(Paragraph p);
    void visitImageProxy(ImageProxy ip);
    void visitImage(Image i);
    void visitTable(Table t);

}
