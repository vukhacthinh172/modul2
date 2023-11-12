package bai15.Model;

public class Student {
    private int studentId ;
    private String name ;
    private Double averageScore ;

    public Student() {
    }

    public Student(int studentId, String name, Double averageScore) {
        this.studentId = studentId;
        this.name = name;
        this.averageScore = averageScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }
    public double getScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
