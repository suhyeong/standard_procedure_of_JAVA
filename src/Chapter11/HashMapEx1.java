package Chapter11;

import java.util.*;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("castello", "12345");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id��password�� �Է��ϼ���.");
			System.out.print("id:");
			String id = s.nextLine().trim();
			
			System.out.print("password:");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} else {
				if(!(map.get(id).equals(password))) {
					System.out.println("password�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				} else {
					System.out.println("id�� password�� ��ġ�մϴ�.");
					break;
				}
			}
		}
	}
}
