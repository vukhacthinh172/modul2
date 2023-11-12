package bai15.Service;

import bai15.Model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {
    List<Student> studentList ;
    public  void StudentManagement(){
      studentList= new ArrayList<>();
    }
    //phương thức hiển thị tất cả trong student
    public  List<Student> showAll(){
        return studentList ;
    }
    // thêm học sinh
    public  void   addStudent(Student student){
        studentList.add(student) ;
    }
    //tìm theo id
    public  Student findId(int id){
        for (int i = 0; i <studentList.size() ; i++) {
            Student student = studentList.get(i);
            if (student.getStudentId()==id){
                return student ;
            }
        }
        return null ;
    }
    // xóa sinh viên
    public  void   removeStudent(int studentId){
        studentList.remove(findId(studentId));
    }
 // tìm kiếm sinh viên theo id
    public Student findStudentById(int studentId){
        for (int i = 0; i <studentList.size() ; i++) {
            Student student = studentList.get(i);
            if (student.getStudentId()==studentId){
                return student ;
            }
        }
        return  null;
    }
    //tính điểm trung bình của tất cả học sinh
    public Double getAverageScore(){
       if (studentList.isEmpty()){
           return 0.0 ;
       }else {
           double totalScore = 0.0;
           for (int i = 0; i <studentList.size() ; i++) {
               Student student = studentList.get(i);
                     totalScore+= student.getScore();
           }
           return totalScore / studentList.size();
       }
    }
    public void sortByScore(){
        Collections.sort(studentList, Comparator.comparingDouble(Student::getScore));
    }
}
