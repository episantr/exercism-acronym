import java.util.Locale;

class Acronym {

    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {

        String[] strings = phrase.trim().split("(-)|(\\s+)");

        String acronym = "";

        for (String string : strings) {
            acronym = acronym.concat(getFirstLetter(string));
        }

        return acronym.toUpperCase(Locale.ENGLISH);
    }

    private String getFirstLetter(String string) {
        if (!string.isEmpty()) {
            for (char c:string.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    return String.valueOf(c);
                }
            }
        }
        return "";
    }
}
