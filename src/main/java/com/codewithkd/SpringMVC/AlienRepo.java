package com.codewithkd.SpringMVC;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithkd.SpringMVC.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

}
