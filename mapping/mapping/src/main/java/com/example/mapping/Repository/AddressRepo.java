package com.example.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.Entity.AddressEntity;

public interface AddressRepo extends JpaRepository<AddressEntity, Integer> {
	

}
