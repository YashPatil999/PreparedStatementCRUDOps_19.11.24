package JDBC_19Nov;

public class PersonManagement {

	public static void main(String[] args) throws Exception {

		Person p1 = new Person();
		
		p1.Insert(101, "Yash", "Thane");
		p1.Update(101, "Shardul", "Pune");
		p1.Delete(101);
		p1.GetAllData();
	}
}
