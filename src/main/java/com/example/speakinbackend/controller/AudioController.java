package com.example.speakinbackend.controller;

import com.example.speakinbackend.dto.AudioResponse;
import com.example.speakinbackend.entities.Audio;
import com.example.speakinbackend.services.AudioService;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController

@RequestMapping("/audio")
public class AudioController {

    private final AudioService audioService;

    public AudioController(AudioService audioService) {
        this.audioService = audioService;
    }

    @GetMapping
    public List<AudioResponse> findAll(@RequestParam (required = false,defaultValue = "") String usrcont){
        return audioService.findAllAudioFile(usrcont);
    }

    @PostMapping("/post")
    public Audio addAudioFile(@RequestBody Audio audio){
        return audioService.addAudioFile(audio);
    }

    @GetMapping("/{id}")
    public Audio findAudioFileById(@PathVariable int id) {
        return audioService.findAudioFileById(id);
    }
}
