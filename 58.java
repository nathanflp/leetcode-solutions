class Solution {
    public int lengthOfLastWord(String s) {
        String word = s;
        int tamanho= 0;

        String[] lastWord = word.split(" ");
        for (int i = lastWord.length; i > lastWord.length - 1; i--) {
            tamanho = (int) lastWord[i-1].length();
            System.out.println(tamanho);
        }
        return tamanho;
    }
}
