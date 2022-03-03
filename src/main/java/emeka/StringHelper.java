package emeka;

public class StringHelper {
    public static void main(String[] args) {
        StringHelper helper = new StringHelper();
        System.out.println(helper.removeAInFirstTwoPosition("ABACDA"));
        System.out.println(helper.areFirstAndLastTwoCharactersTheSame("ABACAB"));
    }
    public  String removeAInFirstTwoPosition(String str){
        if(str.length() <= 2) return str.replaceAll("A","");

        String firstTwoCharacters = str.substring(0,2);
        String otherCharacters = str.substring(2);
        return firstTwoCharacters.replaceAll("A","") + otherCharacters;
    }

    public  boolean areFirstAndLastTwoCharactersTheSame(String str){
        if(str.length() <= 1) return false;
        if(str.length() == 2) return true;

        String first2Chars = str.substring(0,2);
        String last2Chars = str.substring(str.length() - 2);

        return first2Chars.equals(last2Chars);
    }
}
