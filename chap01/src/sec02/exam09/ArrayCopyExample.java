package sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };

		String[] newStrArray = new String[5];

//		System.arraycopy(oldStrArray, 0, newStrArray, 0, 3);
//
//		
//		for (int i = 0; i < newStrArray.length; i++) {
//			System.out.print(newStrArray[i]);
//			if(i < newStrArray.length - 1) {
//				System.out.print(", ");
//			}
//		}
		for(int i=0;i<oldStrArray.length;i++) {
			newStrArray[i+2]=oldStrArray[i];
		}
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i]);
			if(i < newStrArray.length - 1) {
				System.out.print(", ");
			}
		}
		
		
	}
}