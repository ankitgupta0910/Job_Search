package Repository;

import Model.Skills;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by ankitgupta on 5/27/17.
 */

@Repository
public interface SkillsRepository extends MongoRepository<Skills, String> {
}
