package org.sambasoft.repositories;

import org.sambasoft.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<Student, Long>{

}
