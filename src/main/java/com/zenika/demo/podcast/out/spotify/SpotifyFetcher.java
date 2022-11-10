package com.zenika.demo.podcast.out.spotify;

import org.springframework.stereotype.Repository;

import com.zenika.demo.podcast.Podcast;
import com.zenika.demo.podcast.PodcastEpisode;
import com.zenika.demo.podcast.PodcastFecther;

@Repository
public class SpotifyFetcher implements PodcastFecther {

    @Override
    public PodcastEpisode get(Podcast podcast) {
        return new PodcastEpisode(podcast.name());
    }
}
