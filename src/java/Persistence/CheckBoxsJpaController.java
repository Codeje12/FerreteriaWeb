/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Logica.CheckBoxs;
import Persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Enrique Esteche
 */
public class CheckBoxsJpaController implements Serializable {

    public CheckBoxsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CheckBoxs checkBoxs) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(checkBoxs);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CheckBoxs checkBoxs) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            checkBoxs = em.merge(checkBoxs);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = checkBoxs.getId();
                if (findCheckBoxs(id) == null) {
                    throw new NonexistentEntityException("The checkBoxs with id " + id + " no longer exists.");
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
            CheckBoxs checkBoxs;
            try {
                checkBoxs = em.getReference(CheckBoxs.class, id);
                checkBoxs.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The checkBoxs with id " + id + " no longer exists.", enfe);
            }
            em.remove(checkBoxs);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CheckBoxs> findCheckBoxsEntities() {
        return findCheckBoxsEntities(true, -1, -1);
    }

    public List<CheckBoxs> findCheckBoxsEntities(int maxResults, int firstResult) {
        return findCheckBoxsEntities(false, maxResults, firstResult);
    }

    private List<CheckBoxs> findCheckBoxsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CheckBoxs.class));
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

    public CheckBoxs findCheckBoxs(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CheckBoxs.class, id);
        } finally {
            em.close();
        }
    }

    public int getCheckBoxsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CheckBoxs> rt = cq.from(CheckBoxs.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
