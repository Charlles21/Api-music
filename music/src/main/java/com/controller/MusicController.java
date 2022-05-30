package com.controller;

import java.util.List;

import com.service.MusicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import MusicDto.MusicDto;


@RestController
@RequestMapping("/musics")
public class MusicController {

 @Autowired
 private MusicService service;
 
 @GetMapping
 public  List<MusicDto> getAllById(){
    return service.getAllById();    

 }

 
    
}
