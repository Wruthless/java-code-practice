# Java Code Practice

Just a playground for fundamental computing tasks written in Java. All source code is under the `src` directory.

### StringPermutation.java
**Detect if a string is a permutation of another.**

An empty array of integers is created along with three `for` loops. The first loop cast the chars in the array to ints 
to obtain the ordinal values of the characters. The ordinal value is used to increment
the value stored at the related index.


```java
    for (int i = 0; i < string1.length(); i++) {
        arr[(int) string1.charAt(i)] += 1;
    }
```


The second loop iterates through the characters in the second string. For every ordinal value that is found
decrement the value at the related index.
 
```java
    for (int i = 0; i < string2.length(); i++) {
        arr[(int) string2.charAt(i)]  -= 1;
    }
```

The third loop checks the array for non-zero values, if non-zero values exist the value was not decremented
due to a match in the opposing string so return `false`.

```java
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] != 0) return false;
    }
```
<br>

### UniqueCharacters.java
- Verify if a string contains all unique characters.

### RepeatingCharacters.java
- Return the number of repeated characters in a string.

### URLEncoding.java
- Encode spaces in a URL with "%20" instead of "+".