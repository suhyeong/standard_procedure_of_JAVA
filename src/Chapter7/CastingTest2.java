package Chapter7;

public class CastingTest2 {
	public static void main(String args[]) {
		//Car car = new Car();
		Car car = new FireEngine(); //�̿� ���� �����ϸ� ������ �߻����� �ʴ´�.
		Car car2 = null;
		FireEngine fe = null;
		
		car.drvie();
		//fe = (FireEngine)car; //< error ! �������� car�� �����ϰ� �ִ� �ν��Ͻ��� CarŸ���� �ν��Ͻ��� ���� ����.
		//����Ÿ���� �ν��Ͻ��� �ڼ�Ÿ���� ���������� �����ϴ� ���� ������ �ʴ´�.
		//fe.drvie();
		car2 = fe; //����Ÿ�� <- �ڼ�Ÿ�� :: ����ȯ ���� ����
		//car2.drvie(); <���⼭�� �� ������ ���°��� ,, ,,?
	}
}
