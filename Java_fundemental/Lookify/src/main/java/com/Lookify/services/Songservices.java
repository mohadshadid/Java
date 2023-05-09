package com.Lookify.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Lookify.models.Song;
import com.Lookify.repositories.SongRepository;


@Service
public class Songservices {
    // adding the book repository as a dependency
    private final SongRepository SongRepository;
    
    public Songservices(SongRepository SongRepository) {
        this.SongRepository = SongRepository;
    }
    // returns all the books
    public List<Song> allSonge() {
        return SongRepository.findAll();
    }
    // creates a book
    public Song createSonge(Song b) {
        return SongRepository.save(b);
    }
    // retrieves a book
    public Song findSong(Long id) {
        Optional<Song> optionalSong = SongRepository.findById(id);
        if(optionalSong.isPresent()) {
            return optionalSong.get();
        } else {
            return null;
        }
    }

    
    public Song UpdateSongs(Song x) {
        return SongRepository.save(x);
    }
    public void deletSongs(long id) {
    	SongRepository.deleteById(id);
    }
    

}
