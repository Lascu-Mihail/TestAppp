package TestApp.example.Repository;

import TestApp.example.Entity.County;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountyRepository extends CrudRepository<County,Long> {



}
