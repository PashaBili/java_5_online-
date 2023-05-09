package ua.com.alevel;

public class Numbers {
    public int getNumbers(String count) {
        char[] charsNum = count.toCharArray();            // створюю з рядка масив чарів
        int sum = 0;
        for (char c : charsNum) {                         // пробігся масивом
            if (c <= 57 && c >= 48) {                     // якщо у введеному рядку були цифри згідно з діапазоном (ascii),
                sum = sum + Character.getNumericValue(c); // отримую числове значення, пов'язане із зазначеним індексом і підсумовую значення даних індексів
            }
        }
        return (sum);
    }
}
