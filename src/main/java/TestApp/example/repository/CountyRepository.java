package TestApp.example.repository;

import TestApp.example.entity.County;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CountyRepository extends CrudRepository<County,Long> {


    Optional<County> findById(Long id);

    List<County> findAll();
}
