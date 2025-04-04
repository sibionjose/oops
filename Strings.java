public class Strings {
	public static void main(String []args){
	String text = "object Oriented programming";
	System.out.println("original text : "+text);	
	System.out.println("\n the given text is empty->"+text.isEmpty());
	System.out.println("\n length of the given text:"+text.length());
		System.out.println("\n to upper case:"+text.toUpperCase());
		System.out.println("\n to lower case:"+text.toLowerCase());
		System.out.println("\n Substring:" +text.substring(7));
		System.out.println("\n Subsequence: "+text.subSequence(7,15));

		System.out.println("\n Replace O with $:"+text.replace('O','$'));
		System.out.println("\n Replace all text with 'java lab':"+text.replaceAll(text,"java lab"));
		System.out.println("\n Replace first word: "+text.replaceAll("Object","java"));
		System.out.println("\n Character at index 8:"+text.charAt(8));
		int ascii = text.charAt(8);
		System.out.println("\n ASCII value of characters at index 8: "+ascii);
		System.out.println("\n First index of character 'O':"+text.indexOf('O'));
		System.out.println("\n Last index of character 'O': "+text.lastIndexOf('O'));
		String text1 = "Lab";
		System.out.println("\n Concatenation with 'lab': "+text.concat(" ").concat(text1));
		System.out.println("\n_comparison_");
		System.out.println(" If the value is 0,both are equal. Otherwise unequal!");
	System.out.println("\n Text for comparision:object oriented programming->"+text.compareTo("object oriented programming"));
	System.out.println("\n Text for comparision:object oriented programming->"+text.compareTo("object oriented programming"));
}
}
