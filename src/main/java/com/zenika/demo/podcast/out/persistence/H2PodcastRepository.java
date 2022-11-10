package com.zenika.demo.podcast.out.persistence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zenika.demo.podcast.Podcast;
import com.zenika.demo.podcast.PodcastEpisode;
import com.zenika.demo.podcast.PodcastRepository;

@Repository
public class H2PodcastRepository implements PodcastRepository {
    List<PodcastEpisode> episodes = new ArrayList<>();

    @Override
    public PodcastEpisode get(Podcast podcast) {
        if (episodes.size() == 0) {
            return null;
        }
        return episodes.get(episodes.size() - 1);
    }

    @Override
    public void addLatestEpisode(PodcastEpisode latestEpisode) {
        episodes.add(latestEpisode);
    }
}
