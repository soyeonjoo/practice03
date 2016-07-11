package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		int won=50000;
		int sw=0;
		int na=0;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액 : ");
		int n = scanner.nextInt();
		
		for(int i =0;i<10;i++){
			int count=0;
			count = n/won;
			
			System.out.println(won+"원 :"+count+"개");
			n=n-count*won;
			
			
			if(sw==0){
				won=won/5;
				sw=1;
			}
			else{
				won=won/2;
				sw=0;
			}
		}
		
		
	}
}

/*문제2. 키보드에서 정수로 된 돈의 액수를 입력 받아 오만 원권, 만원 권, 오천 원권, 천원 권,
500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 
개로 변환 되는지 작성하시오.
*/