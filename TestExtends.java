
public class TestExtends {
    public static void main(String[] args) {
        Student student = new Student("student","16","high school");
        System.out.println(student.show());
        Undergraduate undergraduate =
                new Undergraduate("undergraduate","20","undergraduate","computer");
        System.out.println(undergraduate.show());
        Graduate graduate = new Graduate("graduate","24","graduate","computer");
        System.out.println(graduate.show());
    }
}

class Student{
    private String name;
    private String age;
    private String education;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Student(String name, String age, String education) {
        this.name = name;
        this.age = age;
        this.education = education;
    }

    public String show() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}

class Undergraduate extends Student{
    private String specialty;

    public Undergraduate(String name, String age, String education, String specialty) {
        super(name, age, education);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String show() {
        return "Undergraduate{" +
                "specialty='" + specialty + '\'' +
                "name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", education='" + getEducation() + '\''+
                '}';
    }
}

class Graduate extends Student{
    private String direction;


    public Graduate(String name, String age, String education, String direction) {
        super(name, age, education);
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String show() {
        return "Graduate{" +
                "direction='" + direction + '\'' +
                "name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", education='" + getEducation() + '\''+
                '}';
    }
}

