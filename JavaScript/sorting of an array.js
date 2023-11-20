// Function to sort an array in descending order
function descendingSort(array) {
    return array.sort((a, b) => b - a);
  }
  
  // Get input from the user
  let inputArray = prompt("Enter the elements of the array separated by commas: ");
  
  // Convert the input string into an array of numbers
  let numbersArray = inputArray.split(",").map(Number);
  
  // Sort the array in descending order
  let sortedArray = descendingSort(numbersArray);
  
  // Display the sorted array
  console.log("The sorted array is:", sortedArray);
  
  