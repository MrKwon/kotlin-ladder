# 개인 학습용 사다리 게임
## 기능 목록
### 1단계
- 사람의 이름을 입력받는 기능 -View
  - 이름은 최대 5글자이다.
  - ','로 이름을 구분하여 입력한다.
- 사다리 높이를 입력 받는 기능 - View
<br>
- 사다리를 생성하는 기능 - Model
  - 라인 겹이 겹치게 생성하지 않는다.
  - 층수(Column의 길이)는 ArrayList<Line>의 크기이다.
  - 사다리 가로줄을 객체(Line)를 생성한다
    - 난수를 생성한다.
    - 각 라인의 맨앞부터 난수를 통해 T/F로 가로줄 존재여부를 판단한다.
    - 앞의 원소에 가로줄이 존재하면 해당 원소에는 가로줄이 없다.
- 사다리를 출력하는 기능 - View
  - 출력 시 이름도 같이 출력한다.
  - 사다리 폭을 5자 글자 기준으로 조절한다.

### 2단계
- 실행결과를 입력받는 기능
- ','로 실행결과를 구분하여 입력한다.
- LadderGame에 실행결과를 붙여서 출력한다.
- 결과를 보고싶은 사람을 입력받는 기능
- players에 존재하는 사람을 입력해야 한다.
- 입력한 사람의 해당 결과를 찾는다.
- 모든 사람의 결과를 찾는다.
- 해당 결과를 출력한다.
- 모든 결과를 출력한다.