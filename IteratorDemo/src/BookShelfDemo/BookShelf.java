package BookShelfDemo;

import service.Aggregate;
import service.Iteartor;

public class BookShelf implements Aggregate {

    // 不建议使用数组，当书的数量超过最初指定的书架容量时，就无法继续向书架中添加书本了
    private Book[] books;

    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iteartor iterator() {
        return new BookShelfIterator(this);
    }
}
