package com.example.Boutique.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Boutique.model.Boutique;

import jakarta.transaction.Transactional;
@Repository
public interface BoutiqueRep extends JpaRepository<Boutique, Integer> {
	//native
	
			@Query(value="select * from Boutique ",nativeQuery=true)
			public List<Boutique> get();
			
			@Query(value="select * from Boutique where itemNo = ?1", nativeQuery = true)
			public List<Boutique> getD(@Param("itemNo") int itemNo);
			
			@Modifying
			@Transactional
			@Query(value="update Boutique set itemNo =:itemNo where name =:name",nativeQuery=true)
			public void  update(@Param("itemNo") int itemNo,@Param("name") String name);
			
		
			@Modifying
			@Transactional
			@Query(value="delete from Boutique where itemNo=:itemNo and name =:name",nativeQuery=true)
			Integer deleteById(@Param("itemNo") int itemNo,@Param("name") String name);
			
			@Modifying
			@Transactional
			@Query(value="delete from Boutique where itemNo=:itemNo ",nativeQuery=true)
			Integer delete(@Param("itemNo") int itemNo);
			
		
		
		

			//jpql
			
			@Query(value="select c from Boutique c where itemNo =?1",nativeQuery = false)
			public List<Boutique> getDetails(@Param("itemNo") int itemNo);
			
			@Query(value="select f from Boutique f where  name like '%o'",nativeQuery = false)
			public List<Boutique> getH();
			
			@Query(value="select f from Boutique f where  itemNo between ?1 and ?2",nativeQuery=false)
			public List<Boutique> getRange(@Param("itemNo") int itemNo,@Param("itemNo") int sizes);
			
			
			@Query(value="select f from Boutique f where  name  in ('Hoodies') ",nativeQuery=false)
			public List<Boutique> getD();
	
	
	 
    
}
