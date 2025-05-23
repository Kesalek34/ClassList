/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entity.Student;

/**
 *
 * @author kesao
 */
@Local
public interface StudentFacadeLocal {

    void createStudent(Student student);

    void editStudent(Student student);

    void removeStudent(Student student);

    Student findStudent(Object id);

    List<Student> findAllStudents();

    List<Student> findRange(int[] range);

    int count();
    
}
