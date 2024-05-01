package com.TestingSurya.TestSurya.Repo;

import com.TestingSurya.TestSurya.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
}

