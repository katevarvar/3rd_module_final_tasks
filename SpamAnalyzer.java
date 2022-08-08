package oOPBasics.abstractClassesAndInterfaces;

public class SpamAnalyzer extends KeywordAnalyzer {

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
       return Label.SPAM;
    }
}
