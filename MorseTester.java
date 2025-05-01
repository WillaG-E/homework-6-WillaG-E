public class MorseTester {
    public static void main(String[] args) {
        MorseTree tree = new MorseTree();

        //Pre-Order of Tree
        System.out.println("Preorder tree contents: " + tree.preorder());

        //Post-Order of Tree
        System.out.println("Postorder tree contents: " + tree.postorder());

        String input = "The quick fox";
        System.out.println("\nInput: " + input);

        //Translate English Text to Morse
        String morse = tree.engToMorse(input);
        System.out.println("Output: " + morse);

        //Translate Morse to English Text
        String decoded = tree.morseToEng(morse);
        System.out.println("Decoded: " + decoded);

    }
}