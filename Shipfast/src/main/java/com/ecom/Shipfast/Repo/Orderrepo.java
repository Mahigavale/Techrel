package com.ecom.Shipfast.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Shipfast.Entity.Orderentity;


@Repository
public interface Orderrepo extends JpaRepository<Orderentity, Integer> {

}
