public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPali("A man, a plan, a canal: Panama"));
    }

    static boolean isPali(String s){
        if(s.length() == 0){
            return true;
        }
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                str.append(s.charAt(i));
            }
        }

        if(str.toString().toLowerCase().trim().equals(str.reverse().toString().toLowerCase().trim())){
            return true;
        }

        return false;
    }
}
