/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entity.Student;

/**
 *
 * @author kesao
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "ClassEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }
    @RolesAllowed("teacher")
    @Override
    public void createStudent(Student student) {
      create(student);
    }

    @RolesAllowed("teacher")
    @Override
    public void editStudent(Student student) {
      edit(student);
    }

    @RolesAllowed("teacher")
    @Override
    public void removeStudent(Student student) {
       remove(student);
    }

    @RolesAllowed("teacher")
    @Override
    public Student findStudent(Object id) {
        
      Student targetStudent = find(id);
      return targetStudent;
        
    }
     @RolesAllowed({"teacher","student"})
    @Override
    public List<Student> findAllStudents() {
       
     List<Student> list = findAll();
     return list;
             
    }
    
}
