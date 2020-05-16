package com.gmail.goyter012.studcity.repo;

import com.gmail.goyter012.studcity.model.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepo extends CrudRepository<Group, Long> {
    List<Group> findAllByCipher(String cipher);
}