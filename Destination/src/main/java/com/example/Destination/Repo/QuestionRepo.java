package com.example.Destination.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Destination.Model.Question;

import jakarta.transaction.Transactional;

public interface QuestionRepo extends JpaRepository<Question, Integer> {
	
	
	@Query
	(value="select * from Question where qno=?1", nativeQuery = true)
	public List<Question> getD(@Param("qno")int qno);

	@Query(value="select * from Car",nativeQuery = true)
	public List<Question> get();

	@Modifying
	@Transactional
	@Query(value="update Question set qno =:qno where qname =:qname",nativeQuery=true)
	public void  update(@Param("qno") int sno,@Param("qname") String company);

	
	@Modifying
	@Transactional
	@Query(value="delete from question where qno=:qno and qname=:qname",nativeQuery=true)

	Integer deleteById(@Param("qno") int pno,@Param("qname") String company);
	

	
	@Query(value="select c from Question c where qno =?1",nativeQuery = false)
	public List<Question> getDetails(@Param("qno") int qno);
	
	@Query(value="select f from Question f where  qname like '%i'",nativeQuery = false)
	public List<Question> getH();
	
	@Query(value="select f from Question f where  qno between ?1 and ?2",nativeQuery=false)
	public List<Question> getRange(@Param("firmno") int qno,@Param("qno") int qid);

	
	
	


}


