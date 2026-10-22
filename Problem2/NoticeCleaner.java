import java.util.*;
public class NoticeCleaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence=sc.nextLine();
        String keyword=sc.nextLine();

        String trimmed=sentence.trim();
        String[] words=trimmed.split("\\s+");

        StringBuilder sb=new StringBuilder();
        sb.append(words[0].toLowerCase());

        for (int i=1;i<words.length;i++) {
            sb.append(" ");
            sb.append(words[i].toLowerCase());
        }

        sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));

        String shortest=words[0].toLowerCase();
        int keywordCount=0;
        int vowelCount=0;

        for (String word:words) {
            String lower=word.toLowerCase();

            if(lower.length()<shortest.length()) {
                shortest=lower;
            }

            if (lower.equals(keyword.toLowerCase())) {
                keywordCount++;
            }
        }

        for (int i=0;i<sentence.length();i++) {
            char ch =Character.toLowerCase(sentence.charAt(i));
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vowelCount++;
            }
        }
        System.out.println("Sentence: " + sb);
        System.out.println("Words: " + words.length);
        System.out.println("Shortest word: " + shortest);
        System.out.println("Keyword count: " + keywordCount);
        System.out.println("Vowels: " + vowelCount);
        sc.close();
    }
}
