package meroHospital.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_info")
public class InfoModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer iid;
	private String name;
	private String address;
	private long contactNumber;
	private String email; 
	private String description;
	private String photo;
	
	public InfoModel()
	{
		
	}
	public InfoModel(String name, String address, long contactNumber, String email, String description,
			String photo) 
		{
		
		
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.email = email;
		this.description = description;
		this.photo = photo;
		//System.out.println("in model"+"name="+name+"address="+address+"contact="+contactNumber+"email="+"email="+email+"description="+description+"phto="+photo);
		}
	
	
	public InfoModel(Integer iid, String name, String address, long contactNumber, String email, String description,
			String photo) {
		super();
		this.iid = iid;
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.email = email;
		this.description = description;
		this.photo = photo;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	@Override
	public String toString() {
		return "infoModel [iid=" + iid + ", name=" + name + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", email=" + email + ", description=" + description + ", photo=" + photo + "]";
	}
	
	
	
	


}
