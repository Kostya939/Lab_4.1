# Перевірка паліндрома

## Опис

Цей проект реалізує функцію для перевірки, чи задане слово є паліндромом. Паліндром - це слово, яке можна читати так само як зліва направо, так і справа наліво, ігноруючи регістр та пробіли.

## Використання

1. Використовуйте функцію `isPalindrome` з класу `PalindromeChecker` для перевірки, чи слово є паліндромом.

   ```java
   String word = "А роза упала на лапу Азора";
   boolean isPalindromic = PalindromeChecker.isPalindrome(word);
   System.out.println("Is the word a palindrome? " + isPalindromic);
## Вимоги до середовища
Java SDK встановлено на вашому комп'ютері.

## Тестування
Для тестування функції isPalindrome використовується бібліотека JUnit. Код тестів міститься в класі PalindromeCheckerTest. Щоб запустити тести, впевніться, що у вас встановлено JUnit та запустіть тестовий клас PalindromeCheckerTest.

## Автор
Автор: [Козачок Костянтин]
