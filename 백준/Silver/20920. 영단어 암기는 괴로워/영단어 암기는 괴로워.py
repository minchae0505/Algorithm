from collections import Counter

# 입력 받기
import sys
input = sys.stdin.read
data = input().splitlines()

N, M = map(int, data[0].split())
words = data[1:]

# 단어 필터링 (길이가 M 이상인 단어만)
filtered_words = [word for word in words if len(word) >= M]

# 단어 등장 횟수 계산
word_count = Counter(filtered_words)

# 정렬
sorted_words = sorted(word_count.keys(), key=lambda x: (-word_count[x], -len(x), x))

# 출력
print("\n".join(sorted_words))
