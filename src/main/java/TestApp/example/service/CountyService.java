package TestApp.example.service;

import TestApp.example.entity.County;
import TestApp.example.repository.CountyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service
public class CountyService {

    private static final Logger log = LoggerFactory.getLogger(CountyService.class);

    private final CountyRepository countyRepository;

    @Autowired
    public CountyService(CountyRepository countyRepository){
        this.countyRepository= countyRepository;
    }


    public void save(County newCounty){
        log.info("saving task");
        countyRepository.save(newCounty);
    }

    public List<County> findAll(){
        return countyRepository.findAll();
    }

    public County findById(Long id){
        log.info("finding by id");
        return countyRepository.findById(id).orElseThrow(()->new RuntimeException("County could not be found"));
    }
}
