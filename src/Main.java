public class Main {

    public static void main(String[] args) {


        return;
    }

    public static boolean  isIsogram(String str) {

        str = str.toLowerCase();

        for (int a = 0; a < str.length(); a++) {
            char currentChar = str.charAt(a);

            if (Character.isLetter(currentChar)) {
                for (int b = 0; b <str.length(); b++) {
                    char nextChar = str.charAt(b);

                    if (currentChar == nextChar) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}


