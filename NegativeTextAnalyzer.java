package oOPBasics.abstractClassesAndInterfaces;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

         NegativeTextAnalyzer() {
            this.keywords = new String[3];
            this.keywords[0] = ":(";
            this.keywords[1] = "=(";
            this.keywords[2] = ":|";
            this.label = Label.NEGATIVE_TEXT;
        }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
