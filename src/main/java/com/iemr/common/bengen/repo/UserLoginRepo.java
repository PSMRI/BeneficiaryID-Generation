package com.iemr.common.bengen.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.common.bengen.data.user.User;

@Repository
public interface UserLoginRepo extends CrudRepository<User, Long> {

	@Query(" SELECT u FROM User u WHERE u.userID = :userID AND u.deleted = false ")
	public User getUserByUserID(@Param("userID") Long userID);

}
