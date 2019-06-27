public class Lab5 {

	public static void main(String[] args) {
		Capitalize("gRAnd");
		wheresWaldo(" Striped Waldo");
		firstThingsFirst("carrots ", "grape");
		soLong("apple", "orange");
	}

	public static void Capitalize(String word) {
		String first = word.substring(0, 1).toUpperCase();
		String rest = word.substring(1).toLowerCase();
		System.out.println(first + rest);

	}

	public static void wheresWaldo(String phrase) {
		String wheresWaldo = "Striped Waldo";
		System.out.println(phrase.indexOf("Waldo"));

	}

	public static void firstThingsFirst(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if (a.charAt(0) < (b.charAt(0))) {
			System.out.println(a + b);
		} else {
			System.out.println(b + a);
		}
		}
		
    public static void soLong(String a, String b) {
    	int one = a.length();
    	int two = b.length();
    	if (one == two) {
    		System.out.println(a + " " + b);
    	} else if  (one > two) {
    			System.out.println(a);
    	} else {
    		
    		System.out.println(b);
    		}
    	}
    	

	}



