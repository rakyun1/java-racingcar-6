# 요구 사항
## 기능 요구 사항
- 사용자가 적는 자동차 이름에 따라 자동차가 생성 된다.
- 자동차는 0-9까지 무작위 값을 구한 후 무작위 값이 4 이상일 경우 전진 한다.
- 사용자가 입력한 게임 횟수 만큼 게임을 진행한다.
- 지정 된 횟수가 끝나면 게임을 끝내고 우승자를 가린다.

## 입력 요구 사항
- 사용자는 자동차의 이름을 입력할 수 있다.
  - 이름은 5글자 이하만 가능하다.
  - 이름은 ","를 사용하여 구분한다.
- 사용자는 몇 번의 이동을 할 것인지 입력 가능하다.

## 출력 요구 사항
- 경주할 자동차의 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
- 시도할 회수는 몇회인가요?
- 실행 결과 예시
  - > 실행 결과 <br> pobi : - <br> woni : <br> jun : -

- 최종 우승자 예시
  - > 최종 우승자 : pobi, jun

## 프로그래밍 요구 사항
- 예외 처리
  - 사용자가 잘못된 값을 입력 할 경우 IllegalArgumentException 발생 후에 애플리케이션 종료
  