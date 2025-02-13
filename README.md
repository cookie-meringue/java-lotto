# java-lotto

로또 미션 저장소

# 구현 기능 목록

### 1. 구입 금액을 입력받는다. (완료)

- 구입 금액은 1,000 원 단위여야 한다.
- 구입 금액이 숫자가 아니면 IllegalArgumentException 을 발생시킨 후, 애플리케이션을 종료한다.
- int 오버플로우 발생 시 IllegalArgumentException 을 발생시킨 후, 애플리케이션을 종료한다.

### 2. 구입 금액에 따라 로또를 발행한다. (완료)

- 구입 금액이 1000 단위가 아니면 IllegalArgumentException 을 발생시킨 후, 애플리케이션을 종료한다.
- 구입 금액이 음수이면 IllegalArgumentException 을 발생시킨 후, 애플리케이션을 종료한다.
- 구입 금액에 따라 로또 갯수를 계산한다.
- 로또 갯수 만큼 6개의 랜덤 번호들을 생성한다.
- 발행 된 번호들이 6개가 아니면 IllegalArgumentException 을 발생시킨 후, 애플리케이션을 종료한다.
- 발행 된 번호들은 1~45 범위 사이여야 한다.
- 발행 된 번호들은 중복 되지 않아야 한다.

### 3. 발행받은 로또들을 출력한다. (완료)

- 발행받은 로또의 수를 출력한다.
- 발행받은 모든 로또를 출력한다. 이때, 오름차순으로 정렬하여 출력해야 한다.

### 4. 지난 주 당첨 번호를 입력받는다.

- 입력하는 양식이 다르면 IllegalArgumentException 을 발생시킨 후, 애플리케이션을 종료한다.
    - 구분자를 `', '` 로 하지 않은 경우
    - 구분한 문자가 정수형이 아닌 경우
- split 으로 구분한 정수를 List 로 반환한다.
    - 구분자는 `', '` 이다.

### 5. 보너스 번호를 입력받는다.

### 6. 지난 주 당첨 번호와 보너스 번호를 통해 로또 결과를 계산한다.

### 7. 계산한 로또 결과를 출력한다.

### TODO: 예외 처리

