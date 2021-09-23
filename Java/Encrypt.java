import java.util.Scanner;

class Encrypt{

	public static String encrypt(String text, byte value){
		String ans = "";
		byte[] data = text.getBytes();
		for(int i =0;i<data.length;i++){
			ans+=(char)(data[i]^value);
		}

		return ans;
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Text: ");
		String text = sc.next();
		System.out.print("Value: ");
		byte value = sc.nextByte();
		System.out.println("your text encrypted:  "+encrypt(text,value)+"  with key is "+ value);
	}
}