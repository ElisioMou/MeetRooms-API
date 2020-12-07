package one.digitalinnovation.meetrooms.repository;

import one.digitalinnovation.meetrooms.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {


}
