package Utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

/**
 * Created by ankitgupta on 5/27/17.
 */
@Service
public class DataBaseHandler {

    public Session getDbSession(Class<?> className) {
        Session session = null;
        try {

            Configuration con = new Configuration().configure().addAnnotatedClass(className);

            SessionFactory sf = con.buildSessionFactory();

            session = sf.openSession();

        } catch (HibernateException e) {
            System.out.println(e.getCause());
        } catch (Exception e){
            System.out.println(e.getCause());
        }
        return session;
    }

    public boolean pushObjectInDB(Class<?> className, Object obj) {

        Session session = getDbSession(className);

        Transaction tx = session.beginTransaction();

        session.save(obj);

        tx.commit();

        return true;
    }

    public boolean deleteObjectInDB(Class<?> className, Object obj) {

        Session session = getDbSession(className);

        session.delete(obj);

        // This makes the pending delete to be done
        session.flush();

        return true;
    }

    public Object getObjectbyId(Class<?> className, String id) {


        Session session = getDbSession(className);

        return session.get(className, id);
    }

}
