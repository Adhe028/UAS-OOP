package UAS_OOP._AdeKurniawan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import UAS_OOP._AdeKurniawan.entity.DataMhs;

@Repository
public interface DataMhsRepo extends JpaRepository<DataMhs, String> {
}