package com.apprentice.demo.repository;

import com.apprentice.demo.domain.Address;
import com.apprentice.demo.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Collection;
import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
//    SELECT addresses.street, addresses.`number`, courses.subject
//    FROM addresses
//    JOIN users on users.address_id = addresses.id
//    JOIN users_courses on users.id = users_courses.user_id
//    JOIN courses on courses.id = users_courses.course_id
//    WHERE courses.id = 2;
//@Query("SELECT u FROM User u WHERE u.status = 1")
//Collection<User> findAllActiveUsers();
    @Query("")
    public List<Address> getAddressesByCourseID(int id);
}
