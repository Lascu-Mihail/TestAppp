package TestApp.example.Repository;

import TestApp.example.Entity.Locality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalityRepository extends CrudRepository<Locality,Long> {

}
