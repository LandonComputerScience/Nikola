public class LipogramAnalyzer {

    private String text;

    public LipogramAnalyzer(String text){
        this.text = text;
    }

    public String mark(char letter) {
        String text2 = text.replace(letter, '#');
        return text2;
    }
    public String allWordsWith(char letter){
        String offenders = "";
        for (int i = text.indexOf(letter); i <= text.lastIndexOf(letter); i = text.indexOf(letter,i+1)){
            String temp = text.substring(text.lastIndexOf(' ',i),text.indexOf(' ',i));
            offenders = (offenders + "/n" + temp);

        }
        return offenders;
    }
}
