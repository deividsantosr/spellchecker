# SpellChecker Project

This project is designed to generate transpositions of a given word. A transposition involves swapping adjacent characters in the word.

## Technologies

**Java**: The core programming language used to develop the application logic.
  
**Java Swing**: A graphical user interface (GUI) toolkit used to create the user interface of the application.
  
**JFrame**: A Swing component used to create the main window of the GUI, allowing the user to interact with the application.

## Input and Output

The input is a single word, and the program generates all possible transpositions by swapping adjacent characters in the word.

### Example Input:

The input is a single word, and the program generates all possible transpositions by swapping adjacent characters in the word.

There is dictionary file located at `spellchecker/src/spellchecker/dictionary/words`. 

The file contain a list of words, one per line. The program will read these words, generate transpositions for each, and output them.

## Input:
```
ABSTRACAO
```

## Output

The program will output a list of words generated by the transpositions.

### Example Output:
```
BASTRACAO
ASBTRACAO
ATSBTRACAO
ARTSBACAO
AARTSBCAO
ACRTSBBAO
ACSTBRABO
ACSBTRAO
```


## How to Run

To run the project, import it into **NetBeans IDE**. 

The program opens a **Graphical User Interface (GUI)** where you can type a word, and the system will display the transpositions of the input word in a field on the GUI.

1. Import the project into NetBeans IDE.
2. Open the `SpellChecker.java` file.
3. Run the project.
4. Enter a word in the provided input field and click the button to generate the transpositions.
5. The transposed words will appear in a result field on the GUI.
