public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        String str12 = str1.trim();
        String str21 = str2.trim();
        String str32 = str12 + str21;
        return str32;
    }
    public Integer getIndexOrNull(String this_string, char letter){
        int index = -1;
        char this_char;
        for (int i =0;i<this_string.length(); i++){
            this_char = this_string.charAt(i);
            if (this_char == letter){
                index = i;
                return index;
            }
        }
        return null;
    }
    public Integer getIndexOrNull(String this_string, String sub_string){
        int index = -1;
        char this_char;
        char compare;
        int start = -1;
        int k;
        for (int i =0;i<this_string.length(); i++){
            this_char = this_string.charAt(i);
            if (this_char == sub_string.charAt(0)){
                start = i;
                for (k = 0; k < sub_string.length(); k++){
                    if(i>=this_string.length()){
                        break;
                    }
                    this_char = this_string.charAt(i);
                    compare = sub_string.charAt(k);
                    i++;
                    if(this_char != compare){
                        break;
                    }
                }
                if (k >= sub_string.length()){
                    return start;
                }
            }
        }
        return null;
    }
    public String concatSubstring(String butcher,int indx1, int indx2,String ender){
        String newstring;
        String subString = butcher.substring(indx1,indx2);
        newstring = subString+ender;
        return newstring;
    }
}