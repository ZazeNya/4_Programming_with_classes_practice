import java.io.*;
/* Задача 1
    Создать объект класса Текст, используя классы Предложение, Слово.
    Методы: дополнить текст, вывести на консоль текст, заголовок текста.
    */
public class Program {
    private static Word[] createArrWords(String str) {
        String[] strArr = str.split(" ");
        Word[] words = new Word[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            words[i] = new Word(strArr[i]);
        }
        return words;
    }

    private static Word[] words_01 = createArrWords("Who is John Galt");
    private static Word[] words_02 = createArrWords("The light was ebbing, and Eddie Willers could not distinguish the bum's face");
    private static Word[] wordsAdd_01 = createArrWords("The bum had said it simply, without expression");
    private static Word[] wordsAdd_02 = createArrWords(" But from the sunset far at the end of the street, yellow glints caught his eyes");
    private static Sentence[] sentencesList = new Sentence[]{new Sentence('?', words_01),
            new Sentence('.', words_02)};
    private static Sentence[] sentencesAdd = new Sentence[]{new Sentence('.', wordsAdd_01),
            new Sentence('!', wordsAdd_02)};


    public static void main(String[] args) throws IOException {
        Text text = new Text("Atlas Shrugged.", sentencesList);
        text.printTitle();
        System.out.println("\nИсходный текст: ");
        text.printText();
        System.out.println("\nИзмененный текст: ");
        text.completeText(sentencesAdd);
        text.printText();
        }
}
