package practice2.exceptions;

public class Task2 {
    public static void main(String[] args){
        //String s1 = "dksjhfksdfkdshf";
        String s2 = "eysuabdws";
        //System.out.println(containsVowels(s1));
        System.out.println(containsVowels(s2));

    }




    public static String containsVowels (String s){
        int count = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'u' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'y'){
                count++;
            }
        }
        if(count == 0){
            throw new IllegalArgumentException();
        }
        return s;
    }

}
