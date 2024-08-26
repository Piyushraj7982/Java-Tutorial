---

# Sorting Algorithms in Java

This repository contains implementations and explanations of various sorting algorithms in Java. Sorting algorithms are fundamental techniques used to arrange elements in a particular order, typically ascending or descending.

## Table of Contents

- [Introduction](#introduction)
- [Sorting Algorithms](#sorting-algorithms)
  - [Bubble Sort](#bubble-sort)
  - [Selection Sort](#selection-sort)
  - [Insertion Sort](#insertion-sort)
  - [Merge Sort](#merge-sort)
  - [Quick Sort](#quick-sort)
- [How to Use](#how-to-use)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Sorting is a common task in computer science, and various algorithms have been developed to efficiently sort data. This repository provides implementations of several well-known sorting algorithms in Java, along with explanations of how they work and their time complexities.

## Sorting Algorithms

### Bubble Sort

**Overview**: Bubble Sort is a simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.

**Implementation**:
```java
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
```

**Time Complexity**:
- **Best Case**: O(n) (when the array is already sorted)
- **Worst Case**: O(n^2)
- **Average Case**: O(n^2)

### Selection Sort

**Overview**: Selection Sort works by repeatedly finding the minimum element from the unsorted part of the array and placing it at the beginning.

**Implementation**:
```java
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
```

**Time Complexity**:
- **Best Case**: O(n^2)
- **Worst Case**: O(n^2)
- **Average Case**: O(n^2)

### Insertion Sort

**Overview**: Insertion Sort builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort or merge sort.

**Implementation**:
```java
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
```

**Time Complexity**:
- **Best Case**: O(n) (when the array is already sorted)
- **Worst Case**: O(n^2)
- **Average Case**: O(n^2)

### Merge Sort

**Overview**: Merge Sort is a Divide and Conquer algorithm that divides the array into halves, recursively sorts them, and then merges the sorted halves.

**Implementation**:
```java
public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
```

**Time Complexity**:
- **Best Case**: O(n log n)
- **Worst Case**: O(n log n)
- **Average Case**: O(n log n)

### Quick Sort

**Overview**: Quick Sort is an efficient sorting algorithm that uses a Divide and Conquer approach to sort the array. It selects a pivot element and partitions the array into two sub-arrays, which are recursively sorted.

**Implementation**:
```java
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
```

**Time Complexity**:
- **Best Case**: O(n log n)
- **Worst Case**: O(n^2) (when the pivot is the smallest or largest element)
- **Average Case**: O(n log n)

## How to Use

Clone this repository and explore the Java files for each sorting algorithm. You can compile and run the code using any Java development environment or through the command line.

```bash
git clone https://github.com/Piyushraj7982/Sorting-Algorithms.git
cd Sorting-Algorithms
```

Each sorting algorithm is implemented in its own Java class. You can test the algorithms by running the provided example code in each class.

## Contributing

Contributions are welcome! If you'd like to contribute, please fork the repository and create a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
