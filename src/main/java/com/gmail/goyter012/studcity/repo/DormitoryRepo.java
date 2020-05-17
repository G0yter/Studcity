package com.gmail.goyter012.studcity.repo;

import com.gmail.goyter012.studcity.model.Dormitory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DormitoryRepo extends CrudRepository<Dormitory,Long> {
    List<Dormitory> findAllByDormNumber(Integer dormNumber);
}
