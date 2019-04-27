package Chapter9;

public class Exercise9_11 {
	public static void main(String[] args) {
		int from = 0;
		int to = 0;
		
		try {
			if(args.length != 2)
				throw new Exception("���۰� �� ��, �ΰ��� ������ �Է����ּ���.");
			
			from = Integer.parseInt(args[0]);
			to = Integer.parseInt(args[1]);
			
			if(!(2 <= from && from <= 9 && 2<= to && to <= 9))
				throw new Exception("���� ������ 2�� 9������ ���̾�� �մϴ�.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
		
		if(from > to) {
			int tmp = from;
			from = to;
			to = tmp;
		}
		
		for(int i=from;i<=to;i++) {
			for(int j=1;j<9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}
}
