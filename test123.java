
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
		
		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0; i< ballArr.length;i++) { 
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			ballArr[j] = ballArr[i];
			//알맞은 코드를 넣어 완성하시오.
			
		}
		
		//배열 ballArr의 앞에서 3개의 수를 배열 ball3으로 복사한다.
		for (int i = 0; i < ball3.length; i++) {
			ball3[i] = ballArr[i]; 
		}
		for(int i=0;i<ball3.length;i++) { 
			System.out.print(ball3[i]); 
		} */
		
//4
		/*
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		
		int[] coinUnit = {500, 100, 50, 10}; 
		
		int money = 2680; 
		
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			// (1) 알맞은 코드를 넣어 완성하시오.
			int coin = money/coinUnit[i];
			money = money-(coin*(int)coinUnit[i]);
			System.out.println(coinUnit[i]+"원 : "+coin+"개");
		}*/
		
//5
/*
		//문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		
		int money = 3290; 
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10};
		int[] coin = {5, 5, 5, 5};
		
		for(int i=0;i<coinUnit.length;i++) { 
			int coinNum = 0;
			
			(1) 아래의 로직에 맞게 코드를 작성하시오.
			 1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
			 2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
			    (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
			 3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			
			while(coin[i]!=0 && money-coinUnit[i]>=0){
				money = money-coinUnit[i];
				coin[i]-=1;
			}
			 System.out.println(coinUnit[i]+"원: "+coinNum);

		}
		
		if(money > 0) {
			 System.out.println("거스름돈이 부족합니다."); 
			 System.exit(0); //프로그램을 종료한다. 
		}
		
		System.out.println("= 남은 동전의 개수 ="); 
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원 :"+coin[i]);
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
				/*  (1) 알맞은 코드를 넣어 완성하시오 . */
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
