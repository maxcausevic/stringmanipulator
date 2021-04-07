public class StringManipulator {
    public String trimAndConcat(String a, String b) {
        return a.trim().concat(b.trim());
    }

    public Integer getIndexOrNull(String str, char c) {
        int index = str.indexOf(c);
        if (index > -1) {
            return index;
        } else {
            return null;
        }
    }

    public Integer getIndexOrNull(String a, String b) {
        int index = a.indexOf(b);
        if (index> -1) {
            return index;
        } else {
            return null;
        }

    }

    public String concatSubstring(String a, int x, int y, String b) {
        String substring = a.substring(x,y);
        System.out.println(substring);
            return substring.concat(b);

        

    }

}