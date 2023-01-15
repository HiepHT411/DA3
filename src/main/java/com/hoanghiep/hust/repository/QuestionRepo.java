package com.hoanghiep.hust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hoanghiep.hust.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}