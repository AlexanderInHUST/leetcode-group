package algorithms;

/**
 * Created by tangyifeng on 17/1/9.
 * Email: yifengtang@uniquestudio.com
 */
public class RansomNote {

    public static void main(String args[]){
        System.out.println(new RansomNote().canConstruct("aa","ab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int alphabets[] = new int[26];
        char charMag[] = magazine.toCharArray();
        char charRan[] = ransomNote.toCharArray();
        for(char mag : charMag){
            alphabets[mag - 'a']++;
        }
        for(char note : charRan){
            alphabets[note - 'a']--;
            if(alphabets[note - 'a'] < 0)
                return false;
        }
        return true;
    }
}
