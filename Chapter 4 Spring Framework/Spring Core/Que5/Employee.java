package Que5;
import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Required;
public class Employee {
	
	private String id;
    private String name;
    
    @Inject
    private Address address;
 
    @Resource
    private Company company;
 
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    
    
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", company=" + company + "]";
	}
    
}
