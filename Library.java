/*
 /*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Assignment3;

import javax.persistence.EntityManager;



import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.PassengerId;
import com.Passenger;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PassengerPU");
		EntityManager entitymanager = emf.createEntityManager();
		
		PassengerId pid = new PassengerId();
		pid.setPassengerEmail("Sirishagurugubelli@gmail.com");
		pid.setPassengerMobile(8121308388l);
		
		Passenger pass = new Passenger();
		pass.setPassengerEmail(pid.getPassengerEmail());
		pass.setPassengerMobile(pid.getPassengerMobile());
		pass.setPassengerName("Sirisha Gurugubelli");
		pass.setSource("Srikakulam");
		pass.setDestination("Hyderabad");
		
		entitymanager.getTransaction().begin();
		entitymanager.persist(pass);
		entitymanager.flush();
		entitymanager.getTransaction().commit();
		
		
		
	}
}
