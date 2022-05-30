package com.service;

import java.util.List;

import MusicDto.MusicDto;

public interface MusicService {

    List<MusicDto> getAllById();
    MusicDto findById(String Id);
    MusicDto addMusic(MusicDto music);
    void deletMusci(String id);
    MusicDto changeTheMusic(String id, MusicDto music);  


}   
