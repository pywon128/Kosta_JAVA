class  D19IntDouble{
	public static void main(String[] args) {
		double height;
		height = 179.76315;
		System.out.println(height);
		System.out.printf("키: %.2f\n",height);

		int age;
		age = 20;
		System.out.println("나이 : "+age);
		System.out.printf("나이 : %d\n",age);

		String name;
		name = "park";
		System.out.println("이름 : "+name);
		System.out.printf("이름 : %s\n",name);

		System.out.printf("이름 : %s, 나이 : %d, 키 : %.2f\n",name, age, height);

	}
}