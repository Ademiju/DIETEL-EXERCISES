package chapterForteen;

public class StringUtil {
    private String string;

    public StringUtil(String string){
        this.string = string;
    }

    public int _lastIndexOf(char character){
        int indexPosition = -1;
        for (int index = 0; index < string.length(); index++)
        if(string.charAt(index) == character){
         indexPosition =  index;
        }
        return indexPosition;
     }
    public int _lastIndexOf(boolean ignoreCase,char character) {
        int indexPosition = -1;
        if (ignoreCase) {
            string = string.toLowerCase();
            character = Character.toLowerCase(character);
            for (int index = 0; index < string.length(); index++)
                if (string.charAt(index) == character) {
                    indexPosition = index;
                }

        } else {
            _lastIndexOf(character);
        }
        return indexPosition;
    }

     public int _indexOf(char character ){
        int indexPosition = -1;
        for(int index = 0; index < string.length(); index++ ){
            if(string.charAt(index) == character){
                return index;
            }
        }
            return indexPosition;
     }

    public int _indexOf(boolean ignoreCase, char character ){
        int indexPosition = -1;
        if (ignoreCase) {
            string = string.toLowerCase();
            character = Character.toLowerCase(character);
            for (int index = 0; index < string.length(); index++)
                if (string.charAt(index) == character) {
                    return index;
                }

        }else{
            _indexOf(character);
        }
        return indexPosition;
    }
     public int count(char character){
        int count = 0;
        for(int index = 0; index < string.length(); index++){
            if(string.charAt(index) == character){
                count++;
            }
        }
         return count;
    }
    public int count(boolean ignoreCase, char character){
        int count = 0;
        if(ignoreCase) {
            string = string.toLowerCase();
            character = Character.toLowerCase(character);
            for (int index = 0; index < string.length(); index++) {
                if (string.charAt(index) == character) {
                    count++;
                }
            }
        }
        else{
            count(character);
        }
        return count;
    }
}
