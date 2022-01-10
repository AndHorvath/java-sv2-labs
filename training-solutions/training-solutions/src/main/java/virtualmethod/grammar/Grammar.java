package virtualmethod.grammar;

public class Grammar {

    public static void main(String[] args) {
        String word = "olvas";
        String preposition = "el";
        String suffix = "tad";

        Verb verbPhrasal = new PhrasalVerb(word, preposition);
        Verb verbPhrasalWithSuffix = new PhrasalVerbWithSuffix(word, preposition, suffix);

        Preposition prepositionPhrasal = new PhrasalVerb(word, preposition);
        Preposition prepositionPhrasalWithSuffix = new PhrasalVerbWithSuffix(word, preposition, suffix);

        PhrasalVerb phrasalVerbPhrasal = new PhrasalVerb(word, preposition);
        PhrasalVerb phrasalVerbPhrasalWithSuffix = new PhrasalVerbWithSuffix(word, preposition, suffix);

        Suffix suffixPhrasalWithSuffix = new PhrasalVerbWithSuffix(word, preposition, suffix);

        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix(word, preposition, suffix);

        System.out.println(verbPhrasal.getWord());
        System.out.println(verbPhrasalWithSuffix.getWord());
        System.out.println();

        System.out.println(prepositionPhrasal.getPreposition());
        System.out.println(prepositionPhrasal.getWholeWord());
        System.out.println(prepositionPhrasalWithSuffix.getPreposition());
        System.out.println(prepositionPhrasalWithSuffix.getWholeWord());
        System.out.println();

        System.out.println(phrasalVerbPhrasal.getWord());
        System.out.println(phrasalVerbPhrasal.getPreposition());
        System.out.println(phrasalVerbPhrasal.getWholeWord());
        System.out.println(phrasalVerbPhrasalWithSuffix.getWord());
        System.out.println(phrasalVerbPhrasalWithSuffix.getPreposition());
        System.out.println(phrasalVerbPhrasalWithSuffix.getWholeWord());
        System.out.println();

        System.out.println(suffixPhrasalWithSuffix.getSuffix());
        System.out.println();

        System.out.println(phrasalVerbWithSuffix.getWord());
        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getSuffix());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
    }
}