package com.nishaka.nmj.External.repository;


import com.nishaka.nmj.Domain.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository <Student ,Integer> {
    Optional<Student>findByName(String name);


}
