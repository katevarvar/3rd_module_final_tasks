package oOPBasics.abstractClassesAndInterfaces;

public class Main {
    public static void main(String[] args) {

        String[] spamKeywords = {"idiot", "fuck", "ass", "slut", "spam", "full"};
        String testSpam = "This is spam";
        String testTooLong = "hfehhiesgldsjgijgirjpejreflkkdsljeirjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjiejflkdsnv.sdnfehioejesmflmmroejrijrijeflenljjtijlesmfsmffljejjtjflsdflklrjljfejjpijpjpj";
        String testNegativeText = " I am upset :(";
        String text;

        TextAnalyzer[] textAnalyzers = {
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(4),
        };

        System.out.println(checkLabels(textAnalyzers, testSpam));
        System.out.println(checkLabels(textAnalyzers, testNegativeText));
        System.out.println(checkLabels(textAnalyzers, testTooLong));
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer: analyzers) {
            if (analyzer.processText(text) != Label.OK) {
                return analyzer.processText(text);
            }
        }
        return Label.OK;
    }

}


