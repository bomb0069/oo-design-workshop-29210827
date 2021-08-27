public class Range {
    private String text;

    public Range(String text) {

        this.text = text;
    }

    public boolean isStartWithInclusive() {

        return text.startsWith("[");
    }

    public int getStartInput() {
        int beginOfStartInput = 1;
        return Integer.parseInt(text.substring(beginOfStartInput, 2));
    }

    public boolean isEndWithInclusive() {
        return text.endsWith("]");
    }
}
