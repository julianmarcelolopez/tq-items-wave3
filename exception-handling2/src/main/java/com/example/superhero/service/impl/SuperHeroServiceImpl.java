package com.example.superhero.service.impl;

import com.example.superhero.entity.SuperHero;
import com.example.superhero.exception.CustomException;
import com.example.superhero.exception.NotFoundCustomException;
import com.example.superhero.repository.ISuperHeroRepository;
import com.example.superhero.service.ISuperHeroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class SuperHeroServiceImpl implements ISuperHeroService {

    @Autowired
    private ISuperHeroRepository superHeroRepository;

    public void setSuperHeroRepository(ISuperHeroRepository superHeroRepository) {
        this.superHeroRepository = superHeroRepository;
    }

    @Override
    public List<SuperHero> findAll() throws Exception {
        log.info("Find All SuperHeros...");
        List<SuperHero> superHeroList =
                superHeroRepository.findAllByActive(true);
      if (superHeroList.isEmpty()) {
        throw new CustomException("Custom Exception");
      }

        return superHeroList;
    }

    @Override
    @CacheEvict(value = "superhero", allEntries = true)
    public void deleteSuperHeroById(Integer id) throws Exception {
        log.info("Delete SuperHero Id: ".concat(id.toString()));
        SuperHero superHero = this.findById(id);
        superHero.setActive(false);

        superHeroRepository.save(superHero);
    }

    public SuperHero findById(Integer id) throws Exception {
        log.info("Get By Id...");
        Optional<SuperHero> superHeroOp =
                superHeroRepository.findByIdAndActive(id, true);

        if (!superHeroOp.isPresent()) {
            throw new NotFoundCustomException("Id: ".concat(id.toString()));
        }

        return superHeroOp.get();
    }
}
