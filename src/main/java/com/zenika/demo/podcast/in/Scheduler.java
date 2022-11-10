package com.zenika.demo.podcast.in;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.zenika.demo.podcast.Podcast;
import com.zenika.demo.podcast.PodcastService;

@Service
public class Scheduler {

    private final PodcastService podcastService;

    public Scheduler(PodcastService podcastService) {
        this.podcastService = podcastService;
    }

    @Scheduled(fixedDelay = 1000)
    void trigger() {
        podcastService.orchestrate(new Podcast("test"));
    }
}
