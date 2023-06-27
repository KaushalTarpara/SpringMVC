package com.codewithkd.SpringMVC;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.codewithkd.SpringMVC.model.Alien;

    
public interface AlienRepo extends JpaRepository<Alien, Integer>{

//	List<Alien> findByAnameOrderByAid(String aname);  //Query DSL
	
	
	@Query("from Alien where aname= :name")
	List<Alien> find(@Param("name") String aname);

}