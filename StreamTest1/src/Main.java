import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//public class Main
//{
//    public static void main(String[] args)
//    {
////        System.out.println(stream.collect(Collectors.toList()));
////        stream.distinct();
////        System.out.println(stream.collect(Collectors.toList()));
//
//    }
//}

class Grouping
{
    public static void main(String[] args)
    {
        Student st1 = new Student(5,1,19);
        Student st2 = new Student(3,3,19);
        Student st3 = new Student(1,2,21);
        Student st4 = new Student(2,2,20);
        Student st5 = new Student(3,1,21);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
//        System.out.println(students);
//        int[] arr = {1,2,3,4,5,6,7,8,4,3};
//        Stream stream = Stream.of(1,2,3,4,5,6,7,8,4,3);
//        stream.forEach(el -> {
//            System.out.println(el);});
//        students.stream().forEach(el-> {el.setAge(el.getAge()+1);});

        Student result = students.stream().filter(el->el.getAge()>19).min((a,b)->a.getGrade()-b.getGrade()).get();
        System.out.println(result);

    }
}
class Student
{
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int grade, int course, int age) {
        this.grade = grade;
        this.course = course;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", course=" + course +
                ", age=" + age +
                "}\n";
    }

    int grade;
    int course;
    int age;
}
