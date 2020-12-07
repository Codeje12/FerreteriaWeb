package Persistencia;

import Logica.ClassAbstracta;
import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class ClassAbstractaJpaController implements Serializable {

    public ClassAbstractaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public ClassAbstractaJpaController(){
        this.emf = Persistence.createEntityManagerFactory("FerreteriaPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ClassAbstracta classAbstracta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(classAbstracta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ClassAbstracta classAbstracta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            classAbstracta = em.merge(classAbstracta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = classAbstracta.getId();
                if (findClassAbstracta(id) == null) {
                    throw new NonexistentEntityException("The classAbstracta with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ClassAbstracta classAbstracta;
            try {
                classAbstracta = em.getReference(ClassAbstracta.class, id);
                classAbstracta.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The classAbstracta with id " + id + " no longer exists.", enfe);
            }
            em.remove(classAbstracta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ClassAbstracta> findClassAbstractaEntities() {
        return findClassAbstractaEntities(true, -1, -1);
    }

    public List<ClassAbstracta> findClassAbstractaEntities(int maxResults, int firstResult) {
        return findClassAbstractaEntities(false, maxResults, firstResult);
    }

    private List<ClassAbstracta> findClassAbstractaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ClassAbstracta.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public ClassAbstracta findClassAbstracta(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ClassAbstracta.class, id);
        } finally {
            em.close();
        }
    }

    public int getClassAbstractaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ClassAbstracta> rt = cq.from(ClassAbstracta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
