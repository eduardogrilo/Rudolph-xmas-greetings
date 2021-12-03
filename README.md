# SecondBlipChallenge
## Rudolph's Christmas greetings

Rudolph likes to spice up his Christmas cards by messing around with the greetings text. He likes to move around with the vowels on the greetings to make them hard to read. When he wants to write a message he reverses the order of all the vowels making them a little hard to read.

For example the greeting "Merry Christmas & Happy New Year!" contains the vowels from the back "aeeaaie". He then writes the greeting replacing these vowels instead: "Marry Chrestmes & Happy Naw Yier!"

Write a program that will accept a greeting message and reverse the vowels in this manner.

Function signature
reverseVowels(String greeting) returns String

Examples:
reverseVowels("Merry Christmas & Happy New Year!") should return "Marry Chrestmes & Happy Naw Yier!"
reverseVowels("James") should return "Jemas"
reverseVowels("Bob") should return "Bob"
reverseVowels("Unwrap yourself a joyful Christmas!") should return "anwrip yuorsalf e juyfol ChrastmUs!"
reverseVowels("ZZZ") should return "ZZZ"
reverseVowels("aeiou") should return "uoiea"

Constraints
Length of input string can be in the range of 0 to 1,000 characters
Only english vowels are to be used: "aeiou" and "AEIOU"
