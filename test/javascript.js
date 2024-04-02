function calculateArea(width, height) {
  return width * height;
}

const width = parseFloat(prompt("Enter the width of the rectangle: "));
const height = parseFloat(prompt("Enter the height of the rectangle: "));

const area = calculateArea(width, height);
console.log("The area of the rectangle is:", area);
