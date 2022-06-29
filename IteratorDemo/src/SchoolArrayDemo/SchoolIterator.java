package SchoolArrayDemo;

import service.Iteartor;

public class SchoolIterator implements Iteartor {

    private School school;

    private int index;

    public SchoolIterator(School school){
        this.school = school;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < school.getSize();
    }

    @Override
    public Object next() {
        Student student = school.getStudent(index);
        index++;
        return student;
    }
}
