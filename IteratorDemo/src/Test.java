import BookShelfDemo.Book;
import BookShelfDemo.BookShelf;
import SchoolArrayDemo.School;
import SchoolArrayDemo.Student;
import service.Iteartor;

public class Test {
    public static void main(String[] args){
        // bookShelfTest();
        schoolTest();
    }

    /**
     * 测试书架
     */
    public static void bookShelfTest(){
        BookShelf shelf = new BookShelf(4);
        shelf.appendBook(new Book("Test1"));
        shelf.appendBook(new Book("Test2"));
        shelf.appendBook(new Book("Test3"));
        shelf.appendBook(new Book("Test4"));
        // shelf.appendBook(new Book("Test5")); // ArrayIndexOutOfBoundsException

        // 不用BookShelf.for，这里的while循环并不依赖于BookShelf，
        Iteartor it = shelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }

    public static void schoolTest(){
        School school = new School();
        school.addStudent(new Student("学生A"));
        school.addStudent(new Student("学生B"));
        school.addStudent(new Student("学生C"));

        Iteartor it = school.iterator();
        while (it.hasNext()){
            Student next = (Student)it.next();
            System.out.println(next.getStuName());
        }
    }
}
