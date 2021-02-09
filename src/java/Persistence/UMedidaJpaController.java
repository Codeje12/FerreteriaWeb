
package Persistence;

import Logica.UMedida;
import Persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class UMedidaJpaController implements Serializable {

    public UMedidaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
public UMedidaJpaController(){
        this.emf = Persistence.createEntityManagerFactory("FerreteriaPU");
    }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(UMedida UMedida) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(UMedida);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(UMedida UMedida) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            UMedida = em.merge(UMedida);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = UMedida.getId();
                if (findUMedida(id) == null) {
                    throw new NonexistentEntityException("The uMedida with id " + id + " no longer exists.");
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
            UMedida UMedida;
            try {
                UMedida = em.getReference(UMedida.class, id);
                UMedida.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The UMedida with id " + id + " no longer exists.", enfe);
            }
            em.remove(UMedida);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<UMedida> findUMedidaEntities() {
        return findUMedidaEntities(true, -1, -1);
    }

    public List<UMedida> findUMedidaEntities(int maxResults, int firstResult) {
        return findUMedidaEntities(false, maxResults, firstResult);
    }

    private List<UMedida> findUMedidaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(UMedida.class));
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

    public UMedida findUMedida(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(UMedida.class, id);
        } finally {
            em.close();
        }
    }

    public int getUMedidaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<UMedida> rt = cq.from(UMedida.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
