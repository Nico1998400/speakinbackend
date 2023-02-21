package com.example.speakinbackend.repository;

import com.example.speakinbackend.entities.Audio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AudioRepository extends JpaRepository<Audio, Integer> {
    List<Audio> findAllAudioFileContaining(String containing);


}
