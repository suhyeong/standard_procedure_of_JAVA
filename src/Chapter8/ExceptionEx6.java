package Chapter8;

public class ExceptionEx6 {
	public static void main(String args[]) {
		try {
			Exception e = new Exception("���Ƿ� �߻�������");
			throw e;
			//throw new Exception("���Ƿ� �߻�������"); <���� �� ���� ���ٷ� �ٿ� �� �� �ִ�.
		} catch (Exception e) {
			System.out.println("���� �޼��� :" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���.");
	}
}
