package com.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.Repository.MusicRepository;
import com.model.Music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MusicDto.MusicDto;




@Service
public class MusicServiceIMPL  implements MusicService{

    @Autowired
    private MusicRepository repository;

    private ModelMapper mapper = new ModelMapper();


    @Override
    public List<MusicDto> getAllById() {
        List<Music> music = repository.findAll();


        return  music.stream()
        .map(m -> mapper.map(m, MusicDto.class))
        .collect(Collectors.toList());
    }

    @Override
    public MusicDto findById(String Id) {

        Optional<Music> music = repository.findById(Id);

    if (music.isPresent()) {
      return mapper.map(music.get(), MusicDto.class);
    }
    return null;
    }

    @Override
    public MusicDto addMusic(MusicDto music) {

        Music MusicSave = mapper.map(music, Music.class);

        repository.save(MusicSave);
        return mapper.map(MusicSave, MusicDto.class);
    }

    @Override
    public void deletMusci(String id) {

        Music MusicSave = mapper.map(id, Music.class);

        repository.save(MusicSave);
        return mapper.map(MusicSave, MusicDto.class);
        
    }

    @Override
    public MusicDto changeTheMusic(String id, MusicDto music) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
