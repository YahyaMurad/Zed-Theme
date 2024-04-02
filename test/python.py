def calculate_area(width, height):
    return width * height

width = float(input("Enter the width of the rectangle: "))
height = float(input("Enter the height of the rectangle: "))

area = calculate_area(width, height)
print("The area of the rectangle is:", area)
