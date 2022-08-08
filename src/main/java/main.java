import Singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
        EntityManager em = fabrica.createEntityManager();
    }
}
