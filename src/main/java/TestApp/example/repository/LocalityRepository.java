package TestApp.example.repository;

import TestApp.example.entity.Locality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocalityRepository extends CrudRepository<Locality,Long> {

    Optional<Locality>findById(Long id);

    List<Locality>findAll();
}
