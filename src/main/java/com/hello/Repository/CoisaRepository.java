package com.hello.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hello.model.Coisa;

@Repository
public interface CoisaRepository extends JpaRepository<Coisa, Long>{
	
	ArrayList<Coisa> findAll();
	
}
