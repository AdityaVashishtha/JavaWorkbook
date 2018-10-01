import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SOME THING TO T");
		Product p = new Product(1,"SOME PROD",15000,1);
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();		
		session.save(p);
		transaction.commit();
		
		
	}

}
