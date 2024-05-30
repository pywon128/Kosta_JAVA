class  D09CharTest{
	public static void main(String[] args) {
		String data;
		data = "hello";
		char ch;
		int n=0;
		
		while(n<data.length()){
			ch = data.charAt(n);
			System.out.print(ch);
			n = n+1;
		}
		/*
			boolean flag = true;
			while(flag){
				ch = data.charAt(n);
				System.out.print(ch);
				n = n+1;
				if(n == data.length()){
					flag = false;
				}
				
			}
		*/
	}
}