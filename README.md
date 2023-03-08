# Word-Counter

---

## Description 

Word-Counter is a Java program that searches for specified words in a given text file and counts their occurrences. It provides a simple yet powerful command-line interface with several features, including searching for multiple words at once.

To use the program, simply provide the name and path of the text file to search and the word(s) to look for as command-line arguments. The program will then search for occurrences of the specified words in the file and print the results to the terminal.

If either argument is missing, the program shows an output message describing the correct usage. If the specified file does not exist, it displays an error message indicating that the file was not found.

The program also supports searching for multiple words at once. When multiple words are specified, the results are displayed in a table format, with columns for each word and their respective counts. The table view is dynamically sized to fit the longest word and count.

Overall, Word-Counter provides a simple yet effective way to search for and count words in text files.


---

## Installation and Usage

My program has the following features :

• Accept two arguments from the command line.
– The <strong> first argument </strong> is the name (and path) of the file containing the text.
– The <strong> second argument </strong> is the word that is being searched for.

– If either argument is missing, it shows output of the following message:
         Usage: <code> java WordCounter <filename> <searchTerm> </code>
         
– If the specified file does not exist in the given location, it's output is of : <code> File not found:
followed by a space and the name of the file. </code>

To install :
<ol>
       <li> Clone the repository and run the program using the following command:
       <li> Compile the program using the following command in src folder : <code> javac *.java </code>
       <li> Run the program using the following command in src folder : <code> java WordCounter filename searchTerm </code> 
</ol>

---

## Features
– Searches through the file for occurrences of the specified word.
– The word should only be counted when it appears as a whole word. For example, when searching for hope , the word orthopedic does not count as a match.
– To keep things simple, a word is defined as a continuous sequence of characters from the ranges A–Z, a–z, 0–9, and the underscore ( _ ) character. All other characters are to be ignored. Hence, they're counted as two separate words.
– Printing the results to the terminal.
– The message printed has the form “The word ‘<word>’ appears <number> time(s).”
#### For example:
* The word 'animal' appears 17 times.
* The word 'lugubrious' appears 1 time. 
* Support searching for multiple words at once.

* All command-line arguments from the second argument onwards are treated as words to search for.
* If multiple words are specified, instead of printing the message specified above, the results are shown as a table in the following form:
* The columns in this view adapts to the lengths of the words and numbers shown: they should be wide enough to display all words and numbers with at least one space on either side, as shown.
* Words and column-headers should be left-aligned, while numbers should be right-aligned.

<table>
<thead>
<tr class="header">
<th style="text-align: left;">WORD</th>
 <th style="text-align: right;">COUNT</th>
</tr> </thead> <tbody>
<tr class="odd">
<td style="text-align: left;">round</td>
<td style="text-align: right;">17</td>
</tr>
<tr class="even">
<td style="text-align: left;">ability</td>
<td style="text-align: right;">0</td>
</tr> 
<tr class="odd">
<td style="text-align: left;">enemy</td>
<td style="text-align: right;">1</td>
</tr>
<tr class="even">
<td style="text-align: left;">TOTAL</td>
<td style="text-align: right;">18</td>
</tr>
</tbody>
</table>

---
## CONTRIBUTION GUIDELINES
<ul>
<li> Clone the repository from GitHub.
<li> Create a new branch for your feature or bug fix.
<li> Implement your feature or bug fix.
<li> Commit your changes and push to your branch on the GitHub server.
<li> Submit a merge request to merge your changes into the main branch.
</li>
</ul>

---

## LICENSE
This project is done part of coursework of <strong> CS5001 - Object-Oriented Programming </strong> of the <strong> Computer Science Dept of University of St.Andrews.</strong>
This project is licensed under the <code> MIT License </code> - see the <code> LICENSE.md </code> file for details.
