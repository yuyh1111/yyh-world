package SchoolArrayDemo;

import service.Aggregate;
import service.Iteartor;

import java.util.ArrayList;
import java.util.List;

public class School implements Aggregate {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public Integer getSize(){
        return students.size();
    }

    public Student getStudent(int index){
        return students.get(index);
    }

    @Override
    public Iteartor iterator() {
        return new SchoolIterator(this);
    }
}
