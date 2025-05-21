package com.instituto.unidad01.infraestructure.adapters.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDataRepository extends JpaRepository<StudentData, String> {
}
