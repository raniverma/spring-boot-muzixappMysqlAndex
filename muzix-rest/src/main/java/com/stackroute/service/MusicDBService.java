package com.stackroute.service;

import com.stackroute.domain.MusicTrack;
import com.stackroute.exceptions.TrackAlreadyExists;
import com.stackroute.exceptions.TrackNotFoundException;
import com.stackroute.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicDBService implements MusicService{

    @Autowired
    private MusicRepository musicRepository;


    public MusicTrack saveTrack(MusicTrack music) throws TrackAlreadyExists {
        if(musicRepository.existsById(music.getTrackId())){
            throw new TrackAlreadyExists("This Track already exists");
        }

        MusicTrack music1 = musicRepository.save(music);
        return music1;
    }

    public List<MusicTrack> displayTracks() {
        List<MusicTrack> musicTracks = (List<MusicTrack>) musicRepository.findAll();
        return musicTracks;
    }


    @Override
    public Optional deleteById(int id) throws TrackNotFoundException {
        if(musicRepository.existsById(id))
            musicRepository.deleteById(id);
        else {
            throw new TrackNotFoundException("Track not found");
        }
        Optional<MusicTrack> track = musicRepository.findById(id);
        return track;
    }

    @Override
    public MusicTrack updateComments(int id,MusicTrack music) throws TrackNotFoundException {
        MusicTrack updatedtrack;
        if(musicRepository.existsById(id)){
            updatedtrack = musicRepository.save(music);
        }
        else {
            throw new TrackNotFoundException("Track not found");
        }
        return updatedtrack;
    }

}
