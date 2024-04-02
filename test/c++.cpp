#include <iostream>

double calculateArea(double width, double height) {
    return width * height;
}

int main() {
    double width, height;
    std::cout << "Enter the width of the rectangle: ";
    std::cin >> width;
    std::cout << "Enter the height of the rectangle: ";
    std::cin >> height;

    double area = calculateArea(width, height);
    std::cout << "The area of the rectangle is: " << area << std::endl;
    
    return 0;
}
