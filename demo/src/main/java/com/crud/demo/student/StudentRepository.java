package com.crud.demo.student;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// data access Layer
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // SELECT * FROM student WHERE email = ?
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);

    // @Query("UPDATE student s SET name = ?2, email = ?3, dob = ?4 WHERE s.id =
    // ?1")
    // void updateStudent(Long id, String name, String email, LocalDate dob);

}