# 카운트 업
### 문제 설명
정수 `start_num`와 `end_num`가 주어질 때, `start_num`부터 `end_num`까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해 주세요.

### 제한사항
- 0 ≤ `start_num` ≤ `end_num` ≤ 50

### 입출력 예

| start_num | end_num | result                    |
|-----------|---------|---------------------------|
| 3         | 10      | [3, 4, 5, 6, 7, 8, 9, 10] |

### 입출력 예 설명
#### 입출력 예 #1
- 3부터 10까지의 숫자들을 담은 리스트 `[3, 4, 5, 6, 7, 8, 9, 10]`을 return 합니다.
# 회고
### 메서드 참조
메서드 참조는 일반적으로 클래스와 메서드를 :: 구문으로 연결하여 사용한다.  
:: 구문을 통해 해당 메서드를 필요한 위치에 맞는 함수형 인터페이스로 변환. 이는 자동으로 특정 메서드를 호출하는 람다 표현식으로 변경되며, 컴파일러가 메서드 참조를 필요한 자리에서 적절히 사용.
#### 메서드 참조의 네 가지 유형
- Static 메서드 참조 (ClassName::staticMethod)
> Function<String, Integer> parseInt = Integer::parseInt;

<br>

- 인스턴스 메서드 참조 (instance::instanceMethod)
> Consumer<String> printer = System.out::println;  

<br>

- 특정 객체의 인스턴스 메서드 참조 (ClassName::instanceMethod)
> BiFunction<String, String, Integer> comparator = String::compareToIgnoreCase;  

<br>

- 생성자 참조 (ClassName::new)
> Supplier<ArrayList<String>> arrayListSupplier = ArrayList::new;  