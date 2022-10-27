### 좌표계산기 구현
---
## 기능 요구 사항
* 사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다.
* 좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다.
* X, Y좌표 모두 최대 24까지만 입력할 수 있다.
* 입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
* 좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
* 직선인 경우는 두 점 사이 거리를 계산해서 출력한다.

### 추가 요구사항 (사각형 처리) 
* 좌표값을 네 개 입력한 경우, 네 점을 연결하는 사각형으로 가정한다.
* 네 점이 뒤틀어진 사다리꼴이나 마름모는 제외하고 직사각형만 허용하도록 검사한다.
* 사각형인 경우 사각형의 넓이를 계산해서 출력한다

### 2차 추가 요구사항 (삼각형 처리)
* 좌표값을 세 개 입력한 경우, 세 점을 연결하는 삼각형으로 가정한다.
* 삼각형인 경우 삼각형의 넓이를 계산해서 출력한다.

---
## 실행 결과 예시
좌표를 입력하세요.

(10,10)-(14,15)

두 점 사이 거리는 6.403124

or

좌표를 입력하세요.

(10,10)-(22,10)-(22,18)-(10,18)

사각형 넓이는 96

or

좌표를 입력하세요.

(10,10)-(14,15)-(20,8)

삼각형 넓이는 29.0

---
## 개발 설계
1. x,y position을 담을 수 있는 좌표 도메인을 만들고, 입력받은 2개의 점 위치를 구분한다.
2. x,y 좌표의 대한 valid. (0~24의 값만 받게한다.)
    1. 잘못 입력할 시 재 입력
3. 2개의 좌표 값에 대한 직선 거리를 계산한다.
4. 좌표계산기에서 실제 값을 입력 받아 결과를 출력하는 View를 구현

### 추가 개발 설계
1. 좌표 개수에 개수에 따라 어떤 도형인지 판별한다.
2. 사각형의 경우 직사각형 or 정사각형의 모양만 허용하도록 한다.
3. 사각형 넓이를 구한다.

### 2차 추가 개발 설계
1. 좌표 개수가 3개일 경우 삼각형으로 판별
2. 르
