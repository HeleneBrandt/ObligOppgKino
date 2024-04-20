package kinoprogram.kinooblig;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository <Booking, Long>  {

}
