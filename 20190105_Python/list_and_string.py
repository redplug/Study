my_list = [1,2,3,4,5,6]
print(my_list[0])
print(my_list[1])
print(3 in my_list)
print(9 in my_list)
print(my_list.index(5))

#문자도 숫자 리스트와 동일하게 위치와 찾기가 가능함.
str = "Hello world"
print(str[0])
print(str[1])
print("H" in str)
print("z" in str)
print(str.index("r"))

characters = list("abcdef")
print(characters)

words = "Hello World는 프로그래밍을 배우기가 아주 좋은 사이트 입니다."
print(words)
word_list = words.split() # 공백 기준으로 분할
print(word_list)

time_str = "10:35:27"
time_list = time_str.split(":") # : 기준으로 분할
print(time_str)
print(time_list)

#다시 합치기 join
print(":".join(time_list))
print(" ".join(word_list))




# 문제 설명
# 다음 코드는 "오늘은 날씨가 흐림"이라는 문자열을 "오늘은 날씨가 맑음"이라는 
# 문자열로 바꾸는 과정을 보여주고 있습니다. 
# 코드의 안내를 따라 빈 부분을 작성해 보세요.

str = "오늘은 날씨가 흐림"
print(str)

# split()을 이용해서 str을 공백으로 나눈 문자열을 words에 저장하세요
words = str.split()
print(words)

# index()를 이용해서 "흐림"이 words의 몇번째에 있는지 찾고, 
# position에 저장하세요.
position = words.index("흐림")
print(position)	

words[position] = "맑음"

# join()을 이용해서 words를 다시 문자열로 바꿔 new_str에 저장하세요. 
# words를 문자열로 바꿀때는 공백 한 칸을 기준으로 붙이면 됩니다.
new_str = " ".join(words)


print(new_str)