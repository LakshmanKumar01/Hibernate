package Kumar.Own;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class Employee_Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Lakshman");
		emp.setSalary(1200000);
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();

	}
}
