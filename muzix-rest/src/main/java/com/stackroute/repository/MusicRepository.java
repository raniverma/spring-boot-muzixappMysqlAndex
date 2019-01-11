package com.stackroute.repository;

import com.stackroute.domain.MusicTrack;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends CrudRepository<MusicTrack, Integer> {

    //CRUD operation are done without using any line of code here.
   // @Query
   // public List<MusicTrack> findByNameAndAge();

}
