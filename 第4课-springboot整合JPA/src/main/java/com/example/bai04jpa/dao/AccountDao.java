package com.example.bai04jpa.dao;

import com.example.bai04jpa.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account, Integer> {


}
