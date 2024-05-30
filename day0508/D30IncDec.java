class D30IncDec {
	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		int i,j;
		
		// a의 값을 1증가 시키고 그 a를 i에 저장한다.
		i = ++a;
		// b의 값을 j에 저장하고 b의 값을 1증가 시킨다.
		j = b++;

		System.out.println(a);
		System.out.println(b);
		System.out.println(i);
		System.out.println(j);
		
		//a = 6, i =6, b = 6, j = 5		
	}
}
