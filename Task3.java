public class Task3 {
    public static void main(String[] args) {
        
        // --- CHANGE THIS FIRST SECTION ---
        String b = "Wow"; 
        String a = b;                    // Makes b1 (a == b) -> true
        String c = "Different";          // Makes b3 (!c.equals(a)) -> true
        String d = "Wow!";               // Makes b2 (d.equals(b + "!")) -> true

        // --- DO NOT CHANGE THIS SECTION ---
        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
