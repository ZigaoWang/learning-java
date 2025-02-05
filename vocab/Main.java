public class Main {
    public static void main(String[] args) {
        String[] vocabArray = {"time", "food", "dogs", "cats", "health", "plants", "sports"};
        Vocab vocab = new Vocab(vocabArray);

        String[] wordArray = {"dogs", "toys", "sun", "plants", "time"};

        int count = vocab.countNotInVocab(wordArray);
        System.out.println("Count of words not in vocab: " + count);

        String[] notInVocabWords = vocab.notInVocab(wordArray);
        System.out.print("Words not in vocab: ");
        for (int i = 0; i < notInVocabWords.length; i++) {
            System.out.print(notInVocabWords[i]);
            if (i < notInVocabWords.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
