package com.example.speakinbackend.entities;

import jakarta.persistence.*;
@Entity
public class Audio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column()
    private int audioId;

    @Column()
    private String audioFile;

    public Audio(int audioId ,int id, String audioFile) {
        this.audioId = audioId;
        this.Id = id;
        this.audioFile = audioFile;
    }

    public Audio() {

    }
    public int getAudioId() {
        return audioId;
    }

    public int getId() {
        return Id;
    }

    public String getAudioFile() {
        return audioFile;
    }

    public void setAudioId(int audioId) {
        this.audioId = audioId;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setAudioFile(String audioFile) {
        this.audioFile = audioFile;
    }
}
