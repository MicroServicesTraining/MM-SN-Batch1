/**
 * 
 */
package com.servicenow.repositories;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.servicenow.entities.UserInfo;

import java.util.Optional; 

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> { 
	Optional<UserInfo> findByName(String username); 
}
