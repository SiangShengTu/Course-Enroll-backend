package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Course;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    //根据SpringDataJPA的命名规则声明函数，hibernate就会根据函数的名字来生成相应的sql command
    Optional<Course> findByCourseName(String courseName);
}
