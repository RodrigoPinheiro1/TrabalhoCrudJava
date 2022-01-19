/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Aluno
 */
import Logica.Empresa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Rodrigo
 */
public class DAO {

    public EntityManager getEm() {

        EntityManagerFactory managerFactory = null;

//manager = managerFactory.createEntityManager();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CarlinhaPU");

        return factory.createEntityManager();
    }

    public Empresa salvar(Empresa local) {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            if (local.getId() != 0) {

                local = em.merge(local); //ATUALIZAr

            } else {
                em.persist(local);//INSERIR

            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return local;
    }

    public void remover(int id) {

        EntityManager em = getEm();//chama a conexao
        Empresa local = em.find(Empresa.class, id);//pesquisar na classe Alunos com id
        try {
            em.getTransaction().begin();//iniciar a transação
            em.remove(local);//executa o delete
            em.getTransaction().commit();//salvar
        } finally {

            em.close();

        }

    }

    public Empresa consultarPorId(int id) {

        EntityManager em = getEm();
        Empresa local;
        try {
            local = em.find(Empresa.class, id);//pesquisar na classe aclunos com id

        } finally {
            em.close();
        }
        return local;
    }

   
}
