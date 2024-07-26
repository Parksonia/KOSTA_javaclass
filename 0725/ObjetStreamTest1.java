import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Person implements Serializable {
	int age;
	String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "이름 :" + name + ",나이 :" + age;
	}
}

//직렬화
public class ObjetStreamTest1 {

	public static void save(List<Person> pers) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("per.bin");// 바이너리 형태임
			oos = new ObjectOutputStream(fos);
		
			//방법2 .다이렉트로 리스트 형태로 저장됨
			oos.writeObject(pers);

//          방법1.
//			oos.writeInt(pers.size());
//			for (Person person : pers) {
//				oos.writeObject(person);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (Exception e2) {

			}
		}

	}

	public static List<Person> load() {
		//List<Person> persons = new ArrayList<>();
		List<Person> persons = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("per.bin");
			ois = new ObjectInputStream(fis);
			//방법2.
			persons = (ArrayList<Person>) ois.readObject();

//방법 1.			
//			int cnt = ois.readInt();
//			for (int i = 0; i < cnt; i++) {
//				persons.add((Person) ois.readObject());
//				
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();

			} catch (IOException e2) {

			}
		}
		return persons;
	}

	public static void saveOne(Person person) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("per.bin");
			oos = new ObjectOutputStream(fos);
			// 객체 자체를 직렬화 하여 저장
			oos.writeObject(person);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void loadOne() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("per.bin");
			ois = new ObjectInputStream(fis);
			Person person2 = (Person) ois.readObject();
			System.out.println(person2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
//		List<Person> pers = new ArrayList<>();
//		pers.add(new Person(20, "홍길동"));
//		pers.add(new Person(30, "김길동"));
//		pers.add(new Person(40, "강길동"));
//		pers.add(new Person(50, "서길동"));
//		pers.add(new Person(10, "하길동"));
//
//		save(pers);
		List<Person> perList = load();
		System.out.println(perList);
		//saveOne(new Person(10, "김적극"));
		//loadOne();

	}

}
