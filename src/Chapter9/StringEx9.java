package Chapter9;

public class StringEx9 {
	public static void main(String args[]) {
		String fullName = "Hello.java";
		
		//fullName���� '.'�� ��ġ�� ã�´�.
		int index = fullName.indexOf('.');
		//fullName�� ù��° ���ں��� '.'�� �ִ� ������ ���ڿ��� �����Ѵ�
		String fillName = fullName.substring(0, index);
		//'.'�� ���� ���ں��� �����ؼ� ���ڿ��� ������ �����Ѵ�.
		//fullName.substring(index+1, fullName.length());�� ����� ����.
		String ext = fullName.substring(index+1);
		
		System.out.println(fullName + "�� Ȯ���ڸ� ������ �̸��� " + fillName);
		System.out.println(fullName + "�� Ȯ���ڴ� " + ext);
	}
}
