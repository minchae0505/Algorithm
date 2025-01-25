def is_acceptable(password):
    vowels = {'a', 'e', 'i', 'o', 'u'}
    has_vowel = False
    consecutive_vowels = 0
    consecutive_consonants = 0
    prev_char = ''
    
    for i, char in enumerate(password):
        if char in vowels:
            has_vowel = True
            consecutive_vowels += 1
            consecutive_consonants = 0
        else:
            consecutive_consonants += 1
            consecutive_vowels = 0
        
        if consecutive_vowels == 3 or consecutive_consonants == 3:
            return False
        
        if prev_char == char and char not in {'e', 'o'}:
            return False
        
        prev_char = char

    if not has_vowel:
        return False
    
    return True

import sys
input = sys.stdin.read
data = input().splitlines()

for password in data:
    if password == "end":
        break
    if is_acceptable(password):
        print(f"<{password}> is acceptable.")
    else:
        print(f"<{password}> is not acceptable.")
