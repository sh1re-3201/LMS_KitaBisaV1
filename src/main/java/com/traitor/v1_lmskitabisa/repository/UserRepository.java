package com.traitor.v1_lmskitabisa.repository;

import com.traitor.v1_lmskitabisa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
