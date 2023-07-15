package net.njdevel.hikingtrails.repositories;

import net.njdevel.hikingtrails.domain.Trail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrailsRepository extends JpaRepository<Trail, Long> {
}
