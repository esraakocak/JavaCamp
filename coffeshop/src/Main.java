
import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;

import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import adapters.MernisServiceAdapters;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		  customer.setId(2);
		  customer.setFirstName("esra");
		  customer.setLastName("ko�ak");
		  customer.setNationalityId("00000000000");
		  customer.setDateOfBirth(new GregorianCalendar(1998,10,16).getTime());
		
	
		  BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		  neroCustomerManager.Save(customer);

		 BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		 customerManager.Save(customer);	
			
		
			

			
		}
		

	}


