package com.TestingSurya.TestSurya.Repo;

import com.TestingSurya.TestSurya.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
}
