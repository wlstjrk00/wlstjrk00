
public class test123 {

	public static void main(String[] args) {
		
//1
		/*int[] arr = {10, 20,30,40,50};
		for (int i = 0; i < arr.length; i++) {
			total+=arr[i];
		}
		System.out.println(total);*/
		
//2
		/*int total=0;
		 * 
		double average=0;
		double aver=0;
		
		int[][] arr = {
				  { 5, 5, 5, 5, 5}
				, { 10, 10, 10, 10, 10}
				, { 20, 20, 20, 20, 20}
				, { 30, 30, 30, 30, 30}
				};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				total+=arr[i][j];
				aver++;
			}
		}
		average = total/aver;
		System.out.println("total="+total);
		System.out.println("average="+average);*/
		
//3
		
		/*int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		//�迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for(int i=0; i< ballArr.length;i++) { 
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			ballArr[j] = ballArr[i];
			//�˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			
		}
		
		//�迭 ballArr�� �տ��� 3���� ���� �迭 ball3���� �����Ѵ�.
		for (int i = 0; i < ball3.length; i++) {
			ball3[i] = ballArr[i]; 
		}
		for(int i=0;i<ball3.length;i++) { 
			System.out.print(ball3[i]); 
		} */
		
//4
		/*
		// ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		
		int[] coinUnit = {500, 100, 50, 10}; 
		
		int money = 2680; 
		
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			// (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			int coin = money/coinUnit[i];
			money = money-(coin*(int)coinUnit[i]);
			System.out.println(coinUnit[i]+"�� : "+coin+"��");
		}*/
		
//5
/*
		//���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�.
		
		int money = 3290; 
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10};
		int[] coin = {5, 5, 5, 5};
		
		for(int i=0;i<coinUnit.length;i++) { 
			int coinNum = 0;
			
			(1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
			 1. �ݾ�(money)�� ���������� ������ �ʿ��� ������ ����(coinNum)�� ���Ѵ�.
			 2. �迭 coin���� coinNum��ŭ�� ������ ����.
			    (���� ����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ�� ����.)
			 3. �ݾ׿��� ������ ����(coinNum)�� ���������� ���� ���� ����.
			
			while(coin[i]!=0 && money-coinUnit[i]>=0){
				money = money-coinUnit[i];
				coin[i]-=1;
			}
			 System.out.println(coinUnit[i]+"��: "+coinNum);

		}
		
		if(money > 0) {
			 System.out.println("�Ž������� �����մϴ�."); 
			 System.exit(0); //���α׷��� �����Ѵ�. 
		}
		
		System.out.println("= ���� ������ ���� ="); 
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"�� :"+coin[i]);
		}*/
		
//6
		
		char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star.length; j++) {
				/*  (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ� . */
				System.out.print(star[star[i].length-j][i]);
			}
			System.out.println(i);
		} 
		
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
	} //end of class
}
