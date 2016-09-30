package convert;

import convert.person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




public class populate {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("restpu");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        person p = new person(1, "lars", "larsen", 00000);
        em.persist(p);
       
        person p2 = new person(2, "henrik", "larsen", 00001);
        em.persist(p2);
        
        person p3 = new person( 3, "umit", "larsen", 00002);
        em.persist(p3);
        
        
        em.getTransaction().commit();
        em.close();
        
     
        
        
        
        
    }
}
