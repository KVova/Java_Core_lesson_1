package volodymyr;

public class Application {

	public static void main(String[] args) {

		// ������� 1: - � + ������

//		int d = 1;
//		int e = 2;
//		int res1 = d+e;
//		int res2 = d-e;
//		int res3 = d*e;
//		int res4 = d/e;
//		
//		System.out.println("res1 = " + res1);
//		System.out.println("res2 = " + res2);
//		System.out.println("res3 = " + res3);
//		System.out.println("res4 = " + res4);

		// ������� 2: ������ � ���������
//		
//		int a = 0;      //a=1 �������� 1  �������� 1
//		int b = a++;    //b=0 b==0, � ������ � �������� 1 
//		int c = a++;    //�=0 �==1, ��� �� � ������������ ����� �==1, � ������ � �������� 1            �������� 1
//		System.out.println("������� 2 = " + a +" " + b + " " + c);

		// ������� 3: �������� � ����������

//		int f = 1;
//		int g = 2;
//		int h = 3;
//		
//		f+=5;    // f = f+5 => 1+5 =6
//		g*=4;    // g = g*4 => 2*4 =8
//		h+=f*g;  // h = h+f*g =>3+ 6*8 = 51
//		h%=6;    // h = h%6 => 51/6=8(3) = 51-48=3
//		
//		System.out.println("f = " + f);
//		System.out.println("g = " + g);
//		System.out.println("h = " + h);

		// ������� 4: ��������� ��������
//		
//		int a = 2;
//		int r = a > 0 ? -3 : 2;
//		System.out.println("r = " +r);

		// ������� 5: ������ ���������

//		boolean j = true;
//		boolean k = false;
//		boolean l = j | k; // 1 + 0 = 1 => true "���" ���� ���� � 1 true, ��� ���� true
//		boolean m = j & k; // 1 * 0 = 0 => false "��"  
//		boolean n = (!j & k) | (j & !k); //(0 * 0) + (1 * 1) = 0 + 1 = 1 => true
//		boolean o = !j;
//		
//		System.out.println("j = " + j);
//		System.out.println("k = " + k);
//		System.out.println("l = " + l);
//		System.out.println("m = " + m);
//		System.out.println("n = " + n);
//		System.out.println("o = " + o);
//		
		// 58.55

		// ������� 6: �������� ������ (� ����������)

//		int t = 5;
//		int u = 5;
//		String result = (t<u) ? "Yes": "No";
//		String result2 = (t==u) ? "Yes": "No";
//		String result3 = (t>=u) ? "Yes": "No";
//		
//		System.out.println("result = "+ result);
//		System.out.println("result2 = "+ result2);
//		System.out.println("result3 = "+ result3);

		// ������� 7: ����������� If - else

//		int a1 = 2;
//		int b1 = 3;
//		if (a1 > b1) {
//			System.out.println("a1>b1");
//		} else {
//			System.out.println("a1<b1");
//		}

		// ������� 8: ����������� if - else - if

//		int a1 = 3;
//		int b1 = 9;
//		
//		if(a1 * a1 == b1) {
//			System.out.println("1");
//		}else if(a1 * a1 < b1) {
//			System.out.println("2");
//		}else {
//			System.out.println("3");
//		}

		// ������� 9: ����������� swich

//		int k1 = 2;
//
//		switch (k1) {
//		case 1: case 3: case 4: 
//			System.out.println("1, 3, 4");
//		
//		case 2: System.out.println("2"); break;
//		
//		default: System.out.println("default");
//		}

		// ������� 10: ����� - loops ���� for

//		for (int i = 0; i < 10; i++) {
//			System.out.println("i = " + i);
//		}

		// ������� 11: ����� - loops ���� while
//		int i = 0;
//		
//		while (i<10) {
//			System.out.println("i = "+i);
//			i++;
//		}

		// ������� 12: ����� - loops ���� do while

//		int i = 0;
//		
//		do {
//			System.out.println("do i = "+i);
//			i++;
//		}while(i == 1);

		// ������� 13: �����
				
//		int array1 [] = new int [10];
//		double[] array2 = new double [10];
//		double array3 [] = {1.1, 2.2, 3.3, 4.4, 5.5};
//		
//		for (int i = 0; i < array1.length; i++) {
//			array1[i] = i;	
//			array2[i] = i*i;
//		}
//		
//		for (int i = 0; i < array1.length; i++) {
//			System.out.print(array1[i] + " -> ");
//			System.out.println(array2[i]);
//		}
//		
//		for (int i = 0; i < array3.length; i++) {
//			System.out.println(array3[i]);
//		}
		
		// ������� 14: �������� �������� (Wrappers primitives)
		
		Byte a1 = 2;
		Short a2 = 2;
		Integer a3 = 2;
		Long a4 = 2L;
		
		int a5 = a1;
		a3 = a5;
		
		Double b = 2.2;
		Float b1 = 3.3F;
		
		// ������� �� ������� ��������� � ����������� �������� ���� �����. ���� ����������� �� ���������
		// System.out.println(); �� Java Wrappers (�������� ��������).
		// �������� �����, ��������� ���� 10 ���������� ���� int, ������ ����������� �� ��������� �������� � ����� �� 
		// ������� �� �� �������.
		
		// ������� ����� - Java. ������ ����������� 8-�������� �.71 - 145
		
		// Thinking in Java Fourth Edition Bruce Eckel c.63-93
		//           Operators
		
		//First commit to gitHub
	}

}
