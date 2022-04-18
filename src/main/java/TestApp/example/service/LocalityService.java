package TestApp.example.service;

import TestApp.example.entity.County;
import TestApp.example.entity.Locality;
import TestApp.example.repository.CountyRepository;
import TestApp.example.repository.LocalityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalityService {


    private static final Logger log = LoggerFactory.getLogger(CountyService.class);

    private final LocalityRepository localityRepository;

    @Autowired
    public LocalityService(LocalityRepository localityRepository){
        this.localityRepository= localityRepository;
    }


    public void save(Locality newLocality){
        log.info("saving task");
        localityRepository.save(newLocality);
    }

    public List<Locality> findAll(){
        return localityRepository.findAll();
    }

    public Locality findById(Long id){
        log.info("finding by id");
        return LocalityRepository.findById(id).orElseThrow(()->new RuntimeException("County could not be found"));
    }
}
