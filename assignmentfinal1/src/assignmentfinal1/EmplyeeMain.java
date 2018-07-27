package assignmentfinal1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmplyeeMain {

	public EmplyeeMain() {

	}

	public static void main(String[] args) {
		EmplyeeBo b = new EmplyeeBo();
		EmplyeeSort s = new EmplyeeSort();

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter the number of Employees");
		int number = sc.nextInt();

		ArrayList<EmplyeeVo> list = new ArrayList<EmplyeeVo>();

		try {
			for (int i = 0; i < number; i++) {
				System.out.println("enter The ID"+(i+1));
				int id = sc.nextInt();
				System.out.println("enter The EmpName"+(i+1));
				String EmpName = sc.next();
				System.out.println("enter The AnnualIncome"+(i+1));
				double annual = sc.nextDouble();
				list.add(new EmplyeeVo(id, EmpName, annual, 0));
				b.CalincomeTax(list.get(i));
			}
		} catch (Exception e) {
			
			System.out.println("please give valid input ");
		}
		
		for (EmplyeeVo emplyeeVo : list) {
			System.out.println(emplyeeVo);
		}
		Collections.sort(list, s);
		
		System.out.println("the sorted listed would be");
		for (EmplyeeVo emplyeeVo : list) {
			System.out.println(emplyeeVo);
		}
		sc.close();

	}

}