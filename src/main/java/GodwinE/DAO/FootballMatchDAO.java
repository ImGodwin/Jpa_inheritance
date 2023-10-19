package GodwinE.DAO;

import GodwinE.entities.Event;
import GodwinE.entities.FootballMatch;
import GodwinE.entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.UUID;

public class FootballMatchDAO {

    private final EntityManager entityManagerFactory;

    public FootballMatchDAO(EntityManager entityManager)
    {
        this.entityManagerFactory = entityManager;
    }

    public void save(FootballMatch football)
    {
        EntityTransaction transaction = entityManagerFactory.getTransaction();
        transaction.begin();

        entityManagerFactory.persist(football);
        transaction.commit();
        System.out.println("New event saved created successfully");
    }

    public Event getById(UUID id)
    {
        return entityManagerFactory.find(Event.class, id);
    }

    public void delete(UUID id)
    {
        Event found = entityManagerFactory.find(Event.class, id);

        if(found != null){
            EntityTransaction transaction = entityManagerFactory.getTransaction();

            transaction.begin();
            entityManagerFactory.remove(found);

            transaction.commit();
            System.out.println("The event was deleted successfully");
        }else{
            System.out.println(id + " not found");
        }
    }
}
