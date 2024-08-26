---

# Searching Algorithms

This repository contains implementations and explanations of common searching algorithms used in computer science. Searching algorithms are used to find a specific element or value within a data structure, such as an array or list.

## Table of Contents

- [Introduction](#introduction)
- [Linear Search](#linear-search)
- [Binary Search](#binary-search)
- [How to Use](#how-to-use)
- [Contributing](#contributing)
- [License](#license)
- [Resource](https://www.geeksforgeeks.org/searching-algorithms/)

## Introduction

Searching algorithms are fundamental techniques used in various applications to locate elements within a collection of data. This repository provides implementations of two widely used searching algorithms:

1. **Linear Search**: A simple search technique that checks each element in the list until the desired element is found.
2. **Binary Search**: A more efficient search technique that works on sorted arrays by repeatedly dividing the search interval in half.

## Linear Search

### Overview

Linear search is the most straightforward searching algorithm. It traverses the list sequentially and compares each element with the target value. If the target value is found, the search stops, and the index of the element is returned.

### Algorithm

1. Start from the first element in the array.
2. Compare the current element with the target value.
3. If the current element matches the target, return its index.
4. If the target is not found and the end of the list is reached, return `-1`.

### Implementation


Here is an example implementation of the Linear Search algorithm in JAVA:
```JAVA
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int num = 4;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(num + " is found at " + i + " index");
                break;
            }
        }
        if (i == arr.length) {
            System.out.println(num + " not found in array");
        }
    }
}
```

### Time Complexity

- **Best Case**: O(1) (when the target is the first element)
- **Worst Case**: O(n) (when the target is the last element or not present)
- **Average Case**: O(n)


## Binary Search

### Overview

Binary search is a more efficient algorithm but requires the list to be sorted. It works by dividing the search interval in half and repeatedly narrowing down the range until the target value is found.

### Algorithm

1. Initialize two pointers, `low` and `high`, at the beginning and end of the list.
2. Calculate the middle index, `mid = (low + high) // 2`.
3. Compare the target value with the element at the middle index:
   - If the target equals the middle element, return the index.
   - If the target is less than the middle element, narrow the search to the left half by setting `high = mid - 1`.
   - If the target is greater than the middle element, narrow the search to the right half by setting `low = mid + 1`.
4. Repeat steps 2-3 until the target is found or the search range is empty.
5. If the target is not found, return `-1`.

### Implementation

Here is an example implementation of the Binary Search algorithm in JAVA:

```JAVA
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int num = 7;
        int low = 0;
        int high = arr.length - 1;
        int mid = low + (high - low) / 2;
        // int mid = (low + high) / 2;
        while (low <= high) {
            if (arr[mid] == num) {
                System.out.println(num + " at " + mid + " index");
                break;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            // mid = (low + high) / 2;
            mid = low + (high - low) / 2;
        }
        if (low > high) {
            System.out.println("element not found");
        }

    }
}

```

### Time Complexity

- **Best Case**: O(1) (when the target is the middle element)
- **Worst Case**: O(log n) (when the list is repeatedly halved)
- **Average Case**: O(log n)

## How to Use

Clone this repository and explore the `linear_search.java` and `binary_search.java` files to see the implementations. You can also run the example usage code provided to test the algorithms with different input arrays and target values.

```bash
git clone https://github.com/Piyushraj7982/Searching-Algorithms.git
cd Searching-Algorithms
```

## Contributing

Contributions are welcome! If you'd like to contribute, please fork the repository and create a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize this template to suit your project's needs!
