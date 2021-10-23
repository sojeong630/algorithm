N = int(input()) # 몇 명?
list = [] # 저장할 리스트

for i in range(N): # 출발 종료시간을 한명한명 받아줌
    start, end = map(int, input().split())
    list.append([start, end])

list.sort(key=lambda x:(x[1],x[0])) # 먼저 1번 인덱스 정렬, 그다음 0번 정렬

count = 1 # 예약 카운트  종료 시간이 제일 빠른애는 일단 등록하고 시작했으니 1부터

end = list[0][1] # 종료시간인 end 현재는 제일 첫 리스트
for j in range(1, N):
    if list[j][0] >= end: # 현재 비교하는 사람의 시작 시간이 현재 사람의 종료시간보다 같거나 늦다면
        count +=1 # 예약 하나 늘었고
        end = list[j][1] # 이제 현재 예약한 사람의 종료시간으로 바꿔줌
        
print(count)
