package app;

public class DataHandler {
    public String handleData(Object[] items) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        // Цикл обробки масиву узагальненого типу
        for (Object item : items) {
            count++;
            sb.append(String.format("(%d) %s ", count, item));
        }
        return sb.toString();
    }
}