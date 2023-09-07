package org.example.calories.repo;

import org.example.calories.models_entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository <Users, Long>{
//    @Query(nativeQuery = true, value = )
}
