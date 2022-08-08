package oOPBasics.abstractClassesAndInterfaces;

public class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

     TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label getLabel() {
        return Label.TOO_LONG;
    }

    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            return getLabel();
        } else {
            return Label.OK;
        }
    }

}



