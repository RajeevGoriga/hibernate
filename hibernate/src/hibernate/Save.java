package hibernate;
import org.hibernate.*;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Save {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Product p=new Product();
		p.setProductId(102);
		p.setProName("mi");
		p.setPrice(5000);
		
		Transaction tx = session.beginTransaction();
		session.save(p);
		System.out.println("object saved successfully..........!!");
		tx.commit();
		session.close();
		factory.close();

	}

}
