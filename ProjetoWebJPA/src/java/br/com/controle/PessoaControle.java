package br.com.controle;

import br.com.modelo.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PessoaControle {

    EntityManagerFactory emf;
    EntityManager em;

    public PessoaControle() {
        emf = Persistence.createEntityManagerFactory("crudPU");
        em = emf.createEntityManager();
    }

    public boolean salvarPessoa(Pessoa p) { 
        try {
            em.getTransaction().begin();
            em.persist(p); //persist = salvar
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

    public void alterarPessoa(Pessoa p) { //merge = alterar
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro no " + e.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
    }

    public void removerPessoa(Pessoa p) { //remove = remover
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro no " + e.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
    }

    public List<Pessoa> listarPessoas() {
        try {
            em.getTransaction().begin();
            List<Pessoa> pessoas = em.createQuery("from Pessoa").getResultList();
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
    
    public Pessoa listarPessoa(int id) {
        try{
            em.getTransaction().begin();
            Pessoa p = em.find(Pessoa.class, id);
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
