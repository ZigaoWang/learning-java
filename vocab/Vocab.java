public class Vocab {
    private String[] theVocab;

    public Vocab(String[] vocabArray) {
        theVocab = vocabArray;
    }

    public boolean findWord(String str) {
        for (String word : theVocab) {
            if (word.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int countNotInVocab(String[] wordArray) {
        int count = 0;
        for (String word : wordArray) {
            if (!findWord(word)) {
                count++;
            }
        }
        return count;
    }

    public String[] notInVocab(String[] wordArray) {
        int count = countNotInVocab(wordArray);
        String[] result = new String[count];
        int index = 0;
        for (String word : wordArray) {
            if (!findWord(word)) {
                result[index] = word;
                index++;
            }
        }
        return result;
    }
}
