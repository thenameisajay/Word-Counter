# Word-Counter

My program has the following features :

• Accept two arguments from the command line.
– The first argument is the name (and path) of the file containing the text
– The second argument is the word that is being searched for.

– If either argument is missing, it shows output of the following message:
         Usage: java WordCounter <filename> <searchTerm>
         
– If the specified file does not exist in the given location, it's output is of : File not found:
followed by a space and the name of the file.

• Searches through the file for occurrences of the specified word.
– The word should only be counted when it appears as a whole word. For example, when searching for hope , the word orthopedic should not count as a match.
– To keep things simple, a word is defined as a continuous sequence of characters from the ranges A–Z, a–z, 0–9, and the underscore ( _ ) character. All other characters should be ignored. Hence, they're counts as two separate words they and re .

• Printing the results to the terminal.
– The message printed should have the form “The word ‘<word>’ appears <number> time(s).”
– For example:
The word 'animal' appears 17 times.
The word 'lugubrious' appears 1 time. 
• Support searching for multiple words at once.

– All command-line arguments from the second argument onwards are treated as words to search for.
– If multiple words are specified, instead of printing the message specified above, the results are shown as a table in the following form:
|---------|-------| 
| WORD    | COUNT | 
|---------|-------|
|round    | 17    | 
| ability | 0     |
| enemy   | 1     |
|---------|-------|
|TOTAL    | 18    |
|---------|-------|

– The columns in this view adapts to the lengths of the words and numbers shown: they should be wide enough to display all words and numbers with at least one space on either side, as shown.
– Words and column-headers should be left-aligned, while numbers should be right- aligned.
