package com.stackroute.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MusicTrack {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int trackId;
    private String trackName;
    private String  commentsOfTrack;

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getCommentsOfTrack() {
        return commentsOfTrack;
    }

    public void setCommentsOfTrack(String commentsOfTrack) {
        this.commentsOfTrack = commentsOfTrack;
    }

}
