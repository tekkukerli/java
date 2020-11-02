public class StringUtils {

    public static boolean included(String word, String searchedTitle){
        if(word != null && searchedTitle != null){
            if(word.toUpperCase().contains(searchedTitle.trim().toUpperCase())){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}