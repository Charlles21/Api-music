package com.Repository;



import com.model.Music;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusicRepository extends MongoRepository<Music, String> {

    Music findByCod(int Cod);
    
}
