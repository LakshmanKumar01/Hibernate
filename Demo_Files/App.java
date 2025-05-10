package Kumar.Hibernate3;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class App {
	public static void main(String[] args) {

		// Configuration is to define all configuration and mapping sources in one
		// API and to then build the org.hibernate.SessionFactory

		Configuration cfg = new Configuration();

		// Use the mappings and properties specified in the given application
		// resource

		cfg.configure("hibernate.cfg.xml");

		// Read metadata from the annotations associated with this specific Class
		cfg.addAnnotatedClass(Student.class);

		// The main contract here is the creation of Session instances

		org.hibernate.SessionFactory sessionfactory = cfg.buildSessionFactory();

		Session s = sessionfactory.openSession();

		// Create an Object to the Student class
		Student st = new Student();
		st.setId(1);
		st.setName("Kumar");
		st.setQualification("B.tech");

		// Begin the Transaction
		s.beginTransaction();
		// saves the data in the table
		s.save(st);
		s.getTransaction().commit();
		System.out.println("Done!!");
	}
}
