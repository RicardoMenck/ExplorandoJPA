package academia.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {
    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa(null, "Ricardo", "ex1@atos.net", "Aluno");
//        Pessoa p2 = new Pessoa(null, "José", "ex2@atos.net", "Aluno");
//        Pessoa p3 = new Pessoa(null, "Matheus", "ex3@atos.net", "Aluno");
//        Pessoa p4 = new Pessoa(null, "Lucas", "ex4@atos.net", "Aluno");
//        Pessoa p5 = new Pessoa(null, "Gabriel", "ex5@atos.net", "Aluno");
//        Pessoa p6 = new Pessoa(null, "Richard", "ex6@atos.net", "Aluno");
//        Pessoa p7 = new Pessoa(null, "Rafael", "ex7@atos.net", "Aluno");
//        Pessoa p8 = new Pessoa(null, "Gabriel", "profGabriel@ufn.edu.br", "Professor");
//        Pessoa p9 = new Pessoa(null, "Luan", "profLuan@ufn.edu.br", "Professor");
//        System.out.println(p1);
//
//        System.out.println(p5);


        //Cria uma 'fabrica' de gerenciadores de entidade para a unidade de persistencia chamada "jpaHibernete"
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAMaven");
        //Cria um gerenciado de entidade a partir da nossa 'fabrica'
        EntityManager em = emf.createEntityManager();
        //Inicia uma transação para realizar operações
//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.persist(p4);
//        em.persist(p5);
//        em.persist(p6);
//        em.persist(p7);
//        em.persist(p8);
//        em.persist(p9);
//        em.getTransaction().commit();
//

        Pessoa p = new  Pessoa();
        p.setNome("Ricardo Augusto Menck Curti");
        p.setCargo("Service Desk");
        p.setEmail("ex1@atos.net");
        PessoaJPADAO.getInstance().merge(p);
       // PessoaJPADAO.getInstance().getById(1);
        PessoaJPADAO.getInstance().removeById(1);

        System.out.println(p);

//        p = em.find(Pessoa.class, 1);
//        System.out.println(p);
        System.out.println("Pronto");
        em.close();
        emf.close();
    }
}
