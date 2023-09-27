
word = "paragraph"
char = "g"

# Find the index of 'g' from the end
index_from_end = word.rfind(char)

if index_from_end != -1:
    print(f"The index of '{char}' from the end is {index_from_end}")
else:
    print(f"'{char}' not found in the word.")
