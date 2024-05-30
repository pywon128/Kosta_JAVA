import java.util.Scanner;
import java.util.ArrayList;

class NotFoundException extends Exception{
	public NotFoundException(String message){
		super(message);
	}
}

class SearchArray{
	public SearchArray(int[] arr, int value) throws NotFoundException{
		int i;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(i = 0; i < arr.length; i++){
			if (arr[i] == value){
				list.add(i);
			}
		}
		if (list.size()==0){
			throw new NotFoundException("찾고자 하는 데이터 "+value+" 는 배열에 없어요");
		}else{
			System.out.println("찾고자 하는 데이터 " +value+"는 인덱스 " +list+" 에 있어요");
		}
	}
}

class SearchArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] data = {1,2,15,16,18,3,4,5,6,7,8,9,10,5,9,6,11,12,13,14,15,16,17,18,19,20};

		System.out.print("입력 : ");
		int value = sc.nextInt();

		try{
			new SearchArray(data, value);
		}
		catch (NotFoundException e){
			System.out.println("예외발생 : "+e.getMessage());
		
		}
		
	}
}
