package com.zenika.demo.podcast;

import org.springframework.stereotype.Service;

@Service
public class PodcastService {

    private final PodcastFecther podcastFetcher;
    private final PodcastRepository podcastRepository;
    private final Notifier notifier;

    public PodcastService(PodcastFecther podcastFetcher, PodcastRepository podcastRepository, Notifier notifier) {
        this.podcastFetcher = podcastFetcher;
        this.podcastRepository = podcastRepository;
        this.notifier = notifier;
    }

    public void orchestrate(Podcast podcast) {
        PodcastEpisode latestEpisode = podcastFetcher.get(podcast);
        PodcastEpisode existingEpisode = podcastRepository.get(podcast);
        if (latestEpisode.isNewerThan(existingEpisode)) {
            podcastRepository.addLatestEpisode(latestEpisode);
            notifier.notifyNewEpisode(latestEpisode);
        }
    }

}
