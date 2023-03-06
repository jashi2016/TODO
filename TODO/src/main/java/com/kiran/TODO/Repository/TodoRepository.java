package com.kiran.TODO.Repository;

import com.kiran.TODO.Model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<ToDo, Integer> {
}