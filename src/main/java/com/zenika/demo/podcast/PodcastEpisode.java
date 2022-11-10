package com.zenika.demo.podcast;

public record PodcastEpisode(String name) {

    public boolean isNewerThan(PodcastEpisode existingEpisode) {
        return true;
    }
}
