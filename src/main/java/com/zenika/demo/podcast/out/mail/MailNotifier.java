package com.zenika.demo.podcast.out.mail;

import org.springframework.stereotype.Repository;

import com.zenika.demo.podcast.Notifier;
import com.zenika.demo.podcast.PodcastEpisode;

@Repository
public class MailNotifier implements Notifier {
    @Override
    public void notifyNewEpisode(PodcastEpisode latestEpisode) {
        System.out.println("Coucou");
    }
}
