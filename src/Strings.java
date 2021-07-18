import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class Strings {
    /* //1.Вырезать подстроку из строки с первого вхождения символа (А) до последнего вхождения символа(В)
     public static void symbol(String a, String b, String str) {
         int index1 = str.indexOf(a);
         int index2 = str.lastIndexOf(b);
         String str1 = str.substring(index1, index2);
         System.out.println(str1);
     }

     //2.Заменить все вхождения символа стоящего в позиции(3) на символ стоящий в позиции 0
     public static void symbol1(String str) {
         System.out.println("charAt(0) = " + str.charAt(0));
         System.out.println("charAt(3) = " + str.charAt(3));
         System.out.println(str.replace(str.charAt(3), str.charAt(0)));


     }


    //3.В исходной файле находятся слова каждое слово на новой строек. После запуска программы
// должен создать файл, который будет содержать в себе только полиндромы
    public static void symbol2(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            StringBuilder buffer = new StringBuilder(words[i]);
            buffer.reverse();
            String data = buffer.toString();
            if (words[i].equals(data)) {
                System.out.println(words[i]);
            }
        }
    }

     */



    private static final String STR=("Был жаркий летний день. Солнце светило ярко. " +
            "Небо было голубое. Три девочки Анна, Марина и Юля собирали в поле цветы. " +
            "Они набрали по букету разных цветов: ромашки, васильки, одуванчики." +
            "А потом сплели из полевых цветов красивые венки на голову.");




    public static void main(String[] args) {
        /* symbol("а", "в", "Здесь написана какая-то строка в методе мейн");
        symbol1("Здесь написана какая-то строка в методе мейн");
        symbol2("мечем казак телик мадам ветка анна");

         */

        String [] sentences = TextFormatter.getSentencesFromText(STR);
        TextFormatter.countWords(sentences);
        TextFormatter.palindrome(sentences);

    }
}








