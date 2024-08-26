<h2> For Number </h2>
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

```JAVA
public class LinearSearch {
    public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    int num = 9;
    boolean found = false;

    for (int i = 0; i < arr.length; i++) {
    if (arr[i] == num) {
    System.out.println(num + " is found at " + i + " index");
    found = true;
    break; // exit the loop once the number is found
    }
}

    if (!found) {
        System.out.println(num + " not found in array");
        }
    }
}
```

<h2> For String </h2>
    
```JAVA
public class LinearSearch {
    public static void main(String[] args) {
        String[] arr = { "pk", "ck", "dk", "kk", "rk" };
        String name = "jk";
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                System.out.println(name + " is found at " + i + " index");
                break;
            }
        }
        if (i == arr.length) {
            System.out.println(name + " not found in array");
        }
    }
}
```
