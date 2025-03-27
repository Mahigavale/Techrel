package com.example.mapping.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mapping.Entity.School;

@Repository
public interface Schoolrepo extends JpaRepository<School, Integer> {
	
	
	
	@Query(value="select * from school_table where school_name= :nm",nativeQuery = true)
	public List<School> getbyName(@Param("nm") String nm);

}
