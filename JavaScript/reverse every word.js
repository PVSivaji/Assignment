function reverseEveryWordInSentence(sentence) {
 // Split the sentence into words
 var words = sentence.split(' ');

 // Reverse each word and store it back in the words array
 for (var i = 0; i < words.length; i++) {
    words[i] = words[i].split('').reverse().join('');
 }

 // Join the words back into a sentence and return it
 return words.join(' ');
}

// Get user input
var userInput = prompt("Enter a sentence:");

// Call the function and display the result
alert(reverseEveryWordInSentence(userInput));
