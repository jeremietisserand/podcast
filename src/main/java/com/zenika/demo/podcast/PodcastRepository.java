package com.zenika.demo.podcast;

public interface PodcastRepository {
    PodcastEpisode get(Podcast podcast);

    void addLatestEpisode(PodcastEpisode latestEpisode);
}
