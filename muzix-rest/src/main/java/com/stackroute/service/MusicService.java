package com.stackroute.service;

import com.stackroute.domain.MusicTrack;
import com.stackroute.exceptions.TrackAlreadyExists;
import com.stackroute.exceptions.TrackNotFoundException;

import java.util.List;
import java.util.Optional;

public interface MusicService {

    public MusicTrack saveTrack(MusicTrack music) throws TrackAlreadyExists;

    public List<MusicTrack> displayTracks();

    public MusicTrack updateComments(int id,MusicTrack music) throws TrackNotFoundException;

    public Optional deleteById(int id) throws TrackNotFoundException;

}
