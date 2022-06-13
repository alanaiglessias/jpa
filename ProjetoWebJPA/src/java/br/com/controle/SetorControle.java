package br.com.controle;

import br.com.modelo.Setor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SetorControle {
    
    EntityManagerFactory emf;
    EntityManager em;

    public SetorControle() {
        emf = Persistence.createEntityManagerFactory("crudPU");
        em = emf.createEntityManager();
    }

    public boolean salvarSetor(Setor s) { //persist = salvar
        try {
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();

            return true;
        } catch (Exception e) {
            System.out.println("Erro no " + e.getMessage());
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }

        return false;
    }

    public void alterarSetor(Setor s) { //merge = alterar
        try {
            em.getTransaction().begin();
            em.merge(s);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro no " + e.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
    }

    public void removerSetor(Setor s) { //remove = remover
        try {
            em.getTransaction().begin();
            em.remove(s);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro no " + e.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
    }

    public List<Setor> listarSetores() {
        try {
            em.getTransaction().begin();
            List<Setor> pessoas = em.createQuery("from Setor").getResultList();
            em.getTransaction().commit();
            
            return pessoas;
        } catch(Exception e) {
            System.out.println("Erro no " + e.getMessage());
        } finally {
            em.close();
            emf.close();
        }
        
        return null;
    }
    
    public Setor listarSetor(int id) {
        try{
            em.getTransaction().begin();
            Setor s = em.find(Setor.class, id);
            em.getTransaction().commit();
        } catch(Exception e) {
            System.out.println("Erro no " + e.getMessage());
        } finally {
            em.close();
            emf.close();
        }
        
        return null;
    }
}

    

