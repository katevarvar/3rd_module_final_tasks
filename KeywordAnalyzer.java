package oOPBasics.abstractClassesAndInterfaces;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    public String[] keywords;
    Label label;

    @Override
    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword))
                return getLabel();
        }
        return Label.OK;
    }

    public abstract String[] getKeywords();

    public abstract Label getLabel();

}
