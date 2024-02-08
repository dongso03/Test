import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestBatch {
	public static void main(String[] args) {
		
		
//		List<Person> list = new ArrayList<>(
//					Arrays.asList(
//								new Person("사람77", 1)
//								, new Person("사람15", 2)
//								, new Person("사람91", 3)
//								, new Person("사람18", 4)
//								, new Person("사람19", 5)
//							)
//				);
		
		PersonDAOImpl dao = PersonDAOImpl.getInstance();
		
		PersonService service = new PersonService(dao);
		int result = service.insert(new Person("사람56",68));
		
		System.out.println(dao.getAll());
//		int[] result = dao.batchAdd(list);
//		System.out.println(Arrays.toString(result));
	}
}






