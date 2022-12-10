/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;
import uvpavicol.clases.Galpon;

/**
 *
 * @author RYZEN3
 */
public class GalponJpaController implements Serializable {

    public GalponJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Galpon galpon) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(galpon);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findGalpon(galpon.getIdentificador()) != null) {
                throw new PreexistingEntityException("Galpon " + galpon + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Galpon galpon) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            galpon = em.merge(galpon);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = galpon.getIdentificador();
                if (findGalpon(id) == null) {
                    throw new NonexistentEntityException("The galpon with id " + id + " no longer exists.");
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
            Galpon galpon;
            try {
                galpon = em.getReference(Galpon.class, id);
                galpon.getIdentificador();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The galpon with id " + id + " no longer exists.", enfe);
            }
            em.remove(galpon);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Galpon> findGalponEntities() {
        return findGalponEntities(true, -1, -1);
    }

    public List<Galpon> findGalponEntities(int maxResults, int firstResult) {
        return findGalponEntities(false, maxResults, firstResult);
    }

    private List<Galpon> findGalponEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Galpon.class));
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

    public Galpon findGalpon(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Galpon.class, id);
        } finally {
            em.close();
        }
    }

    public int getGalponCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Galpon> rt = cq.from(Galpon.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
