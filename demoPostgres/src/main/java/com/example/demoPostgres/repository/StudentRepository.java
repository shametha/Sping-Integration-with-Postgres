package com.example.demoPostgres.repository;
import com.example.demoPostgres.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
    List<Student> findByFirstName(String firstName);
    List<Student> findByFirstNameAndLastName(String firstName, String lastName);
    //@Query(value ="select count(1) from student where firstName = :firstName") -- native query use no underscore
    @Query(value ="select count(1) from Student where first_name = ?1",nativeQuery=true)
    int countStudent(String firstName);

}
