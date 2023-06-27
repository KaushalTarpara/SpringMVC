package com.codewithkd.SpringMVC;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithkd.SpringMVC.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

	List<Alien> findByAnameOrderByAid(String aname);  //Query DSL

}
