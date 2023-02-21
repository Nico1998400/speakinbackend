package com.example.speakinbackend.services;

import com.example.speakinbackend.dto.AudioRequest;
import com.example.speakinbackend.dto.AudioResponse;
import com.example.speakinbackend.entities.Audio;
import com.example.speakinbackend.repository.AudioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AudioService {

    private final AudioRepository audioRepository;

    public AudioService(AudioRepository audioRepository) {
        this.audioRepository = audioRepository;
    }

    public List<AudioResponse> findAllAudioFile(String contains) {
        return audioRepository
                .findAllAudioFileContaining(contains)
                .stream()
                .map(audio -> new AudioResponse(audio.getAudioId(), audio.getId(), audio.getAudioFile()))
                .toList();
    }

    public Audio addAudioFile(Audio audioRequest) {
       return audioRepository.save(audioRequest);
    }

    public Audio findAudioFileById(int id) {
        return audioRepository.findById(id).orElseThrow();
    }
}
