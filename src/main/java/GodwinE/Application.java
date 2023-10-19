package GodwinE;

import GodwinE.DAO.EventDAO;
import GodwinE.entities.Event;
import GodwinE.entities.EventType;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.UUID;

import static GodwinE.entities.JpaUtil.getEntitiManagerFactory;

public class Application {

    public static void main(String[] args)
    {
        EntityManager em = getEntitiManagerFactory().createEntityManager();

        try {
            EventDAO ev = new EventDAO(em);
            System.out.println("confirm");







        }catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
    }
}
