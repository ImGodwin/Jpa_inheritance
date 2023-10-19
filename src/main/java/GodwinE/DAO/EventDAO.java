package GodwinE.DAO;

import GodwinE.entities.Concert;
import GodwinE.entities.Event;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.UUID;

public class EventDAO {

    private final EntityManager entityManagerFactory;

    public EventDAO(EntityManager entityManager)
    {
        this.entityManagerFactory = entityManager;
    }

    public void save(Event event)
    {
        EntityTransaction transaction = entityManagerFactory.getTransaction();
        transaction.begin();

        entityManagerFactory.persist(event);
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

    public List<Concert> getConcertInStreaming(boolean result)
    {
        TypedQuery<Concert> getConcertQuery = entityManagerFactory.createQuery("SELECT concert FROM Concert WHERE state = :result", Concert.class);
        return getConcertQuery.getResultList();
    }

    public List<Concert> getConcertInStreaming(String genre)
    {
        TypedQuery<Concert> getConcertiPerGenere = entityManagerFactory.createQuery("SELECT concert FROM Concert WHERE genre = :genre", Concert.class);
        return getConcertiPerGenere.getResultList();
    }
}
