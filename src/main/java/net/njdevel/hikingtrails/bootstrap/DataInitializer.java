package net.njdevel.hikingtrails.bootstrap;

import net.njdevel.hikingtrails.domain.Trail;
import net.njdevel.hikingtrails.repositories.TrailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final TrailsRepository trailsRepository;

    public DataInitializer(TrailsRepository trailsRepository) {
        this.trailsRepository = trailsRepository;
    }
    @Override
    public void run(String... args) throws Exception {

        Trail firstTrail = new Trail(1L, "Cornish Ruins", "1 Place Pl, New Amityville, NY", "2.4", "http://cornishruin.org");

        Trail savedFirstTrail = trailsRepository.save(firstTrail);

        Trail secondTrail = new Trail(2L, "Breakneck", "2 Place Pl, New Amityville, NY", "2.4", "http://breakneck.org");

        Trail savedsecondTrail = trailsRepository.save(secondTrail);

        trailsRepository.findAll().forEach(trail -> {
            System.out.println("Trail ID: " + trail.getId());
            System.out.println("Trail Name: " + trail.getName());
            System.out.println("Trail Address: " + trail.getAddress());
            System.out.println("Book Trail Length: " + trail.getTrailLengthInMiles());
        });

    }
}
