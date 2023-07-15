package net.njdevel.hikingtrails;

import net.njdevel.hikingtrails.domain.Trail;
import net.njdevel.hikingtrails.repositories.TrailsRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Commit;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ComponentScan(basePackages = {"net.njdevel.hikingtrails.bootstrap"})
public class SpringDataJpaTestSlice {

    @Autowired
    TrailsRepository trailsRepository;

    @Test
    @Commit
    @Order(1)
    void testJpaTestSplice() {
        long countBefore = trailsRepository.count();

        trailsRepository.save(new Trail(4L, "Sunshine Mountain", "2 East Jersey, NJ", "2.5", "http://sunhinemountain.hike"));

        long countAfter = trailsRepository.count();

        assertThat(countBefore).isLessThan(countAfter);
    }

    @Test
    @Order(2)
    void testJpaTransactionTestSplci() {
        long count = trailsRepository.count();

        assertThat(count).isEqualTo(3);
    }
}
