package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String itemTotalText = "asdsad132.231";
		Float itemValue = Float.parseFloat(itemTotalText.replaceFirst(".*?([\\d.]+).*", "$1"));
		
		if (itemValue == null) {
			System.out.println("null");
		}else {
			System.out.println(itemValue);
		}
	}

}
